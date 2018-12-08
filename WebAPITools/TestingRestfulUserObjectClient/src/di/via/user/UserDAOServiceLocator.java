/**
 * UserDAOServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package di.via.user;

public class UserDAOServiceLocator extends org.apache.axis.client.Service implements di.via.user.UserDAOService {

    public UserDAOServiceLocator() {
    }


    public UserDAOServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserDAOServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserDAO
    private java.lang.String UserDAO_address = "http://localhost:8080/TestingRestfulUserObject/services/UserDAO";

    public java.lang.String getUserDAOAddress() {
        return UserDAO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserDAOWSDDServiceName = "UserDAO";

    public java.lang.String getUserDAOWSDDServiceName() {
        return UserDAOWSDDServiceName;
    }

    public void setUserDAOWSDDServiceName(java.lang.String name) {
        UserDAOWSDDServiceName = name;
    }

    public di.via.user.UserDAO getUserDAO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserDAO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserDAO(endpoint);
    }

    public di.via.user.UserDAO getUserDAO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            di.via.user.UserDAOSoapBindingStub _stub = new di.via.user.UserDAOSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserDAOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserDAOEndpointAddress(java.lang.String address) {
        UserDAO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (di.via.user.UserDAO.class.isAssignableFrom(serviceEndpointInterface)) {
                di.via.user.UserDAOSoapBindingStub _stub = new di.via.user.UserDAOSoapBindingStub(new java.net.URL(UserDAO_address), this);
                _stub.setPortName(getUserDAOWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserDAO".equals(inputPortName)) {
            return getUserDAO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://user.via.di", "UserDAOService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://user.via.di", "UserDAO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserDAO".equals(portName)) {
            setUserDAOEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
