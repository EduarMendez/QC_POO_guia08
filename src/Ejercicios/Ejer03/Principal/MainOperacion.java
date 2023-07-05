package Ejercicios.Ejer03.Principal;

import Ejercicios.Ejer03.Entidad.Operacion;
import Ejercicios.Ejer03.Service.ServiceOperacion;

public class MainOperacion {

    public static void main(String[] args) {
        ServiceOperacion So = new ServiceOperacion();
        Operacion Op = So.creaOperacion();
        System.out.println("La suma es: " + Op.sumar());
        System.out.println("La resta es: " + Op.restar());
        Op.multiplicar();
        Op.dividir();

    }

}
