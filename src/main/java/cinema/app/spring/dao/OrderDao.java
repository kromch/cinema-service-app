package cinema.app.spring.dao;

import cinema.app.spring.model.Order;
import cinema.app.spring.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
