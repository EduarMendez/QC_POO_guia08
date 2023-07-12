package Ejercicios.Ejer05.Service;

import Ejercicios.Ejer05.Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServiceCuenta {

    public CuentaBancaria crearCuenta() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        CuentaBancaria cbank=new CuentaBancaria();
        System.out.print("Ingrese nro de cuenta: ");
        cbank.setNumeroCuenta(read.nextInt());
        System.out.print("Ingrese su DNI: ");
        cbank.setDNI(read.nextLong());
        System.out.print("Ingrese el saldo: ");
        cbank.setSaldoActual( read.nextLong());
        
        return cbank;

    }
    
    public void ingresarDinero(CuentaBancaria cb,double inDinero) {
        if(inDinero>0){
        System.out.println("Deposito exitoso");
        cb.setSaldoActual(cb.getSaldoActual()+(long)inDinero);
            
        }else{
            System.out.println("Por favor ingrese una cantidad valida");
        }
        
    }

    public void retirarDinero(CuentaBancaria cb,double outDinero) {
        long saldo =cb.getSaldoActual();
        if (saldo <=outDinero) {
            System.out.println("El saldo actual es insuficiente");
            cb.setSaldoActual(0);
        } else {
            System.out.println("Retiro exitoso");
            cb.setSaldoActual(saldo-(long)outDinero);
        }

    }

   
    public void extraccionRapida(CuentaBancaria cb) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la cantidad que desea retirar por \"Extracción rápida\": ");
        long retirar = read.nextLong();
        if (retirar > cb.getSaldoActual() * 0.2) {
            System.out.println("Puede  retirar un maximo $" + cb.getSaldoActual() * 0.2 + " en esta transacción");
            
        } else {
            retirarDinero(cb, (double)retirar);

        }
    }
    public void consultarSaldo( CuentaBancaria cb){
        System.out.println("El saldo actual es: $"+cb.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cb){
        System.out.println(cb);
                }


}
