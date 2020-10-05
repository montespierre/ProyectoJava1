/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.pruebas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba43 {
    public static void main(String[] args) {
        //		
        //Select - Usando ResultSet
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            Statement stm = cn.createStatement();
            String sql = "select idArticulo, descArticulo, precioUnit, cantExis from articulos";
            //SELECT COUNT(*) FROM `ventas` 
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                String codigo = rs.getString("idArticulo");
                String nombre = rs.getString("descArticulo");
                String puesto = rs.getString("precioUnit");
                String telefono = rs.getString("cantExis");
                
                System.out.println(codigo);
            }
            
            rs.close();
            stm.close();
            System.out.println("ok");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
}
