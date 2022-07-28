package clases;
/* Entrega ejercicios tema 4
*
En este ejercicio tendréis que crear una clase clases. SmartDevice. Dentro crearéis las clases hijas: herencias. SmartPhone y herencias. SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Generar constructor vacío y con todos los parámetros para cada clase.
Desde una clase clases Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

import herencias.SmartPhone;
import herencias.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone1 = new SmartPhone(987754L, "Apple", "iPhone 12", 564644L, 128, 6);
        SmartWatch watch1 = new SmartWatch(654654L, true, 45644, "Apple", "Watch Series 7");

        System.out.println("\t\tPHONE 1");
        System.out.println("------------------------");
        System.out.println("Marca.......: " + phone1.marca + ".");
        System.out.println("Modelo......: " + phone1.modelo + ".");
        System.out.println("Capacidad...: " + phone1.capacidad + ".");
        System.out.println("Ram.........: " + phone1.ram + ".");
        System.out.println("IMEI........: " + phone1.imei + ".");
        System.out.println("IMEI PHONE..: " + phone1.imeiCelular + ".");
        System.out.println("------------------------\n\n");

        System.out.println("\t\tWATCH 1");
        System.out.println("------------------------");
        System.out.println("Marca.......: " + watch1.marca + ".");
        System.out.println("Modelo......: " + watch1.modelo + ".");
        System.out.println("Datos.......: " + watch1.datos + ".");
        System.out.println("IMEI........: " + watch1.imei + ".");
        System.out.println("IMEI PHONE..: " + watch1.imeiReloj + ".");
        System.out.println("------------------------\n\n");

    }
}
