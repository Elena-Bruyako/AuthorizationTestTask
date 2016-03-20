package com.bruyako.service;

import com.bruyako.entity.User;
import com.bruyako.entity.UserRoleEnum;
import com.bruyako.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by brunyatko on 20.03.16.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private BaseRepository<User> userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = getUserByLogin(username);
        Set<GrantedAuthority> roles = new HashSet();
        roles.add(new SimpleGrantedAuthority(UserRoleEnum.USER.name()));
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getLogin(),
                user.getPassword(), roles);
        return userDetails;
    }

    public User getUserByLogin(String username) {

        List<User> list = userRepository.getAll();

        for (User user : list) {

            if (user.getLogin().equals(username)) {
                return user;
            }
        }
        throw new UsernameNotFoundException("User not found");
    }
}
