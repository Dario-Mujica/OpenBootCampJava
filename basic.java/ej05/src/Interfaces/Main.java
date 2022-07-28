/*Entrega ejercicios tema 5
*
Crear:
*  una interfaz CocheCRUD.
*  una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.
Como métodos de CocheCRUD podemos poner:
save() findAll() delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.
 */

package Interfaces;

import java.util.List;

import static Interfaces.Coche.imprimirCoche;
import static Interfaces.CocheCRUD.delete;

public class Main {
    public static void main(String[] args) {

        CocheCRUDImpl cocheCRUD = new CocheCRUD();
        Coche car1 = new Coche("Peugeot", "208 Feline", "Bordo", 2015, 45000, 12500, true);
        Coche car2 = new Coche("Volkswagen", "Tiguan", "Negro", 2022, 0, 25000, false);
        Coche car3 = new Coche("Toyota", "Corolla", "Gris", 2015, 87500, 13000, true);

        //guarda los coches en lista
        cocheCRUD.save(car1);
        cocheCRUD.save(car2);
        cocheCRUD.save(car3);

        //imprimir lista de coches
        List<Coche> coches = cocheCRUD.finAll();
        System.out.println(coches);

        //imprimir coche forma personalizada
        imprimirCoche(car1);
        imprimirCoche(car2);
        imprimirCoche(car3);

        //elimina coche de lista/base de datos
        delete(car1);
    }
}
