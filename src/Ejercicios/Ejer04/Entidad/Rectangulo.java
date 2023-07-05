/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Ejercicios.Ejer04.Entidad;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetroRectangulo() {
        return (base + altura) * 2;
    }

    public void superficieRectangulo() {
        Rectangulo rect = new Rectangulo(base, altura);
        System.out.println("La superficie del rectangulo es: " + ((base * altura )/ rect.perimetroRectangulo()));
    }
    
    public void dibujarRectangulo(double base, double altura){
        for (int i = 0; i <altura; i++) {
            for (int j = 0; j <base; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    

}
