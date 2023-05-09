package cinema.app.spring.dao.impl;

import cinema.app.spring.dao.AbstractDao;
import cinema.app.spring.dao.CinemaHallDao;
import cinema.app.spring.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
