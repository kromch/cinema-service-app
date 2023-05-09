package cinema.app.spring.service;

import cinema.app.spring.model.MovieSession;
import cinema.app.spring.model.ShoppingCart;
import cinema.app.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
