/*Entrega ejercicios tema 3
*
*
* En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
String[] nombres = {"", "", "", ""}
 */

public class ej03 {
    public static void main(String[] args) {
        String[] nombres = {"Dario", "Tamara", "Lucas", "Luis"};
        String[] apellidos = {"Mujica", "Levinsonas", "Gomez", "Suarez"};
        nombreMasApellido(nombres, apellidos);
    }

    public static void nombreMasApellido(String[] nombres, String[] apellidos) {
        for (int i = 0; i < nombres.length && i < apellidos.length; i++) {
            System.out.printf(i + 1 + ". " + nombres[i] + " " + apellidos[i] + "\n");
        }
    }
}
