/*Entrega ejercicios tema 2
 *Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */

import java.io.IOException;
import java.util.Scanner;


public class ej02 {
    public static void main(String[] args) throws IOException {
        double valorProducto;
        double iva = 1.21;
        double valorMasIva;
        Scanner entradaEscaner = new Scanner(System.in);

        System.out.printf("\n Ingrese el valor del producto: ");
        valorProducto = Double.parseDouble(entradaEscaner.nextLine());
        valorMasIva = sumaIva(valorProducto, iva);
        System.out.printf("\n El precio mas iva es de: $" + valorMasIva);
    }

    static double sumaIva(double valorProducto, double iva) {
        return valorProducto * iva;
    }
}
