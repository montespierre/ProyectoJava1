/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import pe.com.weimont.cafeteriawmj_s3.service.ArticuloService;

/**
 *
 * @author montespierreg
 */
public class Prueba44 {
    public static void main(String[] args) {
        ArticuloService articuloService1 = new ArticuloService();
        System.out.println(articuloService1.getArticulos("Lapicero"));;
    }
    
    
}
