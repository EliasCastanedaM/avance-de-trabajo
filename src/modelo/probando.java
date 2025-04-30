/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo;

import modelo.CategoriaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author JOSUE
 */
public class probando {

    /**
     * @param args the command line a   rguments
     */
    public static void main(String[] args) {
    CategoriaDAO dao = new CategoriaDAO(); // tu clase DAO con getListar

    ResultSet rs = dao.getListar();

    try {
        while (rs.next()) {
            int id = rs.getInt("categoria_id");       // nombre exacto de la columna
            String nombre = rs.getString("nombre");   // nombre exacto de la columna

            System.out.println("ID: " + id + " - Nombre: " + nombre);
        }

        rs.close(); // no olvides cerrar
    } catch (SQLException e) {
        System.out.println("Error al leer datos: " + e.getMessage());
    }
}

    
}
