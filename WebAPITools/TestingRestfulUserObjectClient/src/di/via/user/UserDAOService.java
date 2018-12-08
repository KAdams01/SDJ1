/**
 * UserDAOService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package di.via.user;

public interface UserDAOService extends javax.xml.rpc.Service {
    public java.lang.String getUserDAOAddress();

    public di.via.user.UserDAO getUserDAO() throws javax.xml.rpc.ServiceException;

    public di.via.user.UserDAO getUserDAO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
