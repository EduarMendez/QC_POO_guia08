package Ejercicios.Ejer05.Principal;

import java.util.Scanner;

import Ejercicios.Ejer05.Entidad.CuentaBancaria;
import Ejercicios.Ejer05.Service.ServiceCuenta;

public class MainCuenta {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ServiceCuenta sc = new ServiceCuenta();
        CuentaBancaria cb = sc.crearCuenta();
        
        sc.consultarDatos(cb);
        System.out.println("Digite la cantidad de dinero que desea ingresar: ");
        long ingreso=read.nextLong();
        sc.ingresarDinero(cb, ingreso);
        sc.consultarSaldo(cb);
        System.out.println("Digite la cantidad de dinero que desea retirar: ");
        long retiro=read.nextLong();
        sc.retirarDinero(cb, retiro);
        sc.consultarSaldo(cb);
        sc.extraccionRapida(cb);
        sc.consultarDatos(cb);
        
        
        

    }

}
