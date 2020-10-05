/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.weimont.cafeteriawmj_s3.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pe.com.weimont.cafeteriawmj_s3.db.AccesoDB;

/**
 *
 * @author montespierreg
 */
public class ArticuloService {
    public void registrarArticulo(String descArticulo,	String precioUnit, 
            String cantExis){
        
        //Insertar Empleado - Modo Prepare Statement
        Connection cn = null;
        String sql;
    
        try {
            cn = AccesoDB.getConnection();  
            cn.setAutoCommit(false);
            //Datos de empleado
            sql = "insert into articulos(idArticulo, descArticulo, "
                    + "precioUnit, cantExis) values(?, ?, ?, ?)";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, null);
            pstm.setString(2, descArticulo);
            pstm.setString(3, precioUnit);
            pstm.setString(4, cantExis);
            pstm.executeUpdate();
            
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
    public List<Map<String, ?>> getArticulos(String descArticulo){
        //Select - Usando ResultSet
        //FALTAAAAAAAAAAAAAAAAAAAA
        List<Map<String, ?>> lista = new ArrayList<>();
        Connection cn = null;
        
        try {
            cn = AccesoDB.getConnection();  
            //cn.setAutoCommit(false);
            String sql = "select idArticulo, descArticulo, precioUnit, cantExis from articulos where descArticulo = ?";
             
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, descArticulo);
            ResultSet rs = pstm.executeQuery();
            lista = JdbcUtil.rsToList(rs);
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
        return lista;
    }
}
