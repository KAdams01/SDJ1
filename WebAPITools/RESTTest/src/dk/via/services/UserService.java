package dk.via.services;

import java.io.IOException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dk.via.user.User;
import dk.via.user.UserDAO;

@Path("/users")
public class UserService {
	private UserDAO dao = UserDAO.getInstance();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User> readUsers() {
		return dao.getUsers();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response readUser(@PathParam("id") String id) throws IOException {
		try {
			User user = dao.getUser(Integer.parseInt(id));
			return Response.status(200).entity(user).build();
		} catch (NumberFormatException e) {
			return Response.status(400).build();
		} catch (IndexOutOfBoundsException e) {
			return Response.status(404).build();
		}
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(User user) {
		User createdUser = dao.addUser(user.getEmail(), user.getPassword());
		return Response.status(201).entity(createdUser).build();
	}

	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUser(@PathParam("id")String id, User user) {
		User updatedUser = dao.getUser(Integer.parseInt(id));
		if (updatedUser == null) {
			dao.addUser(user.getEmail(), user.getPassword());
			return Response.status(201).entity(updatedUser).build();
		} else {
			dao.updateUser(user);
			return Response.status(202).entity(dao.getUser(Integer.parseInt(id))).build();
		}

	}
	
	@DELETE
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteUser(@PathParam("id")String id) {
		int response = dao.deleteUser(Integer.parseInt(id));
		if(response == 0) {
			return Response.status(204).build();
		}else {
			return Response.status(201).build();
		}
	}

}
