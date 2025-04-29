
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class InventarioDAO implements Crud{

    @Override
    public void crear(Inventario inventario) {
        
        String sql ="{call sp_crear_inventario(?,?,?)}";
        
        try(Connection con = Conexion.conectar();
            CallableStatement cs = con.prepareCall(sql)){
        
        
        
        }catch(SQLException e){
        
        
        }
        
    }

    @Override
    public void editarInventario(Inventario inventario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarInventario(Inventario inventario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarTodosLosInventarios(Inventario inventario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarEspecificInventario(Inventario inventario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
