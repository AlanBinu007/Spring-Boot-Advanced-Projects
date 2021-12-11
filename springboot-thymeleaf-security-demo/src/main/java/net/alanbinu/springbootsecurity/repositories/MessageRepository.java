package net.alanbinu.springbootsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.alanbinu.springbootsecurity.entities.Message;


public interface MessageRepository extends JpaRepository<Message, Integer>{

}
