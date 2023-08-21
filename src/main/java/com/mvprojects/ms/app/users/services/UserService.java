package com.mvprojects.ms.app.users.services;

import java.util.Optional;

import com.mvprojects.ms.app.users.models.entity.User;

public interface UserService {

	public Iterable<User> findAll();
	
	public Optional<User> findBy(Long id);
	
	public User save (User user);
	
	public void deleteById(Long id);
}
