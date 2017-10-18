/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esteban.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author esteban
 */
@WebService(serviceName = "ConversionUnidadesVolumen")
@Stateless()
public class ConversionUnidadesVolumen {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "centimetrosAPulgadas")
    public double centimetrosAPulgadas(@WebParam(name = "centimetros") double centimetros) {
        //TODO write your implementation code here:
        return 0.0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pulgadasACentimetros")
    public double pulgadasACentimetros(@WebParam(name = "pulgadas") double pulgadas) {
        //TODO write your implementation code here:
        return 0.0;
    }
}
