/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/inventario";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    
    public static Connection conectar(){
    
        Connection conexion = null;
        
      try {
            
            // Establecer la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("✅ Conexión exitosa a la base de datos.");
            System.out.println("ASDASDSAD");
            System.out.println("xxxxxxx");
        }  catch (SQLException e) {
            System.out.println("❌ Error de conexión a la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    
        
    }
    
}
