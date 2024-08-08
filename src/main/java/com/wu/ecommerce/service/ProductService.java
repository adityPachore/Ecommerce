package com.wu.ecommerce.service;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import com.wu.ecommerce.dto.Product;
import com.wu.ecommerce.exception.DataNotFoundException;
import com.wu.ecommerce.exception.IdNotFoundException;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;
import com.wu.ecommerce.repo.ProductRepository;

public interface ProductService extends ProductRepository {
	public Product addProduct(Product product) throws SQLException, ClassNotFoundException;
	public Optional<Product> getEmployeeByProductId(String id);
	
	public List<Product> getProducts() throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException;
	//public Optional<Product[]> getAllProductsByCategory(String cat);
	
	public String removeProductByProductId(String id) throws IdNotFoundException, SQLException;
	public Product updateProductByProductId(String id, Product product) throws SQLException;
	//@Override
	//@Override
	
	default void display() {
		System.out.println("hello from interfaces");
	}
}
