package Ejercicios.Ejer02.Service;

import Ejercicios.Ejer02.Entidad.Circunferencia;
import java.util.Scanner;


public class ServiceCircunferencia {
    
    public Circunferencia crearCircunferencia(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el radio de la circunferencia: ");
        double rad = read.nextDouble();        
        return new Circunferencia(rad);
    }
    
  
    
    
}
