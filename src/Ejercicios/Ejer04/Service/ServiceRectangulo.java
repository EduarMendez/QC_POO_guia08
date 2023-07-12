
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
    public double perimetroRectangulo(Rectangulo rect) {
        return (rect.getBase() + rect.getAltura()) * 2;
    }

    public void superficieRectangulo(Rectangulo rct) {
        Rectangulo rect = new Rectangulo(rct.getBase(), rct.getAltura());
        System.out.println("La superficie del rectangulo es: " + ((rct.getBase()*rct.getAltura() )));
    }
    
    public void dibujarRectangulo(Rectangulo r){
        for (int i = 0; i <r.getAltura(); i++) {
            for (int j = 0; j <r.getBase(); j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }
    
}
