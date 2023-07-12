
package Ejercicios.Ejer04.Principal;

import Ejercicios.Ejer04.Entidad.Rectangulo;
import Ejercicios.Ejer04.Service.ServiceRectangulo;


public class MainRectangulo {
    public static void main(String[] args) {
        ServiceRectangulo sr= new ServiceRectangulo();
        Rectangulo rc1=sr.crearRectangulo();
        System.out.println("El perimetro del rectangulo es: "+sr.perimetroRectangulo(rc1));
        sr.superficieRectangulo(rc1);
        sr.dibujarRectangulo(rc1);
        
    }
    
}
