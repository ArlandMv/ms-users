package com.mvprojects.ms.app.users.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvprojects.ms.app.users.models.entity.User;
import com.mvprojects.ms.app.users.models.entity.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<User> findAll() {
		return repository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<User> findBy(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
