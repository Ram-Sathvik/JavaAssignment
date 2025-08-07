package ques13.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ques13.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {}