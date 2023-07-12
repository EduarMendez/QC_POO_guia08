package Ejercicios.Ejer03.Principal;

import Ejercicios.Ejer03.Entidad.Operacion;
import Ejercicios.Ejer03.Service.ServiceOperacion;

public class MainOperacion {

    public static void main(String[] args) {
        ServiceOperacion So = new ServiceOperacion();
        Operacion Op = So.creaOperacion();
        
        double suma=So.sumar(Op.getNum1(),Op.getNum2());
        double resta=So.restar(Op.getNum1(),Op.getNum2());
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+ resta);
        So.multiplicar(Op.getNum1(), Op.getNum2());
        So.dividir(Op.getNum1(),Op.getNum2());

    }

}
