package com.bruyako.repository;

import com.bruyako.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
@Transactional
@Repository
public class UserRepository extends BaseRepository <User> {

    @Override
    public User getById(int id) {
        User user = (User) sessionFactory.getCurrentSession()
                .createQuery("select u.id from User u where u.id=:id")
                .setParameter("id", id);

        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> users = sessionFactory.getCurrentSession()
                .createQuery("from User u")
                .list();

        return users;
    }
}
