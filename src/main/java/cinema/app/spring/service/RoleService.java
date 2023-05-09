package cinema.app.spring.service;

import cinema.app.spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
