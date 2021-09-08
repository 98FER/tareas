package tarea8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario castañeda
 */
public class Producto {
    
    private static int contador=0;
    private int id;
    private String Nombre ;
    private double Precio;

    public Producto(String Nombre, double Precio) {
        contador++;
        this.id = contador;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Producto{" 
                + " id: " + id 
                + " Nombre: " + Nombre 
                + " Precio: " + Precio + '}';
    }
    
    
}
