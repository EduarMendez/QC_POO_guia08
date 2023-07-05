/*/*1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package Ejercicios.Ejer01.Entidad;


public class Libro {

    double ISBN;
    String titulo;
    String autor;
    int nroPaginas;
    
    
    

    public Libro(double ISBN, String titulo, String autor, int nroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public Libro() {
    }

     public void mostrarLibro(){
        
        System.out.println("El libro es: "+titulo);
        System.out.println("El autor es: "+autor);
        System.out.println("El ISBN es: "+ISBN);
        System.out.println("El nro de páginas es: "+nroPaginas);
        
    }
    

}
