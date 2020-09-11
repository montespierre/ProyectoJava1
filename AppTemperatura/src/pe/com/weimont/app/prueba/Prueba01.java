/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.app.prueba;

import pe.com.weimont.app.service.TempService;

/**
 *
 * @author montespierreg
 */
public class Prueba01 {
    public static void main(String[] args) {
        TempService servicio = new TempService();
        
        //Pasar de C a F
        System.out.println(servicio.calcCaF(30));
        
        //Pasar de C a K
        System.out.println(servicio.calcCaK(20));
        
        //Pasar de F a C
        System.out.println(servicio.calcFaC(15));
        
        //Pasar de F a K
        System.out.println(servicio.calcFaK(23));
        
        //Pasar de K a C
        System.out.println(servicio.calcKaC(18));
        
        //Pasar de K a F
        System.out.println(servicio.calcKaF(17));
    }
}
