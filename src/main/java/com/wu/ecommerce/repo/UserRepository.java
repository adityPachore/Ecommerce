package com.wu.ecommerce.repo;
import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.exception.IdNotFoundException;
 
import java.sql.SQLException;
import java.util.Optional;
 
public interface UserRepository {
 
	public User addUser(User user) throws SQLException;
	//A container object which may or may not contain a non-null value. 
	//If a value is present, isPresent() returns true.
	//Whenever we are returning/getting null then that object should be wrapped by optional
	public User getUserByUserId(String id) throws Exception;
	public Optional<User[]> getUsers();
	public Optional<User[]> getAllUsersByAddress(String cat);
	public String removeUserByUserId(String id);
	public User updateUserByUserId(String id, User user);
	/*default void display() 	//This will work for JAVA8 or above
	{
		System.out.println("Hello from interface");
	}
	*/
}