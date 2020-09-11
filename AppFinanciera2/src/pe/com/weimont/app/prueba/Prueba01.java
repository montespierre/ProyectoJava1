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
        double vf;
        
        FinancieraService servicio = new FinancieraService();
        
        vf = servicio.calcVF(3, 0.5, 2);
        
        System.out.println(vf);
    }
    
    
}
