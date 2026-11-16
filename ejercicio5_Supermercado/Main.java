/**
 * Problema: Supermercado
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Imprime el ticket ordenado de mayor a menor precio usando una lista doble propia.
 */

import java.util.Scanner;

/**
 * Lee los productos, los inserta ordenados en la lista e imprime el ticket.
 */
public class Main {

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();

        ListaDoble ticket = new ListaDoble();
        for (int i = 0; i < cantidad; i++) {
            String producto = sc.next();
            double precio = Double.parseDouble(sc.next());
            ticket.insertarOrdenado(producto, precio);
        }

        ticket.imprimirTicket();
    }
}
