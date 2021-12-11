package com.alanbinu.springbootcrudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alanbinu.springbootcrudrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
