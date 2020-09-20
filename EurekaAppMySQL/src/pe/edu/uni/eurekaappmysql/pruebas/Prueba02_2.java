/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.eurekaappmysql.pruebas;

import java.sql.Connection;
import java.sql.Statement;
import pe.edu.uni.eurekaappmysql.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba02_2 {
    public static void main(String[] args) {
        //Insertar Empleado
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();
            cn.setAutoCommit(false);
            Statement stm = cn.createStatement();
            //stm.execute("INSERT INTO empleados (idEmpleado, nomEmp, puestoEmp, telEmp) VALUES (NULL, Marco C, Ciurlizza, 234123432)");
            //stm.execute("INSERT INTO 'empleados' ('idEmpleado', 'nomEmp', 'puestoEmp', 'telEmp') VALUES (NULL, 'Esidio', 'Vendedor', '345234126')");
            stm.execute("insert into empleados(idEmpleado,nomEmp, puestoEmp, telEmp) values( null, 'Messi', 'vendedor', '234234234' )");
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
