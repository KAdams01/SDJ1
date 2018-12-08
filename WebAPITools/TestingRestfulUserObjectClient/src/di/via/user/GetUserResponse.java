/**
 * GetUserResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package di.via.user;

public class GetUserResponse  implements java.io.Serializable {
    private di.via.user.User getUserReturn;

    public GetUserResponse() {
    }

    public GetUserResponse(
           di.via.user.User getUserReturn) {
           this.getUserReturn = getUserReturn;
    }


    /**
     * Gets the getUserReturn value for this GetUserResponse.
     * 
     * @return getUserReturn
     */
    public di.via.user.User getGetUserReturn() {
        return getUserReturn;
    }


    /**
     * Sets the getUserReturn value for this GetUserResponse.
     * 
     * @param getUserReturn
     */
    public void setGetUserReturn(di.via.user.User getUserReturn) {
        this.getUserReturn = getUserReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetUserResponse)) return false;
        GetUserResponse other = (GetUserResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getUserReturn==null && other.getGetUserReturn()==null) || 
             (this.getUserReturn!=null &&
              this.getUserReturn.equals(other.getGetUserReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetUserReturn() != null) {
            _hashCode += getGetUserReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetUserResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://user.via.di", ">getUserResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getUserReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://user.via.di", "getUserReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://user.via.di", "User"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
