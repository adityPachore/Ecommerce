package com.wu.ecommerce.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.wu.ecommerce.dto.Product;
import com.wu.ecommerce.exception.DataNotFoundException;
import com.wu.ecommerce.exception.IdNotFoundException;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;
import com.wu.ecommerce.utils.DBUtils;
import com.wu.ecommerce.utils.IdComparator;

public class ProductRepositoryImpl implements ProductRepository {

	private ProductRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
//	private Set<Product> products = new TreeSet<Product>(new Comparator<Product>() {
//
//		@Override
//		public int compare(Product o1, Product o2) {
//			// TODO Auto-generated method stub
//			return o1.getProductName().compareTo(o2.getProductName());
//		}
//		
//	});
	private TreeSet<Product> products = new TreeSet<Product>
	((o1, o2) -> o1.getProductName().compareTo(o2.getProductName()));
	//private HashSet<Product> prset = new HashSet<Product>();
	//private Product[] products = new Product[10];
//	private static int counter = -1;
	private static ProductRepository productRepository;
	
	public static ProductRepository getInstance() {
		
		if(productRepository == null) {
			// create the object
			productRepository = new ProductRepositoryImpl();
			//return productRepository;
		}
		return productRepository;
	}

	@Override
	public Product addProduct(Product product) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String insertStatement = "insert into newProduct (productId, productName,Categoryname, price) values(?,?,?,?)";
		Connection connection = DBUtils.getInstance().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(insertStatement);
		preparedStatement.setString(1, product.getProductId());
		preparedStatement.setString(2, product.getProductName());
		preparedStatement.setString(3, product.getCategoryName());
		preparedStatement.setFloat(4, product.getPrice());
//		boolean result = products.add(product);
//		System.out.println(result);
//		return product;
		int result = preparedStatement.executeUpdate();
		if(result > 0) {
			return product;
		}
		else {
			return null;
		}
	}

	

	@Override
	public Product getProducts(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Product p = null;
		
		return products.stream().filter(e -> e.getProductId().equals(id)).findFirst().
				orElseThrow(() -> new IdNotFoundException("id not found"));
	}
	@Override
	public String removeProductByProductId(String id) throws IdNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		Product product = this.getProdcutByProductId(id);

//		boolean result = products.remove(product);
//
//		if (result) {
//			return "Deleted Product";
//		}
		
        Connection connection = DBUtils.getInstance().getConnection();
		
		String sql = "delete from newproduct where PRODUCTID = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, id);
		
		int res = preparedStatement.executeUpdate();
		
		if(res > 0)
		{
			System.out.println("Deleted Brother");
		}

		return "Falied";
	}

	@Override
	public Product updateProductByProductId(String id, Product product) throws SQLException {
		// TODO Auto-generated method stub

//		for (Product pr : products) {
//			if (pr.getProductId().equals(id)) {
//				pr = product;
//			}
//		}
//
//		return product;
		
		Connection connection = DBUtils.getInstance().getConnection();
		System.out.println(connection);
		
		String sql = "update newproduct set PRODUCTNAME = ? , PRICE = ?, CATEGORYNAME = ? where PRODUCTID = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, product.getProductName());
		preparedStatement.setFloat(2, product.getPrice());
		preparedStatement.setString(3, product.getCategoryName());
		preparedStatement.setString(4, product.getProductId());
		
		
		int result = preparedStatement.executeUpdate();
		
		if(result > 0)
		{
			System.out.println("Updated Brother");
		}
		else
		{
			System.out.println("Dard bhai");
		}
		
		return null;
	}
@Override
	public List<Product> getAllProductsByCategory(String category) throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
	    // Define the SQL query with a placeholder for the category parameter
	    String query = "SELECT * FROM newproduct WHERE CATEGORYNAME = ?";
	    
	    // Get the database connection
	    Connection connection = DBUtils.getInstance().getConnection();
	    
	    // Prepare the statement with the query
	    PreparedStatement preparedStatement = connection.prepareStatement(query);
	    
	    // Set the category parameter for the query
	    preparedStatement.setString(1, category);
	    
	    // Execute the query
	    ResultSet resultSet = preparedStatement.executeQuery();
	    
	    // Create a list to hold the products
	    List<Product> products = new ArrayList<>();
	    
	    // Process the result set
	    while (resultSet.next()) {
	        Product product = new Product();
	        product.setProductId(resultSet.getString("PRODUCTID"));
	        product.setProductName(resultSet.getString("PRODUCTNAME"));
	        product.setPrice(resultSet.getFloat("price"));
	        product.setCategoryName(resultSet.getString("CATEGORYNAME"));
	        products.add(product);
	    }
	    
	    // Check if the list is empty and throw an exception if it is
	    if (products.isEmpty()) {
	        throw new DataNotFoundException("No products found for the given category");
	    }
	    
	    // Return the list of products
	    return products;
	}
	
	
//	public List<Product> getAllProductsByCategory(String cat) throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
//		// TODO Auto-generated method stub
//		List<Product> temp = products.
//		stream().
//		filter(e -> e.getCategoryName().equals(cat)).collect(Collectors.toList());
//		//toList();	// toList() is introduced from java16
//		
//		String query = "select * from newproduct where category = ?";
//		
//		
//		Connection connection = DBUtils.getInstance().getConnection();
//		PreparedStatement preparedStatement = connection.prepareStatement(query);
//		ResultSet resultSet = preparedStatement.executeQuery();
//		
//		preparedStatement.setString(1,cat );
//		List<Product> products = new ArrayList<Product>();
//		while(resultSet.next()) {
//			Product product = new Product();
//			product.setProductId(resultSet.getString("productid"));
//			product.setProductName(resultSet.getString("productname"));
//			product.setPrice(resultSet.getFloat("price"));
//			product.setCategoryName(resultSet.getString("categoryname"));
//			products.add(product);
//		}
//		
//		if(products.isEmpty()) {
//			throw new DataNotFoundException("no data");
//		}
//		else {
////			return Optional.ofNullable(temp).filter(l -> !l.isEmpty()).
////					orElseThrow(() -> new DataNotFoundException("Data is not there"));
//		}
//		
//	}



//	@Override
//	public Product updateProductByProductId(String id, Product product) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Product> getProducts() throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
		// TODO Auto-generated method stub
		String query = "select * from newproduct";
		Connection connection = DBUtils.getInstance().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Product> products = new ArrayList<Product>();
		
		while(resultSet.next()) {
			Product product = new Product();
			product.setProductId(resultSet.getString("productid"));
			product.setProductName(resultSet.getString("productname"));
			product.setPrice(resultSet.getFloat("price"));
			product.setCategoryName(resultSet.getString("categoryname"));
			products.add(product);
			
		}
		return (List<Product>) Optional.ofNullable(products).
				filter(l -> !l.isEmpty()).
				orElseThrow(() -> new DataNotFoundException("Data is not there"));
	}

	@Override
	public Optional<Product> getEmployeeByProductId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
//	public List<Product> getAllProductsByCategory(String cat)
//			throws DataNotFoundException, SQLException, InvalidIdException, InvalidPriceException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public Optional<Product[]> getProducts() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
