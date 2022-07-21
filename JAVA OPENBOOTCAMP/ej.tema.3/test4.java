public class test4 {
    /*
     * Para practicar la encapsulación:
     * 
     * Crear clase Persona.
     * Crear variables las privadas edad, nombre y telefono de la clase Persona.
     * Crear gets y sets de cada propiedad.
     * Crear un objeto persona en el main.
     * Utiliza los gets y sets para darle valores a las propiedades edad, nombre y
     * telefono, por último muéstralas por consola.
     */
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(28);
        persona.setNombre("Dario");
        persona.setTelefono(2235061018L);

        System.out.printf("\n%s, tiene: %d anios.\n", persona.getNombre(), persona.getEdad());
        System.out.printf("\nEl telefono de %s es: %d.", persona.getNombre(), persona.getTelefono());
    }
}

class Persona {

    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono() {
        return this.telefono;
    }

}
