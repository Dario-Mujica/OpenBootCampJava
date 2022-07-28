package Interfaces;

public class Coche {
    String marca;
    String modelo;
    String color;
    int anio;
    int cantidadKms;
    int valor;
    boolean estado;

    public Coche() {
    }

    ;

    public Coche(String marca, String modelo, String color, int anio, int cantidadKms, int valor, boolean estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.cantidadKms = cantidadKms;
        this.valor = valor;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", anio=" + anio +
                ", cantidadKms=" + cantidadKms +
                ", valor=" + valor +
                ", estado=" + estado +
                '}';
    }

    public static void imprimirCoche(Coche coche) {
        System.out.println("\nMarca.....: " + coche.marca);
        System.out.println("Modelo....: " + coche.modelo);
        System.out.println("Anio......: " + coche.anio);
        if (coche.estado) {
            System.out.println("El vehiculo esta disponible." + "\n");
        } else {
            System.out.println("El vehiculo no esta disponible." + "\n");
        }
    }
}