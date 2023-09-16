/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;
import Modelo.DatosDB;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Alexander
 */
public class Conexion extends DatosDB{
    
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public Connection getConnection() {
        try {
            
            Class.forName(Dvr);
            con = DriverManager.getConnection(Url, Usr, Pass);
            stmt = con.createStatement();
            rs = stmt.executeQuery(Sql);
            System.out.println("hola");
            while (rs.next()) {
                System.out.println(rs.getString(""));
                
            }
            
            
            
            //JOptionPane.showMessageDialog(null, "Conexion extisosa");
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return con;
        
    }
    
}
