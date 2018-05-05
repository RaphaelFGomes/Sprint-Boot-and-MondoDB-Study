package com.raphael.gomes.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.gomes.spring.boot.domain.User;
import com.raphael.gomes.spring.boot.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll () {
		return repo.findAll();
	}
}
