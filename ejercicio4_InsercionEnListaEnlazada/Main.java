/**
 * Problema: Inserción en Lista Enlazada
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Resuelve el problema usando una lista doble propia.
 */

import java.util.Scanner;

/**
 * Lee enteros hasta el fin de la entrada, inserta los -1 e imprime el resultado.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();

        // Se leen valores hasta que se acabe la entrada (EOF)
        while (sc.hasNextInt()) {
            lista.insertarFinal(sc.nextInt());
        }

        int insertados = lista.insertarMenosUnoAntesDeImpares();
        System.out.println(insertados);
        lista.imprimir();
    }
}
