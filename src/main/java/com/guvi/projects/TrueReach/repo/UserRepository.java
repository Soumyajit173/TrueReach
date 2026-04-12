package com.guvi.projects.TrueReach.repo;

import com.guvi.projects.TrueReach.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String username);

    User findByEmailIgnoreCase(String email);
}
