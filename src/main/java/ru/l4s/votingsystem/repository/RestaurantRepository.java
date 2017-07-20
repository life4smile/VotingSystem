package ru.l4s.votingsystem.repository;

import ru.l4s.votingsystem.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    ru.l4s.votingsystem.model.Restaurant save(ru.l4s.votingsystem.model.Restaurant restaurant);

    // false if not found
    boolean delete(int id);

    // null if not found
    ru.l4s.votingsystem.model.Restaurant get(int id);

    List<ru.l4s.votingsystem.model.Restaurant> getAll();

    default ru.l4s.votingsystem.model.Restaurant getWithMenu(int id){
        throw new UnsupportedOperationException();
    }

}
