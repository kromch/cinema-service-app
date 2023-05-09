package cinema.app.spring.service;

import cinema.app.spring.model.Order;
import cinema.app.spring.model.ShoppingCart;
import cinema.app.spring.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
