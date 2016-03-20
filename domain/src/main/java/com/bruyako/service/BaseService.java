package com.bruyako.service;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
public interface BaseService <T> {

    T getById(int id);

    List<T> getAll();
}
