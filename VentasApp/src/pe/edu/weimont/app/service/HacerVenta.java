/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.weimont.app.service;

import pe.edu.weimont.app.dto_model.VentaDto;

/**
 *
 * @author montespierreg
 */
public class HacerVenta {
    public VentaDto calcMonto(VentaDto dto){
        
        //variables
        int cant;
        double precio, impuesto, monto;
        
        precio = dto.getPrecio();
        cant = dto.getCant();
        
        //proceso
        impuesto = 0.18*precio*cant;
        monto = impuesto + precio*cant;
        
        //salida
        dto.setImpuesto(impuesto);
        dto.setMonto(monto);
        
        return dto;
    }
}
