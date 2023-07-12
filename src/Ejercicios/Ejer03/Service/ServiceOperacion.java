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

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public void multiplicar(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("El resultado es cero porque se está multiplicando por cero");
        } else {
            System.out.println("La multiplicación es: " + num1 * num2);
        }
    }

    public void dividir(double num1, double num2) {
        if (num1 == 0) {
            System.out.println("El resultado es cero pues el numerador es cero");
        } else if (num2 == 0) {
            System.out.println("ERROR: No se puede dividir por cero");
        } else {
            System.out.println("La división es: " + num1 / num2);
        }
    }

}
