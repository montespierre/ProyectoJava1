/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.uni.eurekaappmysql.pruebas;

import java.sql.Connection;
import pe.edu.uni.eurekaappmysql.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class Prueba01 {
    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion ok");
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
