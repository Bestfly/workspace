
package com.ctrip.ws.flights;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-03-29T15:34:12.569+08:00
 * Generated source version: 2.7.11
 * 
 */
 
public class QueryRebookConfirmServiceSoap_QueryRebookConfirmServiceSoap_Server{

    protected QueryRebookConfirmServiceSoap_QueryRebookConfirmServiceSoap_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new QueryRebookConfirmServiceSoapImpl1();
        String address = "http://flights.ws.ctrip.com/Flight.Order.SupplierOpenAPI/QueryRebookConfirm.asmx";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new QueryRebookConfirmServiceSoap_QueryRebookConfirmServiceSoap_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}