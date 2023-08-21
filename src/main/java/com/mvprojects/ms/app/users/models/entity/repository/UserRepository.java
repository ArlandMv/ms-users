package com.mvprojects.ms.app.users.models.entity.repository;

import org.springframework.data.repository.CrudRepository;

import com.mvprojects.ms.app.users.models.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
