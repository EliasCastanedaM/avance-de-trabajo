/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author JOSUE
 */
public interface Crud{
    
    public void crear(Inventario inventario);
    public void editarInventario(Inventario inventario);
    public void eliminarInventario(Inventario inventario);
    public void mostrarTodosLosInventarios(Inventario inventario);
    public void mostrarEspecificInventario(Inventario inventario);
    
}
