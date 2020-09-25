/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s2.pruebas;

import java.sql.Connection;
import java.sql.Statement;
import pe.com.weimont.cafeteriawmj_s2.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba02 {
    public static void main(String[] args) {
        //Insertar Empleado - Modo Statement
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            Statement stm = cn.createStatement();
            
            stm.execute("insert into empleados(idEmpleado, nomEmp, puestoEmp, telEmp) values(null, 'Flavio Maestri', 'Vendedor', '234234123')");
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
