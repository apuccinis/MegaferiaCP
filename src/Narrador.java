
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alepu
 */
public class Narrador extends Persona{
    private ArrayList<Audiolibro> libros;
    
        public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
        public boolean addLibro(Audiolibro libro){ //añadirle los audiolibros a la lista de libros del narrador
        if(!this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
}
