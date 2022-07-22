public class test5 {
    /*
     * Crea una clase Persona con las siguientes variables:
     * 
     * La edad
     * El nombre
     * El teléfono
     * 
     * Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
     * esta nueva clase tendrá la variable credito solo para esa clase.
     * Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
     * edad, el telefono, el nombre y el credito, tienes que darles valor y
     * mostrarlas por pantalla.
     * Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de
     * Persona, y con una variable salario que solo tenga la clase Trabajador.
     */
    public static void main(String[] args) {

        Credito credito = new Credito();
        credito.setEdad(28);
        credito.setNombre("Dario");
        credito.setTelefono(2235061018L);
        credito.setCredito(15000);
        System.out.printf("\n%s, tiene: %d anios.\n", credito.getNombre(), credito.getEdad());
        System.out.printf("\nEl telefono de %s es: %d.\n", credito.getNombre(), credito.getTelefono());
        System.out.printf("\n%s, tiene: $%.2f de credito disponible.\n", credito.getNombre(), credito.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(28);
        trabajador.setNombre("Dario");
        trabajador.setTelefono(2235061018L);
        trabajador.setSueldo(225000);

        System.out.printf("\nEl sueldo bruto de %s es de: $%.2f.", trabajador.getNombre(), trabajador.getSueldo());
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

class Credito extends Persona {

    private float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private float sueldo;

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return this.sueldo;
    }

}