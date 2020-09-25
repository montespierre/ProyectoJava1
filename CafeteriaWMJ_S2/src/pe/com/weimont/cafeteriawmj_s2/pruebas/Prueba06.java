/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s2.pruebas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import pe.com.weimont.cafeteriawmj_s2.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba06 {
    public static void main(String[] args) {
        //Select - Usando ResultSet
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            //String sql = "{call usp_sumar(?, ?, ?)}";
            String sql = "{call usp_sumar(?, ?, ?)}";
            CallableStatement cstm = cn.prepareCall(sql);
            cstm.setInt(1, 10);
            cstm.setInt(2, 20);
            cstm.registerOutParameter(3, java.sql.Types.INTEGER);
            cstm.executeUpdate();
            int suma = cstm.getInt(3);
            cstm.close();
            System.out.println("Suma: " + suma);
            System.out.println("Proceso ok");
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
