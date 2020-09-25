/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s2.pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import pe.com.weimont.cafeteriawmj_s2.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba05 {
    public static void main(String[] args) {
        //Select - Usando ResultSet
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            String sql = "select* from empleados where nomEmp like ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, "Carlos Valderrama");
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                String codigo = rs.getString("idEmpleado");
                String nombre = rs.getString("nomEmp");
                String puesto = rs.getString("puestoEmp");
                String telefono = rs.getString("telEmp");
                System.out.println(codigo + " - " + nombre + " - " + puesto + " - " + telefono);
            }
            
            rs.close();
            pstm.close();
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
