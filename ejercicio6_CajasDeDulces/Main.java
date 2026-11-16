/**
 * Problema: Cajas de dulces
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Calcula la máxima suma de K cajas seguidas usando una lista simple propia.
 */

import java.util.Scanner;

/**
 * Lee las cajas, las guarda en la lista e imprime la suma máxima.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cajas = sc.nextInt();
        int k = sc.nextInt();

        ListaSimple estante = new ListaSimple();
        for (int i = 0; i < cajas; i++) {
            estante.insertarFinal(sc.nextInt());
        }

        System.out.println(estante.sumaMaxima(k));
    }
}
