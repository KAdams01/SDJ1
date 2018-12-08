package di.via.user;

public class UserDAOProxy implements di.via.user.UserDAO {
  private String _endpoint = null;
  private di.via.user.UserDAO userDAO = null;
  
  public UserDAOProxy() {
    _initUserDAOProxy();
  }
  
  public UserDAOProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserDAOProxy();
  }
  
  private void _initUserDAOProxy() {
    try {
      userDAO = (new di.via.user.UserDAOServiceLocator()).getUserDAO();
      if (userDAO != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userDAO)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userDAO != null)
      ((javax.xml.rpc.Stub)userDAO)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public di.via.user.UserDAO getUserDAO() {
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO;
  }
  
  public java.lang.Object[] getUsers() throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO.getUsers();
  }
  
  public di.via.user.User getUser(int id) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    return userDAO.getUser(id);
  }
  
  public void deleteUser(int id) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    userDAO.deleteUser(id);
  }
  
  public void updateUser(di.via.user.User user) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    userDAO.updateUser(user);
  }
  
  public void addUser(di.via.user.User user) throws java.rmi.RemoteException{
    if (userDAO == null)
      _initUserDAOProxy();
    userDAO.addUser(user);
  }
  
  
}