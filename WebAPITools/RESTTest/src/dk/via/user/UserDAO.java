package dk.via.user;
import java.util.ArrayList;

public class UserDAO {
	private UserList users;
	private static UserDAO userDAO;
	
	private UserDAO() {
		users = new UserList();
		User firstUser = new User();
		firstUser.setId(1);
		firstUser.setEmail("test");
		firstUser.setPassword("1234");
		users.addUser(firstUser);
	}
	public static UserDAO getInstance() {
		if(userDAO == null) {
			userDAO = new UserDAO();
		} 
		return userDAO;
	}
	
	public User getUser(int id) {
		return users.getUser(id);
	}
	public ArrayList<User> getUsers(){
		return users.getUsers();
	}
	public User addUser(String email, String password) {
		User tempUser = new User();
		tempUser.setEmail(email);
		tempUser.setPassword(password);
		users.addUser(tempUser);
		return tempUser;
	}
	public User updateUser(User user) {
		return users.updateUser(user);
	}
	public int deleteUser(int id) {
		return users.deleteUser(id);
	}

}
