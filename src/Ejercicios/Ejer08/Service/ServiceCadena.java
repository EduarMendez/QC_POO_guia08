package Ejercicios.Ejer08.Service;

import Ejercicios.Ejer08.Entidad.Cadena;
import static java.lang.System.in;
import java.util.Scanner;

public class ServiceCadena {

    public static Scanner read = new Scanner(in).useDelimiter("\n");

    public void contarVocales(Cadena cad) {
        int nroVocales = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            String vocales = "AEIOUaeiou";

            char letra = cad.getFrase().charAt(i);
            if (vocales.contains(Character.toString(letra))) {
                nroVocales++;
            }
        }
        System.out.println("Nro de vocales: " + nroVocales);
    }

    public void invertirFrase(Cadena cad) {
        String frase = cad.getFrase();
        String invertida = "";
        for (int i = cad.getLongitud() - 1; i >= 0; i--) {
            invertida += frase.substring(i, i + 1);
        }
        System.out.println("Frase invertida: " + invertida);
    }

    public void compararLogitud(Cadena cad) {
        int largoFraseOriginal = cad.getLongitud();
        System.out.println("Por favor ingrese la frase que desea comparar en longitud");
        String SegundaFrase = read.next();
        if (largoFraseOriginal == SegundaFrase.length()) {
            System.out.println("Las cadenas tienen la misma dimensión" + "(" + SegundaFrase.length() + ")");
        } else {
            System.out.println("Las cadenas tienen longitudes diferentes");
        }

    }

    public void vecesRepetido(Cadena cad) {
        System.out.println("Ingrese el caracter del que desea consultar cuántas veces se encuentra");
        char caracter = read.next().charAt(0);
        int contador = 0;

        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El caracter " + caracter + " está repetido " + contador + " veces");

    }

    public void unirFrase(Cadena cad) {
        System.out.println("Por favor ingrese la frase que desea concatenar: ");
        String nuevaFrase = read.next();
        String fraseActual = cad.getFrase().concat(nuevaFrase);
        System.out.println("La frase actualizada es: " + fraseActual);
    }

    public void reemplazar(String letra, Cadena cad) {
        String fraseReemplazada = " ";
        System.out.println("letra ingresada por parámetro: " + letra);
        System.out.println("Ingrese un caracter que desee poner en el lugar de la letra extraida: ");
        char x = read.next().charAt(0);
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().charAt(i) == letra.charAt(0)) {
                //char a=();
                cad.setFrase(cad.getFrase().replace(cad.getFrase().charAt(i), x));
            }

        }
        System.out.println("Remplazando el caracater quedaría: " + fraseReemplazada);
    }

    public void contiene(Cadena cad) {
        System.out.println("Por favor ingrese una letra para verificar si está dentro de la frase o no ");
        String letra = read.next();
        boolean aux = cad.getFrase().contains(letra);
        if (aux == true) {
            System.out.println("La frase contiene el caracter: "+ letra);
        }else{
            System.out.println("La frase NO contiene el caracter ingresado");
        }

    }

}


/*a) 





h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
