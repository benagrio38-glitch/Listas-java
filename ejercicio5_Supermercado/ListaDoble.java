/**
 * Problema: Supermercado
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Lista doble propia que mantiene los productos ordenados de mayor a menor precio.
 */

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Lista doblemente enlazada ordenada por precio (de mayor a menor).
 * Cada producto nuevo se inserta directamente en su lugar.
 */
public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Inserta un producto en la posición que le toca según su precio.
     * Queda antes del primer producto con precio menor o igual.
     * @param producto nombre del producto
     * @param precio precio del producto
     */
    public void insertarOrdenado(String producto, double precio) {
        Nodo nuevo = new Nodo(producto, precio);

        // Caso 1: lista vacía
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            return;
        }

        // Se busca el primer nodo cuyo precio sea menor o igual al nuevo
        Nodo actual = cabeza;
        while (actual != null && actual.getPrecio() > precio) {
            actual = actual.getSiguiente();
        }

        if (actual == null) {
            // Caso 2: es el más barato, va al final
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        } else if (actual == cabeza) {
            // Caso 3: es el más caro, va al inicio
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        } else {
            // Caso 4: va en medio, entre actual.anterior y actual
            Nodo previo = actual.getAnterior();
            previo.setSiguiente(nuevo);
            nuevo.setAnterior(previo);
            nuevo.setSiguiente(actual);
            actual.setAnterior(nuevo);
        }
    }

    /**
     * Imprime el ticket numerado y al final el total de la compra.
     */
    public void imprimirTicket() {
        double total = 0;
        int numero = 1;
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(numero + " | " + actual.getProducto() + " | " + formatear(actual.getPrecio()));
            total += actual.getPrecio();
            numero++;
            actual = actual.getSiguiente();
        }
        System.out.println();
        System.out.println(formatear(total));
    }

    /**
     * Da formato a un precio sin ceros de sobra (23.60 se muestra como 23.6 y 23.00 como 23),
     * redondeando a 6 cifras para quitar errores de los decimales al sumar.
     * @param precio número a formatear
     * @return el precio como texto
     */
    private String formatear(double precio) {
        BigDecimal numero = new BigDecimal(precio).round(new MathContext(6));
        return numero.stripTrailingZeros().toPlainString();
    }
}
