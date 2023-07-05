
package Ejercicios.Ejer04.Principal;

import Ejercicios.Ejer04.Entidad.Rectangulo;
import Ejercicios.Ejer04.Service.ServiceRectangulo;


public class MainRectangulo {
    public static void main(String[] args) {
        ServiceRectangulo sr= new ServiceRectangulo();
        Rectangulo rc1=sr.crearRectangulo();
        System.out.println("El perimetro del rectangulo es: "+rc1.perimetroRectangulo());
        rc1.superficieRectangulo();
        rc1.dibujarRectangulo(rc1.getBase(), rc1.getAltura());
        System.out.println(rc1.toString());
    }
    
}
