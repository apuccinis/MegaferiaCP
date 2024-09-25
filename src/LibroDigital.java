
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alepu
 */
public class LibroDigital extends Libro{
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    //se llama al super para ejecutar la clase y métodos de libro
    public LibroDigital(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, boolean hasHipervinculo, ArrayList<String> hipervinculos) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }
    
}
