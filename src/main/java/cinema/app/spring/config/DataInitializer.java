package cinema.app.spring.config;

import cinema.app.spring.model.Role;
import cinema.app.spring.model.User;
import cinema.app.spring.service.RoleService;
import cinema.app.spring.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRole(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRole(Role.RoleName.USER);
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@hotmail.com");
        user.setPassword("AdmiN_dj539fdd23sA");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
    }
}
