/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;

/**
 *
 * @author Elias_Castañeda
 */
public class ProbarConexion {
    
    public static void main(String[] args) {
        
        Conexion con = new Conexion();
        
        Connection conexion = con.conectar();
        
        
         if (conexion != null) {
            // Aquí puedes trabajar con la base de datos si la conexión fue exitosa.
            System.out.println("🚀 Conexión exitosa.");
        } else {
            System.out.println("💥 No se pudo establecer la conexión.");
        }
    }
        
    }
    

