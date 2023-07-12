package Ejercicios.Ejer07.Service;

import Ejercicios.Ejer07.Entidad.Persona;
import java.util.Scanner;

public class ServicePersona {

    public Persona crearPersona() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nombre: ");
        String nombre = read.next();
        System.out.println("Por favor ingrese la edad: ");
        int edad = read.nextInt();
        System.out.println("Por favor  el sexo (H-hombre, M-mujer, O-otro): ");
        char sexo = read.next().charAt(0);
        String sexoS = Character.toString(sexo).toUpperCase();
        sexo = sexoS.charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Por favor ingrese una opción valida");
            sexo = read.next().charAt(0);
        }
        System.out.println("Por favor ingrese el peso: ");
        double peso = read.nextDouble();
        System.out.println("Por favor ingrese la altura: ");
        double altura = read.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
   
    public int calcularIMC(Persona per){
        double IMC=per.getPeso()/Math.pow(per.getAltura(), 2);
        int retorno=0;
        if (IMC<20){
            retorno=-1;
        }else if(IMC>=20&&IMC<=25){
            retorno=0;
        }else if(IMC>25){
            retorno=1;
        }
        return retorno;
    }
    
    public boolean esMayorDeEdad(Persona per){
        boolean Mayor=false;
        if(per.getEdad()>=18){
            Mayor=true;
        }else{
            Mayor=false;
        }
        return Mayor;
    }

}
