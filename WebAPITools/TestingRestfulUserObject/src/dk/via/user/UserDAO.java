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
			System.out.println("DAOCreated");
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
	public void addUser(User user) {
		users.addUser(user);
	}
	public void updateUser(User user) {
		users.updateUser(user);
	}
	public void deleteUser(int id) {
		users.deleteUser(id);
	}

}
