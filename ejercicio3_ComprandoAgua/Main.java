/**
 * Problema: Comprando agua
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Encuentra el precio más bajo usando una lista simple propia.
 */

import java.util.Scanner;

/**
 * Lee los precios, los guarda en la lista e imprime el menor.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marcas = sc.nextInt();

        ListaSimple precios = new ListaSimple();
        for (int i = 0; i < marcas; i++) {
            precios.insertarFinal(sc.nextInt());
        }

        System.out.println(precios.buscarMenor());
    }
}
