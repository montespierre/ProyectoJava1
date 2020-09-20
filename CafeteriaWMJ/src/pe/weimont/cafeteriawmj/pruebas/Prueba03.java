/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.weimont.cafeteriawmj.pruebas;

import java.sql.Connection;
import java.sql.Statement;
import pe.weimont.cafeteriawmj.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba03 {
    public static void main(String[] args) {
        //Insertar Articulo
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            Statement stm = cn.createStatement();
            stm.execute("insert into articulos(idArticulo,descArticulo, precioUnit, CantExis) "
                    + "values( null, 'Mochila', '100', '40' )");
            stm.close();
            cn.commit();
            System.out.println("Datos insertados");
        } catch (Exception e) {
            e.printStackTrace();
            try {
                cn.rollback();
            } catch (Exception e1) {
            }
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }
    
}
