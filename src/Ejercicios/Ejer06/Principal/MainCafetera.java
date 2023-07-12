
package Ejercicios.Ejer06.Principal;

import Ejercicios.Ejer06.Entidad.Cafetera;
import Ejercicios.Ejer06.Service.ServiceCafetera;
import java.util.Scanner;


public class MainCafetera {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         ServiceCafetera scf= new ServiceCafetera();
         Cafetera caf=scf.llenarCafetera();
         System.out.print("Por favor ingrese la cantidad de onzas de café que quiere: ");
         double tam=read.nextDouble();
         scf.servirTaza(caf, tam);
         
    }
   
    
}
