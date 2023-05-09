package cinema.app.spring.service;

import cinema.app.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
