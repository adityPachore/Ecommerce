package com.wu.ecommerce.repo;

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

public interface ProductRepository {
	
	public Product addProduct(Product product) throws SQLException, ClassNotFoundException;
	public Optional<Product> getEmployeeByProductId(String id);
	
	public Product getProducts(String id) throws IdNotFoundException;
	public List<Product> getAllProductsByCategory(String cat) throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException;
	
	public String removeProductByProductId(String id) throws IdNotFoundException, SQLException;
	public Product updateProductByProductId(String id, Product product) throws SQLException;
	default void display() {
		System.out.println("hello from interfaces");
	}
//	public default List<Product> getAllProductByCategory(String cat) throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
//		Object productRepository = null;
//		// TODO Auto-generated method stub
//		return ((ProductRepository) productRepository).getAllProductByCategory(cat);
//	}
	List<Product> getProducts() throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException;
}
