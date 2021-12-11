package net.springboot.alanbinu.service;

import java.util.List;

import net.springboot.alanbinu.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}
