package appServer;

import appServer.model.Administrator;
import appServer.model.Staff;
import appServer.model.Traveller;
import appServer.model.User;

public class Facade {
	private static Facade facade;
	
	private Facade() {

	}
	public static Facade getInstance() {
		if(facade == null) {
			facade = new Facade();
		}
		return facade;
	}

	public User createNewUser(String[] userDetails) {
		User newUser = null;
		switch (userDetails[0]) {
		case "traveller":
			newUser = new Traveller(userDetails[1], userDetails[2], userDetails[3], userDetails[4], userDetails[5],
					userDetails[6]);
			break;
		case "staff":
			newUser = new Staff(userDetails[1], userDetails[2], userDetails[3], userDetails[4], userDetails[5],
					userDetails[6]);
			break;
		case "admin":
			newUser = new Administrator(userDetails[1], userDetails[2], userDetails[3], userDetails[4], userDetails[5]);
			break;
		}
		return newUser;
	}

}
