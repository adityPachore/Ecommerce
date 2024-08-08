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
import com.wu.ecommerce.repo.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {
	
	private ProductServiceImpl() {
		
	}
	private ProductRepository productRepository = 
			ProductRepositoryImpl.getInstance();
	private static ProductService productService;
	public static ProductService getInstance() {
		if(productService == null) {
			productService = new ProductServiceImpl();
		}
		return productService;
	}
	@Override
	public Product addProduct(Product product) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return productRepository.addProduct(product);
	}

	//@Override
//	public Optional<Product> getEmployeeByProductId(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Product> getProducts() throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}

	@Override
	public List<Product> getAllProductsByCategory(String cat) throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		return productRepository.getAllProductsByCategory(cat);
	}

	@Override
	public String removeProductByProductId(String id) throws IdNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return productRepository.removeProductByProductId(id);
	}

	@Override
	public Product updateProductByProductId(String id, Product product) throws SQLException {
		// TODO Auto-generated method stub
		return productRepository.updateProductByProductId(id, product);
	}
//	@Override
//	public Optional<Product[]> getProducts(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public Product getProducts(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Product> getEmployeeByProductId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
