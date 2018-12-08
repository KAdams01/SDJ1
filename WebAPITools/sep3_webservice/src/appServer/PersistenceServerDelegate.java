package appServer;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.JSONObject;

import appServer.model.Traveller;

public class PersistenceServerDelegate {
	public static final int PORT = 9090;
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;

	public PersistenceServerDelegate() {
		try {
			socket = new Socket("localhost", PORT);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Failed to connect");
		}

	}
	public int addTravellerToPersistence(Traveller user) {
		JSONObject jobj = new JSONObject(user);
		jobj.put("methodName", "addTravellerToPersistence");
		System.out.println(jobj);
		try {
			oos.writeObject(jobj);
			return (int) ois.readObject();
		} catch (ClassNotFoundException e) {
			System.out.println("Response message not int");
			return 123;
		} catch (IOException e) {
			return 9;
		}
	}
}
