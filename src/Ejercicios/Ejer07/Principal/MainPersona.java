/*
 continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Ejercicios.Ejer07.Principal;

import Ejercicios.Ejer07.Entidad.Persona;
import Ejercicios.Ejer07.Service.ServicePersona;
import java.util.Arrays;

public class MainPersona {

    public static void main(String[] args) {
       
        ServicePersona sp = new ServicePersona();
        Persona p1 = sp.crearPersona();
        System.out.println("Creando persona 1");
        Persona p2 = new Persona("Rolando", 21, 'h', 87.5, 1.75);
        Persona p3 = new Persona("Cindy", 23, 'M', 55.5, 1.63);
        Persona p4 = new Persona("Juan", 30, 'h', 80.4, 1.80);
        /*Persona p1 = sp.crearPersona();
        System.out.println("Creando persona 2");
        Persona p2 = sp.crearPersona();
        System.out.println("Creando persona 3");
        Persona p3 = sp.crearPersona();
        System.out.println("Creando persona 4");
        Persona p4 = sp.crearPersona();*/

        Persona[] personas = {p1, p2, p3, p4};
        
        int[] IMC = new int[personas.length];
        boolean[] edad = new boolean[personas.length];
        int conteoMayoresEdad = 0;
        int conteoMenoresEdad = 0;
        for (int i = 0; i < personas.length; i++) {
            IMC[i] = sp.calcularIMC(personas[i]);

            if (IMC[i] == -1) {
                System.out.println(personas[i].getNombre() + " está por debajo de su peso ideal");
            } else if (IMC[i] == 0) {
                System.out.println(personas[i].getNombre() + " está en su peso ideal");
            } else if (IMC[i] == 1) {
                System.out.println(personas[i].getNombre() + " está por encima de su peso ideal");
            }

            edad[i] = sp.esMayorDeEdad(personas[i]);

            if (edad[i] == true) {
                System.out.println(personas[i].getNombre() + " es mayor de edad");
                conteoMayoresEdad++;
            } else {
                System.out.println(personas[i].getNombre() + "  es menor de edad");
                conteoMenoresEdad += 1;
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

        long conteoPesoIdeal = Arrays.stream(IMC).filter(valor -> valor == 0).count();
        long conteoSobrePeso = Arrays.stream(IMC).filter(valor -> valor == 1).count();
        long conteoBajoPeso = Arrays.stream(IMC).filter(valor -> valor == -1).count();

        System.out.println("\n===<>===<>RESULTADOS<>===<>===");
        System.out.println("Total Personas: " + personas.length);
        System.out.println("Personas con Bajo Peso: " + (conteoBajoPeso * 100) / personas.length + "%");
        System.out.println("Personas en su Peso ideal: " + (conteoPesoIdeal * 100) / personas.length + "%");
        System.out.println("Personas con Sobre Peso: " + (conteoSobrePeso * 100) / personas.length + "%");
        System.out.println("Personas Mayores de Edad: " + (conteoMayoresEdad * 100) / personas.length + "%");
        System.out.println("Personas Menores de Edad: " + (conteoMenoresEdad * 100) / personas.length + "%");
        System.out.println("<>===<>===<>===<>===<>===<>===<>");

    }

}
