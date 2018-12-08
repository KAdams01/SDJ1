package dk.via.user;
import java.util.ArrayList;

public class UserList {
	private ArrayList<User> users;
	
	public UserList() {
		this.users = new ArrayList<User>();
	}
	public void addUser(User user) {
		users.add(user);
	}
	public User getUser(int id) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId()==id) {
				return users.get(i);
			}
		}
		return null;
	}
	public ArrayList<User> getUsers(){
		return users;
	}
	public void deleteUser(int id) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId()==id) {
				users.remove(i);
			}
		}
	}
	public void updateUser(User user) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId()==user.getId()) {
				users.set(i, user);
			}
		}
	}
	
	

}
