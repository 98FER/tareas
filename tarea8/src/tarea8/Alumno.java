/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea8;

/**
 *
 * @author mario castañeda
 */
public class Alumno {
     private static int contador=0;
     private String Carnet ;
     private String Nombre ;
     private int edad;

    public Alumno(String Carnet, String Nombre, int edad) {
        
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Carnet: " + Carnet 
                         + ", Nombre: " + Nombre 
                         + ", edad: " + edad + '}';
    }

}
