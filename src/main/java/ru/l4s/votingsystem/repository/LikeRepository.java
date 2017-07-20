package ru.l4s.votingsystem.repository;

import ru.l4s.votingsystem.model.Like;

import java.util.List;

public interface LikeRepository {

    ru.l4s.votingsystem.model.Like save(ru.l4s.votingsystem.model.Like like);

    // false if not found
    boolean delete(int id);

    // null if not found
    ru.l4s.votingsystem.model.Like get(int id);

    List<ru.l4s.votingsystem.model.Like> getAll();

    List<ru.l4s.votingsystem.model.Like> getToday();
}
