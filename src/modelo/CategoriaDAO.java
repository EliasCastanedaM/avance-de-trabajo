/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import repository.ICategoria;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CategoriaDAO extends Conexion implements ICategoria{

    private Connection cnx = null;
    private Statement stm = null;
    private PreparedStatement pstm = null;
    private ResultSet rs = null; 

     @Override
    public ResultSet getListar() {
        
        try{
        
            this.cnx = this.conectar();
            this.stm = cnx.createStatement();
            
            String sql = "call sp_listar_categorias()";
            
            this.rs = stm.executeQuery(sql);
        
            
        }catch(SQLException e){
        
            System.out.println("Eroroedqdjqw "+e);
        
        }
        
        return this.rs;
    }

    @Override
    public ResultSet getBuscar(String codigo) {

        try{
            this.cnx=this.conectar();
            this.stm=cnx.createStatement();
            this.rs=stm.executeQuery(codigo);
        
        
        }catch(SQLException e){
            
        }
        return null;
    }

    
}
