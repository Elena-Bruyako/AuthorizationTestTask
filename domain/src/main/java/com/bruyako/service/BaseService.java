package com.bruyako.service;

import com.bruyako.entity.User;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
public interface BaseService {

    User getById(int id);

    List<User> getAll();
}
