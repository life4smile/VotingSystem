package ru.l4s.votingsystem.repository;

import ru.l4s.votingsystem.model.Menu;

import java.time.LocalDate;
import java.util.List;

public interface MenuRepository {
    // null if updated menu do not belong to restaurantId
    Menu save(Menu menu, int restaurantId);

    // false if menu do not belong to restaurantId
    boolean delete(int id, int restaurantId);

    // null if menu do not belong to restaurantId
    Menu get(int id, int restaurantId);

    // ORDERED date
    List<Menu> getAll(int restaurantId);

    Menu getToday(int restaurantId, LocalDate currentDate);

    default Menu getWithRestaurant(int id, int restaurantId) {
        throw new UnsupportedOperationException();
    }
}
