/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio 2 ).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Ejercicios.Ejer02.Entidad;


public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
      public void areaCircunferencia(){
        
          System.out.println("El área de la circunferencia es:" +Math.PI*(Math.pow(radio, 2)));
    }
    
    public void perimetroCircunferencia(){
        System.out.println("El perímetro de la circunferencia es: "+ 2*radio*Math.PI);
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}