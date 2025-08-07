package com.ThymeleafAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ThymeleafAssignment.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}