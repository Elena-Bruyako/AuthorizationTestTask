package com.bruyako.repository;

import com.bruyako.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
@org.springframework.stereotype.Repository
public class UserRepository implements Repository<User> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getById(int id) {
        User user = (User) sessionFactory.getCurrentSession().createQuery("select u.id from User u while u.id=:id").setParameter("id", id);
        return user;
    }

    @Override
    public List<User> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from User u").list();
    }
}
