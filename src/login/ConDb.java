/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class ConDb {
    
    public static Connection myCon() {
        
        Connection con = null;
        
        try {
        
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:1434","Databasename","DBPassword");
                    
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
        }
        
        return con;
    }
    
}
