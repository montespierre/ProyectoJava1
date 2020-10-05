/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.controller;

import java.util.List;
import java.util.Map;
import pe.com.weimont.cafeteriawmj_s3.service.ArticuloService;

/**
 *
 * @author montespierreg
 */
public class ArticuloMostrarController {
    private ArticuloService articuloService;
    
    public ArticuloMostrarController(){
        articuloService = new ArticuloService();
    }
    
    public List<Map<String, ?>> getArticulos(String descArticulo){
        return articuloService.getArticulos(descArticulo);
    }
}
