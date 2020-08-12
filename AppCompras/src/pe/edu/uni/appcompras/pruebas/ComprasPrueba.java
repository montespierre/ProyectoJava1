/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.appcompras.pruebas;

import pe.edu.uni.appcompras.service.ComprasService;

/**
 *
 * @author montespierreg
 */
public class ComprasPrueba {
    public static void main(String[] args) {
        ComprasService comprasserice = new ComprasService();
    
        //variables
        double importe, impuesto, total;

        //entrada
        importe = 1000;

        //proceso
        impuesto = comprasserice.calcImpuesto(importe);
        total = comprasserice.calcTotal(importe);

        //salida
        System.out.println(importe);
        System.out.println(impuesto);
        System.out.println(total);
   
        
    }
}
