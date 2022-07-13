/*Segunda parte:

Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto. 
*/

public class test2 {
    public static void main(String[] args) {

        /// 2da parte
        Coche auto = new Coche();
        auto.AgregaPuerta();
        System.out.printf("el auto posee %d puertas.", auto.puertas);

    }
}

/// 2da parte
class Coche {

    public int puertas = 0;

    public void AgregaPuerta() {
        this.puertas++;
    }
}