/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.weimont.cafeteriawmj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author montespierreg
 */
public class AccesoDB {
      private AccesoDB() {
  }

  public static Connection getConnection() throws SQLException {
    Connection cn = null;
    // Parámetros
    //String driver = "com.mysql.jdbc.Driver";
    //String urlDB = "jdbc:mysql://127.0.0.1:3306/eureka";
    //String user = "root";
    //String pass = "";
    try {
        String url = "jdbc:mysql://localhost/weimont";
        String user = "root";
        String password = "";
        cn =
       DriverManager.getConnection(url,user,password);

    // Do something with the Connection


        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    return cn;
  }
}
