package Ejercicios.Ejer06.Service;

import java.util.Scanner;
import Ejercicios.Ejer06.Entidad.Cafetera;

public class ServiceCafetera {

   
    public Cafetera llenarCafetera() {
        Scanner read= new Scanner(System.in);
        System.out.println("Por favor ingrese la capacidad max de la cafetera: ");
        
        double cMax=read.nextDouble();
        Cafetera cf=new Cafetera();
        cf.setCantAct(cMax);
        
        //hace que la cantidad actual sea igual a la capacidad máxima.
        return new Cafetera(cMax,cf.getCantAct());
    }
    
    public void servirTaza(Cafetera cf, double tam){
        double cActual=cf.getCantAct();
        if(cActual<tam){
            System.out.println("Se han servido "+cActual+" onzas de café, no hay mas en el momento ");
        }else{
            System.out.println("Su pedido está listo, por favor retire la taza ");
        }
        
    }

}
