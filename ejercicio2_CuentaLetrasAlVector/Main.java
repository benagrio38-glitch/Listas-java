/**
 * Problema: cuenta_letras_al_vector
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Cuenta cuántas veces aparece cada letra usando una lista simple propia.
 */

import java.util.Scanner;

/**
 * Lee la cadena, cuenta sus letras con la lista y muestra el resultado.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // La cadena puede venir vacía (0 caracteres), por eso se revisa si hay línea
        String cadena = sc.hasNextLine() ? sc.nextLine().trim() : "";

        ListaSimple alfabeto = new ListaSimple();
        for (int i = 0; i < cadena.length(); i++) {
            alfabeto.contar(cadena.charAt(i));
        }

        System.out.println(alfabeto.lineaDeContadores());
        alfabeto.imprimirLetrasQueAparecen();
    }
}
