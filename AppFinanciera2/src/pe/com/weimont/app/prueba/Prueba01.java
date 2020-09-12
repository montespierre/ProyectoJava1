/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.app.prueba;

import pe.com.weimont.app.service.FinancieraService;

/**
 *
 * @author montespierreg
 */
public class Prueba01 {
    public static void main(String[] args) {
        //variables
        double vf;
        double va, r, n;
        
        //entrada
        va = 3;
        r = 0.5;
        n = 2;
        
        //Proceso
        FinancieraService servicio = new FinancieraService();
        
        vf = servicio.calcVF(va, r, n);
        
        //Salida
        System.out.println(vf);
    }
    
    
}
