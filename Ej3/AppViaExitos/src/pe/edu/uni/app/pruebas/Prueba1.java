/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.app.pruebas;

import pe.edu.uni.app.service.Services;

/**
 *
 * @author montespierreg
 */
public class Prueba1 {
    public static void main(String[] args) {
        Services servicio = new Services();
        
        //var
        int horasDiarTrab, diasTrab;
        double pagoPorHora, ingreso, impRenta;
        
        //entrada
        horasDiarTrab = 8;
        diasTrab = 30;
        pagoPorHora = 10;
    
        //proceso
        ingreso = servicio.calcIngreso(horasDiarTrab, diasTrab, pagoPorHora);
        impRenta = servicio.calcImpRenta(horasDiarTrab, diasTrab, pagoPorHora);
        
        //salida
        System.out.println(ingreso);
        System.out.println(impRenta);
    }
}
