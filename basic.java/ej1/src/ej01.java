/*
Entrega ejercicios tema 1
Para este primer ejercicio tendréis que realizar lo siguiente:
*
Crea un proyecto de Java desde 0
Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */


public class Main {
    public static void main(String[] args) {

        int numero = 28;
        long numeroLargo = 5645464464000000L;
        double numeroDoble = 28.45;
        boolean test = true;
        String nombre = "Dario";

        System.out.println("Esto es un entero: " + numero);
        System.out.println("Esto es un long: " + numeroLargo);
        System.out.println("Esto es un double: " + numeroDoble);
        System.out.println("Esto es un boolean: " + test);
        System.out.println("Esto es un string: " + nombre);
    }
}
