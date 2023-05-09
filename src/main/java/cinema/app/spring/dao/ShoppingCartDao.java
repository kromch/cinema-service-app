package cinema.app.spring.dao;

import cinema.app.spring.model.ShoppingCart;
import cinema.app.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
