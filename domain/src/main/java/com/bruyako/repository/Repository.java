package com.bruyako.repository;


import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
public interface Repository <T> {

    T getById(int id);

    List<T> getAll();
}
