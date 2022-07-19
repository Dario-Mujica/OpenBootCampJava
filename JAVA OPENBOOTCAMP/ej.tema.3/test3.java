public class test3 {

    /*
     * En este ejercicio practicarás las estructuras de control, para ello deberás
     * crear:
     * 
     * Usando un if, crear una condición que compare si la variable numeroIf es
     * positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     * 
     * Crea un bucle While, este bucle tendrá que tener como condición que la
     * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
     * bucle deberá:
     * 
     * Incrementar el valor de la variable en uno cada vez que se ejecute.
     * 
     * Mostrarlo por pantalla cada vez que se ejecute.
     * 
     * Para el bucle Do While, deberás crear la misma estructura que en el While,
     * pero solo se debe ejecutar una vez.
     * 
     * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
     * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
     * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
     * pantalla.
     * 
     * Por último, para el Switch, deberás crear la variable estacion, y distintos
     * case para las cuatro estaciones del año. Dependiendo del valor de la variable
     * estacion se deberá mandar un mensaje por consola informando de la estación en
     * la que está. También habrá que poner un default para cuando el valor de la
     * variable no sea una estación.
     */
    public static void main(String[] args) {

        int numeroIf = -1;
        int numeroWhile = 0;
        var estacion = "VERANO";

        if (numeroIf > 0) {
            System.out.printf("\nEL NUMERO %d ES MAYOR A 0.\n", numeroIf);
        } else if (numeroIf == 0) {
            System.out.printf("\nEL NUMERO %d ES IGUAL A 0.\n", numeroIf);
        } else {
            System.out.printf("\nEL NUMERO %d ES MENOR A 0.\n", numeroIf);
        }

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile > 10);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "VERANO":
                System.out.printf("\nESTAMOS EN VERANO");
                break;
            case "OTONIO":
                System.out.printf("\nESTAMOS EN OTONIO");
                break;
            case "PRIMAVERA":
                System.out.printf("\nESTAMOS EN PRIMAVERA");
                break;
            case "INVIERNO":
                System.out.printf("\nESTAMOS EN INVIERNO");
                break;
            default:
                System.out.printf("\nEL VALOR DE LA VARIABLE NO REPRESENTA UNA ESTACION VALIDA");
                break;
        }
    }

}
