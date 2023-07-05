package Ejercicios.Ejer03.Service;

import Ejercicios.Ejer03.Entidad.Operacion;
import java.util.Scanner;


public class ServiceOperacion {

    Scanner read = new Scanner(System.in);

    public Operacion creaOperacion() {
        System.out.print("Por favor ingrese un número: ");
        double n1 = read.nextDouble();
        System.out.print("Por favor ingrese un número: ");
        double n2 = read.nextDouble();
        return new Operacion(n1, n2);

    }

}
