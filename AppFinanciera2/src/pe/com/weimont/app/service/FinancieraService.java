/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.app.service;

/**
 *
 * @author montespierreg
 */
public class FinancieraService {
    public double calcVF(double va, double r, double n){
        double vf;
        
        vf = va*Math.pow((1 + r),n);
        
        
        return vf;
    }
    
    public double calcVA(double vf, double r, double n){
        double va;
        
        va = vf/Math.pow((1 + r), n);
        
        return va;
    }
    
    public double calcR(double vf, double va, double n){
        double r;
        
        r = Math.pow((vf / va), (1/n))-1;
        
        return r;
    }
}
