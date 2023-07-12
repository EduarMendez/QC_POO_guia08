
package Ejercicios.Ejer02.Principal;

import Ejercicios.Ejer02.Entidad.Circunferencia;
import Ejercicios.Ejer02.Service.ServiceCircunferencia;

public class MainCircunferencia {
    public static void main(String[] args) {
        ServiceCircunferencia sc = new ServiceCircunferencia();
        Circunferencia c1=sc.crearCircunferencia();
        
        sc.areaCircunferencia(c1.getRadio());
        sc.perimetroCircunferencia(c1.getRadio());
        
        System.out.println(c1);
    }
    
}
