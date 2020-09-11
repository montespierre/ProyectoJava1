/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.weimont.app.prueba;

import pe.edu.weimont.app.dto_model.VentaDto;
import pe.edu.weimont.app.service.HacerVenta;

/**
 *
 * @author montespierreg
 */
public class Prueba01 {
    public static void main(String[] args) {
        VentaDto dto1 = new VentaDto(3, 5);
        
        HacerVenta venta1 = new HacerVenta();
        
        dto1 = venta1.calcMonto(dto1);
        
        System.out.println(dto1.getMonto());
        System.out.println(dto1.getImpuesto());
    }
}
