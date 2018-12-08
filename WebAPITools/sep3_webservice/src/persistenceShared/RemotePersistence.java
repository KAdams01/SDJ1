package persistenceShared;

import appServer.model.Traveller;

public interface RemotePersistence {
	public int queryPersistenceForUserName(String userName);
	public int addTravellerToPersistence(Traveller userDetails);
}
