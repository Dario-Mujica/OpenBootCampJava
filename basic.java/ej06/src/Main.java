import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
**Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
8.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante
(desde "main", por ejemplo).
Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
9.Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero
dado en el parámetro "fileIn" al fichero dado en "fileOut".
10.Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
*/
public class Main {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[0] = "Dario";
        names[1] = "Tamara";
        names[2] = "Lucas";
        names[3] = "Agustin";
        names[4] = "Guillermo";

        int arrayMatrices[][] = new int[2][2];
        arrayMatrices[0][0] = 1;
        arrayMatrices[0][1] = 2;
        arrayMatrices[1][0] = 3;
        arrayMatrices[1][1] = 4;

        Vector<Integer> vectorParaBorrar = new Vector();
        vectorParaBorrar.add(10);
        vectorParaBorrar.add(20);
        vectorParaBorrar.add(30);
        vectorParaBorrar.add(40);
        vectorParaBorrar.add(50);

        ArrayList<String> listString = new ArrayList<String>();
        listString.add("Dario");
        listString.add("Tamara");
        listString.add("Lucas");
        listString.add("Agustin");

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        llenaYborraListaInt(listaNumeros);
        String textoAinvertir = "HOLA, SOY DARIO MUJICA";

        System.out.println(reverseIt(textoAinvertir, (textoAinvertir.length())-1));

        /* punto 6
         *Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        LinkedList<String> linkedList = new LinkedList<String>(listString);
        System.out.println(listString);
        System.out.println(linkedList);
        */

        //recorreArrayString(names);
        //recorreMatrizInt(arrayMatrices);
        //reccoreYeliminaVector(vectorParaBorrar);
        //deArrayList2LinkedList(listString, linkedList);
    }

    /*punto 1
     *Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     */

    static String reverseIt(String texto, int index) {
        if (index == 0) {
            return texto.charAt(0) + "";
        }
        char letra = texto.charAt(index);
        return letra + reverseIt(texto, index - 1);
    }

    /* punto 2
     *Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
     */

    public static void recorreArrayString(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + ". " + names[i]);
        }
    }


    /* punto 3
     *Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
     */
    public static void recorreMatrizInt(int[][] matrizInt) {

        for (int i = 0; i < matrizInt.length; i++) {
            for (int j = 0; j < matrizInt[1].length; j++) {
                System.out.printf("[%d][%d] = %d \n", i, j, matrizInt[i][j]);
            }
        }
    }

    /* punto 4
     *Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
     */
    public static void reccoreYeliminaVector(Vector<Integer> vector) {
        vector.removeElementAt(2);
        vector.removeElementAt(3);
        System.out.println(vector);
    }


    /* punto 5
     *Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
     *  El problema de esto es que al llenarse el array subyacente, se crea un nuevo vector que duplica los datos del anterio, lo que hace que se consuma
     * muchisima memoria.
     */


    /* punto 7
     *Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
     */

    public static void llenaYborraListaInt(ArrayList<Integer> listaNumeros) {

        for (int i = 1; i <= 10; i++) {
            listaNumeros.add(i);
        }
        System.out.println("Lista con todos los numeros: " + listaNumeros);

        for (int i = 1; i <= 10; i++) {
            listaNumeros.removeIf(n -> (n % 2 == 0));
        }
        System.out.println("Lista sin los numeros pares: " + listaNumeros);
    }

}