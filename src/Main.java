
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alepu
 */
public class Main {

    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia();

        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(150000);
        megaferia.createStand(1000000);

        Gerente gerente1 = new Gerente("CP enthusiast", 1233);
        Gerente gerente2 = new Gerente("CP enthusiast 2.0", 2344);

        Editorial editorial1 = new Editorial("865-458395-1", "CP fan club", "Cra 51b #70 - 120", gerente1);
        Editorial editorial2 = new Editorial("976-569406-2", "CP SUPER-fan club", "Calle 69 #44 - 41", gerente2);

        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);

        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);

        megaferia.assignStandEditorial(standsIds, editoriales);
        
        System.out.println(megaferia + " --> " + megaferia.getStands());
        System.out.println(megaferia + " --> " + megaferia.getEditoriales() + "\n");
        
        System.out.println(gerente1 + " --> " + gerente1.getEditorial());
        System.out.println(gerente2 + " --> " + gerente2.getEditorial() + "\n");
        
        System.out.println(editorial1 + " --> " + editorial1.getGerente());
        System.out.println(editorial2 + " --> " + editorial2.getGerente() + "\n");
        
        System.out.println(editorial1 + " --> " + editorial1.getStands());
        System.out.println(editorial2 + " --> " + editorial2.getStands() + "\n");
        
        megaferia.verifyStands();
    }

}
