package com.bruyako.service;

import com.bruyako.entity.User;
import com.bruyako.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by brunyatko on 20.03.16.
 */
@Transactional
@Service
public class UserService implements BaseService <User> {

    @Autowired
    private BaseRepository<User> userRepository;

    @Override
    public User getById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }
}
