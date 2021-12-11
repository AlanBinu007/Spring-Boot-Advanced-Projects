package net.springboot.alanbinu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.springboot.alanbinu.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
