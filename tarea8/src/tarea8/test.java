/*
 */
package tarea8;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author mario castañeda
 */
public class test implements Comparator{
    
    @Override
    public int compare(Object o1, Object o2) {
       Alumno a1= (Alumno) o1;
       Alumno a2= (Alumno) o2;
       
        int res = 0;
                //ordene de menor a mayor 
                if (a1.getEdad() > a2.getEdad()) {
                    res = 1;
                } else if (a1.getEdad() < a2.getEdad()) {
                    res = -1;
                } else {
                    res = 0;
                }
                return res;
        
    }

    
}
