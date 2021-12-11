package net.alanbinu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.alanbinu.springboot.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
