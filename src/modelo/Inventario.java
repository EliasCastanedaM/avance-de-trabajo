/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Inventario {
    
    int inventario_id;
    int cantidad_actual;
    int stock_maximo;
    int stock_minimo;

    public Inventario() {
    }

    public Inventario(int inventario_id, int cantidad_actual, int stock_maximo, int stock_minimo) {
        this.inventario_id = inventario_id;
        this.cantidad_actual = cantidad_actual;
        this.stock_maximo = stock_maximo;
        this.stock_minimo = stock_minimo;
    }

    public int getInventario_id() {
        return inventario_id;
    }

    public void setInventario_id(int inventario_id) {
        this.inventario_id = inventario_id;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public int getStock_maximo() {
        return stock_maximo;
    }

    public void setStock_maximo(int stock_maximo) {
        this.stock_maximo = stock_maximo;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }
    
    

}
