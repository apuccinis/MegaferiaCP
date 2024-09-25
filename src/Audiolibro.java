
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alepu
 */
public class Audiolibro extends Libro{
    private int duracion;
    private Narrador narrador;

    //se llama al super para ejecutar la clase y métodos de libro
    public Audiolibro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int duracion, Narrador narrador) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
        
        this.narrador.addLibro(this); //añadirle ESTE audiolibro a la lista de libros de su narrador (ejecuta el método)
    }
    
}
