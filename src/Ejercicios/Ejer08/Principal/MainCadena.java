/*
 En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
 */
package Ejercicios.Ejer08.Principal;

import Ejercicios.Ejer08.Entidad.Cadena;
import Ejercicios.Ejer08.Service.ServiceCadena;
import java.util.Scanner;

public class MainCadena {

    public static void main(String[] args) {
        String frase="Holaas";
        System.out.println("prueba: "+frase.charAt(0));
        Cadena cad = new Cadena();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese la frase: ");
        cad.setFrase(read.nextLine());

        System.out.println("Por favor ingrese la longitud de la cadena : ");
        int longitud = read.nextInt();
        cad.setLongitud(longitud);
        
        
        
        System.out.println("La frase es: " + (cad.getFrase().substring(0, longitud)));

        ServiceCadena scad = new ServiceCadena();
        
        //scad.contarVocales(cad);
        //scad.invertirFrase(cad);
        //scad.vecesRepetido(cad);
        //scad.compararLogitud(cad);
       // scad.unirFrase(cad);
        scad.reemplazar("a", cad);
        scad.contiene(cad);

       
        
        
        
        
    }

}
