package appServer.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import appServer.Facade;
import appServer.PersistenceCommunication;
import appServer.model.Traveller;

@Path("/users")
public class UserManagementService {
	Facade dao = Facade.getInstance();
	PersistenceCommunication persComm = new PersistenceCommunication();
	
	@POST
	@Path("/traveller")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createNewUser(Traveller user) {
			String[] travellerDetails = {"traveller", user.getUserName(), user.getPassword(), user.getEmail(), user.getFirstName(), user.getLastName(),  user.getAddress()};
			Traveller createdUser = (Traveller) dao.createNewUser(travellerDetails);
			int responseCode = persComm.addTravellerToPersistence(createdUser);
			switch(responseCode) {
			case 0:
				return Response.status(201).entity(createdUser).build();
			case 9:
				return Response.status(200).build();
			default:
				return Response.status(200).build();
			}
	}

}
