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
public class Prueba03 {
    //calculo de r
    public static void main(String[] args) {
        double r;
        
        FinancieraService servicio3 = new FinancieraService();
        
        r = servicio3.calcR(200, 0.5, 4);
        
        System.out.println(r);
    }
}
