package cinema.app.spring.service.impl;

import cinema.app.spring.model.Role;
import cinema.app.spring.model.User;
import cinema.app.spring.service.AuthenticationService;
import cinema.app.spring.service.RoleService;
import cinema.app.spring.service.ShoppingCartService;
import cinema.app.spring.service.UserService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final ShoppingCartService shoppingCartService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     ShoppingCartService shoppingCartService,
                                     RoleService roleService) {
        this.userService = userService;
        this.shoppingCartService = shoppingCartService;
        this.roleService = roleService;
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        userService.add(user);
        shoppingCartService.registerNewShoppingCart(user);
        user.setRoles(Set.of(roleService.getByName(Role.RoleName.USER.name())));
        return user;
    }
}
