
package Ejercicios.Ejer01.Service;

import Ejercicios.Ejer01.Entidad.Libro;
import java.util.Scanner;


public class ServiceLibro {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarLibro() {
        System.out.println("Por favor ingrese el titulo del libro: ");
        String titulo= read.next();
        System.out.println("Por favor ingrese el autor del libro: ");
        String autor= read.next();
        System.out.println("Por favor ingrese el ISBN del libro: ");
        double ISBN= read.nextDouble();
        System.out.println("Por favor ingrese el nro de páginas: ");
        int nroPaginas= read.nextInt();
        return new Libro(ISBN, titulo, autor, nroPaginas);

    }
    
   
    
}
