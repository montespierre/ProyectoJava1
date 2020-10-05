/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.controller;

import pe.com.weimont.cafeteriawmj_s3.service.ArticuloService;

/**
 *
 * @author montespierreg
 */
public class ArticuloNuevoController {
    private ArticuloService articuloService;
    
    public ArticuloNuevoController(){
        articuloService = new ArticuloService();
    }
    
    public void registrarArticulo(String descArticulo,	String precioUnit, 
            String cantExis){
        articuloService.registrarArticulo(descArticulo, precioUnit, cantExis);
    }
}
