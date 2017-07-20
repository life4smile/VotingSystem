package ru.l4s.votingsystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.l4s.votingsystem.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public User save(User user) {
        if (user.isNew()) {
            em.persist(user);
            return user;
        }
        else {
            return em.merge(user);
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        Query query = em.createQuery("DELETE FROM User u WHERE u.id=:id");
        return query.setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public User get(int id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> getAll() {
        Query query = em.createQuery("SELECT u From User u ORDER BY u.name, u.email");
        return query.getResultList();
    }
}
