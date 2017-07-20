package ru.l4s.votingsystem.repository;

import java.util.List;

public interface UserRepository {

    ru.l4s.votingsystem.model.User save(ru.l4s.votingsystem.model.User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    ru.l4s.votingsystem.model.User get(int id);

    List getAll();
}
