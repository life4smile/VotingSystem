package ru.l4s.votingsystem.repository;

import ru.l4s.votingsystem.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant);

    // false if not found
    boolean delete(int id);

    // null if not found
    Restaurant get(int id);

    List<Restaurant> getAll();

    default Restaurant getWithMenu(int id){
        throw new UnsupportedOperationException();
    }

}
