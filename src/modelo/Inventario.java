/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Inventario {
    
    int inventario_id;
    int cantidad_actual;
    int ubicacion_id;
    int zapato_id;

    public Inventario() {
    }
    
    public Inventario(int inventario_id){
        this.inventario_id= inventario_id;
    }

    public Inventario(int inventario_id, int cantidad_actual, int ubicacion_id, int zapato_id) {
        this.inventario_id = inventario_id;
        this.cantidad_actual = cantidad_actual;
        this.ubicacion_id = ubicacion_id;
        this.zapato_id = zapato_id;
    }

    public Inventario(int cantidad_actual, int ubicacion_id, int zapato_id) {
        this.cantidad_actual = cantidad_actual;
        this.ubicacion_id = ubicacion_id;
        this.zapato_id = zapato_id;
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

    public int getUbicacion_id() {
        return ubicacion_id;
    }

    public void setUbicacion_id(int ubicacion_id) {
        this.ubicacion_id = ubicacion_id;
    }

    public int getZapato_id() {
        return zapato_id;
    }

    public void setZapato_id(int zapato_id) {
        this.zapato_id = zapato_id;
    }
    
    
    

}
