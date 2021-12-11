package net.alanbinu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.alanbinu.springboot.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{

}
