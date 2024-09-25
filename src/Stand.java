
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alepu
 */
public class Stand {

    private static int idCount = 0; //la palabra static diferencia una variable que pertenece a la clase de un atributo

    private int id; //se hará autogenerado
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(float precio) {
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList<>();

        Stand.idCount++; //se sube el idCount cada vez que se crea un stand
    }

    public int getId() {
        return id;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    
    
    public boolean addEditorial(Editorial editorial) { //añadir la editorial a la lista de editoriales
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + id + ", " + precio + ")";
    }

}
