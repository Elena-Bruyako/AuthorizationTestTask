package com.bruyako.repository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
public abstract class BaseRepository <T> {

    @Autowired
    protected SessionFactory sessionFactory;

    public abstract T getById(int id);

    public abstract List<T> getAll();
}
