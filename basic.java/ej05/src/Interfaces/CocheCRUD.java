package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUD implements CocheCRUDImpl{


    private List<Coche> coches = new ArrayList<>();

    @Override

    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override

    public List<Coche> finAll() {
        return coches;
    }
    public static void delete(Coche coche) {
        System.out.println("\n\t-----------------------------------------------------------");
        System.out.println("\tESTE SERIA EL METODO DE ELIMINAR COCHE DE LA BASE DE DATOS");
        System.out.println("\t-----------------------------------------------------------\n");

        System.out.println("Se elimino: " + coche + " de la base.");
    }
}
