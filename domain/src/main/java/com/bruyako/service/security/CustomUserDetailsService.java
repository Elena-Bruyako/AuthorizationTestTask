package com.bruyako.service.security;

import com.bruyako.entity.User;
import com.bruyako.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
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
        roles.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new org.springframework.security.core.userdetails.User(
                user.getLogin(),
                user.getPassword(),
                roles);
    }

    public User getUserByLogin(String username) {
        for (User user : userRepository.getAll()) {
            if (user.getLogin().equals(username)) {
                return user;
            }
        }
        throw new UsernameNotFoundException("User not found");
    }
}
