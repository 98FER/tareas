/*

 */
package tarea8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author mario castañeda
 */
public class Tarea8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * creo una lista para usar el metodo colletions.sort donde ingreso los
         * objetos de tipo producto
         */

        ArrayList<Producto> p = new ArrayList<Producto>();
        p.add(new Producto("manzana", 2.5));
        p.add(new Producto("pera", 2.75));
        p.add(new Producto("sandia", 10));
        p.add(new Producto("papaya", 10));
        p.add(new Producto("melon", 5));

        Collections.sort(p, new Comparator<Producto>() {
            @Override
            public int compare(Producto pro1, Producto pro2) {
                int res = 0;
                //ordene de mayor a menor
                if (pro1.getPrecio() > pro2.getPrecio()) {
                    res = -1;
                } else if (pro1.getPrecio() < pro2.getPrecio()) {
                    res = 1;
                } else {
                    res = 0;
                }
                return res;
            }//fin de compare
        });//fin de colletions

        for (Producto temp : p) {
            System.out.println(temp.toString());

        }
        ArrayList<Alumno> a = new ArrayList<Alumno>();
        a.add(new Alumno("123", "Kevin", 9));
        a.add(new Alumno("123", "Rocio", 8));
        a.add(new Alumno("123", "Vahuer", 7));
        a.add(new Alumno("123", "Romulo", 10));
        a.add(new Alumno("123", "Ana", 5));

        Collections.sort(a, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno alum1, Alumno alum2) {
                int res = 0;
                //ordene de menor a mayor 
                if (alum1.getEdad() > alum2.getEdad()) {
                    res = 1;
                } else if (alum1.getEdad() < alum2.getEdad()) {
                    res = -1;
                } else {
                    res = 0;
                }
                return res;
            }//fin de compare
        });//fin de colletions
for (Alumno tem : a) {
            System.out.println(tem.toString());

        }
    }//fin de main

}
