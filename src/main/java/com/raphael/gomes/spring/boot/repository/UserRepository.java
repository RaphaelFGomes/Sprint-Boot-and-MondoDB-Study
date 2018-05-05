package com.raphael.gomes.spring.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.raphael.gomes.spring.boot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
