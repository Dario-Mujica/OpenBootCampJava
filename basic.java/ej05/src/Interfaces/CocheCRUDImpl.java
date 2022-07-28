package Interfaces;

import java.util.List;

public interface CocheCRUDImpl {

    public void save(Coche coche);

    public List<Coche> finAll();

    public static void delete(Coche coche) {
    }

    ;
}
