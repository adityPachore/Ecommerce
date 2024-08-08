package com.wu.ecommerce;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import com.wu.ecommerce.dto.Order;
import com.wu.ecommerce.dto.Product;
import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.exception.DataNotFoundException;
import com.wu.ecommerce.exception.InvalidIdException;
import com.wu.ecommerce.exception.InvalidPriceException;
import com.wu.ecommerce.service.OrderService;
import com.wu.ecommerce.service.OrderServiceImpl;
import com.wu.ecommerce.service.ProductService;
import com.wu.ecommerce.service.ProductServiceImpl;
import com.wu.ecommerce.service.UserService;
import com.wu.ecommerce.service.UserServiceImpl;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//switch case
		//while
		//scanner
		
		//Scanner scanner = new Scanner(System.in);
		ProductService productService = ProductServiceImpl.getInstance();
//		List<Product> result = productService.getProducts();
//	    result.forEach(e -> System.out.println(e));
		Product np = new Product("food2", "Dard", "Hello", 2);
		
	    productService.updateProductByProductId("food2", np);
	    
	    System.out.println("Hello  ji");
//	    List<Product> result = productService.getProducts();
//	    result.forEach(e -> System.out.println(e));
	  
//	    List<Product> ans =   productService.getAllProductsByCategory("Sagar");
//	// 
//	    ans.forEach(e -> System.out.println(e));
		//productService.removeProductByProductId("food1");
		//List<Product> result = productService.getProducts();
//		System.out.println();
//	    result.forEach(e -> System.out.println(e));
//		productService.addProduct(new Product("food4", "foodName1", "Kitchen", 5f));
//		UserService userService = UserServiceImpl.getInstance();
//		userService.addUser(new User("User1", "aaba", "aababa"));
		
		//int choice = 0;
//		while(true) {
//			System.out.println("Enter the choice");
//			choice = scanner.nextInt();
//			switch (choice) {
//			case 1:
//				//add new product
//				productService.addProduct(new Product("food1", "foodName1", "Kitchen", 5));
//				//break;
//			case 2:
//				//getProductByID
//				try {
//			           List<Product> li = productService.getProducts();
//			           li.forEach(e -> System.out.println(e));
//				}
//				catch(DataNotFoundException de)
//		        {
//		            System.out.println(de.getMessage());
//		        }
//			case 3:
//				//getproductbycategory
//				try {
//					List<Product> li2 = productService.getAllProductsByCategory("kitchen");
//					li2.forEach(e -> System.out.println(e));
//				}
//				catch(DataNotFoundException de)
//		        {
//		            System.out.println(de.getMessage());
//		        }
//				
//			case 4:
//				//removeProduct
//				System.out.println(productService.removeProductByProductId("abcde"));
//
//			default:
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//OrderService orderService = OrderServiceImpl.getInstance();
		//productService.addProduct(new Product("abcde", "hggjf", 7878, "kitchen"));
		//orderService.addProduct(new Order("abc", "pqr", 567, "abc12", "13dd", "aer1"));
		//Optional<Product> optional = productService.getEmployeeByProductId("hggjf");
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
		
		
//		try {
//	           List<Product> li = productService.getProducts();
//	           li.forEach(e -> System.out.println(e));
//	           List<Product> li2 = productService.getAllProductsByCategory("kitchen");
//	           System.out.println(productService.removeProductByProductId("abcde"));
//	           //li2.forEach(e -> System.out.println(e));
//	        }
//	        catch(DataNotFoundException de)
//	        {
//	            System.out.println(de.getMessage());
//	        }
	     
		
//		try {
//			Product product = new Product("hifh", "asda", 2,"cat1");
//			System.out.println(product);
//			product.toString();
//			System.out.println(product.hashCode());
//			System.out.println(Integer.toHexString(product.hashCode()));
//		}
//		catch (InvalidPriceException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} 
	}
	
}
		
		//{
//		int a = 10 / 0;// will throw an exception
//		//jvm will create and handle it 
//		System.out.println(a);
//		int result = test();
//		System.out.println(result);
		
	//}
	//public static int test() {
//		int a = 0;
//		int b[] = new int[10];
//		
//		try {
//			//System.out.println("inside the try");
//			a = 10 / 5;
//			b[11] = 0;
//			System.out.println("not here");
//			return a;
//			
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			//return a;
//		}
//		catch (ArithmeticException e){
//			a = 10 / 2;
//			System.out.println("inside the catch");
//			return a;
//		}
//		catch(RuntimeException e) {
//			
//		}
//		catch (Exception e) {
//			
//		}
//		catch (Throwable e) {
//			
//		}
////		catch (Object o) { // not allowed this to catch the exception of object type
////			No exception of type Object can be thrown; an exception type must be a subclass of Throwable
////		}
//		
//		finally {
//			System.out.println("hello");
//			//a = 3;
//			//return a;
//			
//		}
//		return a;
//		
//	}


