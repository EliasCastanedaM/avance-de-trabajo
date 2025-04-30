/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

/**
 *
 * @author JOSUE
 */
public interface IRepositorioCRUD<T> {
    
    void registrar(T registro);
    void editar(T registro);
    void eliminar(String codigo);
    
}
