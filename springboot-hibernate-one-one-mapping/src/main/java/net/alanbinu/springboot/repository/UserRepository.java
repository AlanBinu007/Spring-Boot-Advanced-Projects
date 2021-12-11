package net.alanbinu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.alanbinu.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
