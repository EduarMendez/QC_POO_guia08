
package Ejercicios.Ejer04.Service;

import Ejercicios.Ejer04.Entidad.Rectangulo;
import java.util.Scanner;
public class ServiceRectangulo {
    
    public Rectangulo crearRectangulo(){
        Scanner read = new Scanner(System.in);
        System.out.print("Por favor ingrese la altura del rectangulo: ");
        double altura=read.nextDouble();
        System.out.print("Por favor ingrese la base del rectangulo: ");
        double base=read.nextDouble();
        return new Rectangulo(base, altura);
        
    }
    
}
