package net.alanbinu.springboot.loginregistrationspringbootauthjsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.alanbinu.springboot.loginregistrationspringbootauthjsp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
