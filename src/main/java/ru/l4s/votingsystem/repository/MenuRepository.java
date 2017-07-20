package ru.l4s.votingsystem.repository;

import ru.l4s.votingsystem.model.Menu;

import java.time.LocalDate;
import java.util.List;

public interface MenuRepository {
    // null if updated menu do not belong to restaurantId
    ru.l4s.votingsystem.model.Menu save(ru.l4s.votingsystem.model.Menu menu, int restaurantId);

    // false if menu do not belong to restaurantId
    boolean delete(int id, int restaurantId);

    // null if menu do not belong to restaurantId
    ru.l4s.votingsystem.model.Menu get(int id, int restaurantId);

    // ORDERED date
    List<ru.l4s.votingsystem.model.Menu> getAll(int restaurantId);

    ru.l4s.votingsystem.model.Menu getToday(int restaurantId, LocalDate currentDate);

    default ru.l4s.votingsystem.model.Menu getWithRestaurant(int id, int restaurantId) {
        throw new UnsupportedOperationException();
    }
}
