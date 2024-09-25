
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alepu
 */
public class Megaferia {

    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "";
    }

    
    
    public ArrayList<Stand> getStands() {
        return stands;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    
    public void createStand(float precio) { //solo se toma precio porque es el atributo en el constructor
        this.stands.add(new Stand(precio)); //se crea el stand (es una relación de composición)
    }

    public void verifyStands() {
        for (Stand stand : this.stands) {
            System.out.println(stand + " --> " + stand.getEditoriales());
        }
    }

    public boolean addEditorial(Editorial editorial) { //añadir la editorial a la lista de editoriales
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    public void assignStandEditorial(ArrayList<Integer> standsIds, ArrayList<Editorial> editoriales) {
        for (Editorial editorial : editoriales) {
            this.addEditorial(editorial);
            for (Integer standId : standsIds) {
                Stand stand = this.getStandById(standId);
                if (stand != null) {
                    editorial.addStand(stand);
                    stand.addEditorial(editorial);
                }
            }
        }
    }

    private Stand getStandById(int standId) {
        for (Stand stand : this.stands) {
            if (stand.getId() == standId) {
                return stand;
            }
        }
        return null;

    }

}
