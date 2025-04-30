
package repository;


import java.sql.ResultSet;

public interface IRepositorioGET {
    
    ResultSet getListar();
    ResultSet getBuscar(String codigo);
    ResultSet getBuscarPorNombre(String nombre);
    ResultSet getFiltrar(String valor);
    
}
