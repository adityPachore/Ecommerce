package com.wu.ecommerce.repo;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;
 
import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.exception.IdNotFoundException;
import com.wu.ecommerce.utils.DBUtils;
 
public class UserRepositoryImpl implements UserRepository {
	private UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	//private User[] users = new User[10];
	private ArrayList<User> users = new ArrayList<User>();

	//Implementation objects must be handled by interface reference 
	private static UserRepository userRepository;
	private static int counter = -1;
	public static UserRepository getInstance() {
		if(userRepository==null)
		{
			//create the object
			userRepository = new UserRepositoryImpl();
		}
		return userRepository;
	}
 
	
	public User addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		String insertStatement = "insert into user_table (userID, userName, address) values(?,?,?)";
		Connection connection = DBUtils.getInstance().getConnection();
		//prepared statement:
				PreparedStatement preparedStatement = connection.prepareStatement(insertStatement);
				preparedStatement.setString(1, user.getUserId());
				preparedStatement.setString(2, user.getUserName());
				preparedStatement.setString(3, user.getAddress());
				int result = preparedStatement.executeUpdate();
				if(result>0)
				{
					return user;
				}
				else
				{
					return null;
				}
	}
 
	public User getUserByUserId(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		User p = null;
		return users.stream().filter(e->e.getUserId().equals(id))
				.findFirst().orElseThrow(()->new IdNotFoundException("id not found"));
	}
 
	public Optional<User[]> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
 
	public Optional<User[]> getAllUsersByAddress(String cat) {
		// TODO Auto-generated method stub
		return null;
	}
 
	public String removeUserByUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}
 
	public User updateUserByUserId(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}


}