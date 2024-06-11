package com.CineMan.cineman.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.CineMan.cineman.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    // User findByUser
    // You can add additional query methods as needed
}

