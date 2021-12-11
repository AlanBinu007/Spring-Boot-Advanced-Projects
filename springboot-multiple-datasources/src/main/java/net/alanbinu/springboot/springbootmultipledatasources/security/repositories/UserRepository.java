/**
 * 
 */
package net.alanbinu.springboot.springbootmultipledatasources.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import net.alanbinu.springboot.springbootmultipledatasources.security.entities.User;


public interface UserRepository extends JpaRepository<User, Integer>
{
	
}

