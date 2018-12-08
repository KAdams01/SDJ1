package appServer;

import java.rmi.RemoteException;

import appServer.model.Traveller;
import appServer.model.User;
import persistenceShared.RemotePersistence;

public class PersistenceCommunication implements RemotePersistence {
	private PersistenceServerDelegate serverDelegate;
	
	public PersistenceCommunication() {
		serverDelegate = new PersistenceServerDelegate();
	}
	@Override
	public int queryPersistenceForUserName(String userName) {
//		String[] user = {userName};
//		try {
//			return serverDelegate.doOperation("query-username", user);
//		} catch (RemoteException e) {
			return 9;
//		}
	}

	@Override
	public int addTravellerToPersistence(Traveller userDetails) {
		return serverDelegate.addTravellerToPersistence(userDetails);
	}

}
