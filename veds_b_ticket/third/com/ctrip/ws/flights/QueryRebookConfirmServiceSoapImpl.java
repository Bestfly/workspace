
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.ctrip.ws.flights;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-03-29T15:34:12.538+08:00
 * Generated source version: 2.7.11
 * 
 */

@javax.jws.WebService(
                      serviceName = "QueryRebookConfirmService",
                      portName = "QueryRebookConfirmServiceSoap12",
                      targetNamespace = "http://tempuri.org/",
                      wsdlLocation = "http://flights.ws.ctrip.com/Flight.Order.SupplierOpenAPI/QueryRebookConfirm.asmx?WSDL",
                      endpointInterface = "com.ctrip.ws.flights.QueryRebookConfirmServiceSoap")
                      
public class QueryRebookConfirmServiceSoapImpl implements QueryRebookConfirmServiceSoap {

    private static final Logger LOG = Logger.getLogger(QueryRebookConfirmServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see com.ctrip.ws.flights.QueryRebookConfirmServiceSoap#handle(java.lang.String  requestXML )*
     */
    public java.lang.String handle(java.lang.String requestXML) { 
        LOG.info("Executing operation handle");
        System.out.println(requestXML);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}