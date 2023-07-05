
package Ejercicios.Ejer02.Principal;

import Ejercicios.Ejer02.Entidad.Circunferencia;
import Ejercicios.Ejer02.Service.ServiceCircunferencia;

public class MainCircunferencia {
    public static void main(String[] args) {
        ServiceCircunferencia sc = new ServiceCircunferencia();
        Circunferencia c1=sc.crearCircunferencia();
        c1.areaCircunferencia();
        c1.perimetroCircunferencia();
        //System.out.println(c1);
    }
    
}
