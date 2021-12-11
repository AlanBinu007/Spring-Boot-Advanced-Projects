package net.alanbinu.springboot2.springboot2webappjsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.alanbinu.springboot2.springboot2webappjsp.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
