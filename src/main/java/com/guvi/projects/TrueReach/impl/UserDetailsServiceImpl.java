package com.guvi.projects.TrueReach.impl;

import com.guvi.projects.TrueReach.model.User;
import com.guvi.projects.TrueReach.repo.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {


        User user = userRepository.findByEmailIgnoreCase(email);

        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + email);
        }

        // ✅ Convert roles properly
//        String[] roles = user.getRoles()
//                .stream()
//                .map(Enum::name) // Enum → String
//                .toArray(String[]::new);



        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getName())
                .password(user.getPassword())
                .roles(user.getRoles().getFirst().name())
                .build();
    }
}