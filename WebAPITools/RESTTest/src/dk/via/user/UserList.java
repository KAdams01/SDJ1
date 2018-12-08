package dk.via.user;
import java.util.ArrayList;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

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
	public int deleteUser(int id) {
		int temp = 0;
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId()==id) {
				users.remove(i);
				temp = 1;
			}else {
				temp = 0;
			}
		}
		return temp;
	}
	public User updateUser(User user) {
		User temp = null;
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId()==user.getId()) {
				users.set(i, user);
				temp = users.get(i);
			}
		}
		return temp;
	}
}
