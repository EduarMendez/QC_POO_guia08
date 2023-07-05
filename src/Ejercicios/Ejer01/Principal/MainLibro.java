
package Ejercicios.Ejer01.Principal;

import Ejercicios.Ejer01.Entidad.Libro;
import Ejercicios.Ejer01.Service.ServiceLibro;


public class MainLibro {
    public static void main(String[] args) {
        ServiceLibro sl=new ServiceLibro();
        Libro lb=sl.cargarLibro();
        lb.mostrarLibro();
        
        
    }
    
}
