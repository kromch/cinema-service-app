package cinema.app.spring.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String ADMIN_ROLE = "ADMIN";
    private static final String USER_ROLE = "USER";
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(UserDetailsService userDetailsService,
                          PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest().authenticated()
                .antMatchers(HttpMethod.POST,"/register").permitAll()
                .antMatchers(HttpMethod.GET,
                        "/cinema-halls/*", "/movies/*", "/movie-sessions/available/*")
                .hasAnyRole(ADMIN_ROLE, USER_ROLE)
                .antMatchers(HttpMethod.POST,
                        "/cinema-halls/*", "/movies/*", "/movie-sessions/*").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.PUT, "/movie-sessions/*").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.DELETE, "/movie-sessions/*").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET, "/users/by-email/*").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET,
                        "/orders/*", "/shopping-carts/by-user/*").hasRole(USER_ROLE)
                .antMatchers(HttpMethod.POST,"/orders/complete/*").hasRole(USER_ROLE)
                .antMatchers(HttpMethod.PUT, "/shopping-carts/movie-sessions/*").hasRole(USER_ROLE)
                .and()
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
