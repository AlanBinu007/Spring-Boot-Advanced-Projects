package net.alanbinu.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.alanbinu.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
