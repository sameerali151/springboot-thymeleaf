package com.learn.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.thymeleaf.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
