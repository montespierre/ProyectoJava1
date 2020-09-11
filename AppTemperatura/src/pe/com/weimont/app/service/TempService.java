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
public class TempService {
    public double calcFaC (double f){
        double c;
        
        c = f+1;
        
        return c;
    }
    
    public double calcKaC (double k){
        double c;
        
        c = k+2;
        
        return c;
    }
    
    public double calcFaK (double f){
        double k;
        
        k = f+3;
        
        return k;
    }
    
    public double calcCaK (double c){
        double k;
        
        k = c+4;
        
        return k;
    }
    
    public double calcCaF (double c){
        double f;
        
        f = c + 10;
        
        return f;
    }
    
    public double calcKaF (double k){
        double f;
        
        f = k + 20;
        
        return f;
    }
}
