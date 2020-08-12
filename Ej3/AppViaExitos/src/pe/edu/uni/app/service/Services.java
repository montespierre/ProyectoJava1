/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.service;

/**
 *
 * @author montespierreg
 */
public class Services {
    public double calcIngreso(int horasDiarTrab, int diasTrab, double pagoPorHora){
        double ingreso;
            
        ingreso = horasDiarTrab*diasTrab*pagoPorHora;
            
        return ingreso;
    }
    
    public double calcImpRenta(int horasDiarTrab, int diasTrab, double pagoPorHora){
        double impRenta, ingreso;
        
        ingreso = calcIngreso(horasDiarTrab, diasTrab, pagoPorHora);
        
        if(ingreso>1500){
            impRenta = ingreso*8/100;
        }else{
            impRenta = 0;
        }
        
        return impRenta;
        
    }
    
}
