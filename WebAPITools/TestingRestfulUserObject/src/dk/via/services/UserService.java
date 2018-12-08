package dk.via.services;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dk.via.user.User;
import dk.via.user.UserDAO;

@Path("/users/")
public class UserService {
	private UserDAO dao = UserDAO.getInstance();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User> readUsers(){
		return dao.getUsers();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response readUser(@PathParam("id") String id) throws IOException{
		try {
			User user = dao.getUser(Integer.parseInt(id));
			return Response.status(200).entity(user).build();
		} catch (NumberFormatException e) {
			return Response.status(400).build();
		} catch (IndexOutOfBoundsException e) {
			return Response.status(404).build();
		}
	}

}
