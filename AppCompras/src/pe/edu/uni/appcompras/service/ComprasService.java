/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.appcompras.service;

/**
 *
 * @author montespierreg
 */
public class ComprasService {
    public double calcImpuesto(double importe){
        double impuesto;
        
        impuesto = importe * 0.18;
        
        return impuesto;
    }
    
    public double calcTotal(double importe){
        double impuesto, total;
        
        total = importe + calcImpuesto(importe);
        
        return total;
    }
    
}
