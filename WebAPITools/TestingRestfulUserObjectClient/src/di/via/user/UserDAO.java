/**
 * UserDAO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package di.via.user;

public interface UserDAO extends java.rmi.Remote {
    public java.lang.Object[] getUsers() throws java.rmi.RemoteException;
    public di.via.user.User getUser(int id) throws java.rmi.RemoteException;
    public void deleteUser(int id) throws java.rmi.RemoteException;
    public void updateUser(di.via.user.User user) throws java.rmi.RemoteException;
    public void addUser(di.via.user.User user) throws java.rmi.RemoteException;
}
