/**
 * Problema: Cajas de dulces
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Lista simple propia con las cajas del estante, en orden.
 */

/**
 * Lista simple de cajas. Calcula la mayor suma de K cajas seguidas
 * moviendo dos punteros por la lista (ventana deslizante).
 */
public class ListaSimple {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Agrega una caja al final de la lista.
     * @param dulces cantidad de dulces de la caja
     */
    public void insertarFinal(int dulces) {
        Nodo nuevo = new Nodo(dulces);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo); // se enlaza después del último
            cola = nuevo;
        }
    }

    /**
     * Calcula la máxima cantidad de dulces que se pueden llevar tomando K cajas juntas.
     * @param k número de cajas seguidas que se pueden tomar
     * @return la suma máxima de dulces
     */
    public int sumaMaxima(int k) {
        // Paso 1: sumar las primeras K cajas. Al terminar, "fin" queda en la caja K+1
        int suma = 0;
        Nodo fin = cabeza;
        for (int i = 0; i < k; i++) {
            suma += fin.getDulces();
            fin = fin.getSiguiente();
        }
        int maxima = suma;

        // Paso 2: deslizar la ventana una caja a la vez.
        // "inicio" es la caja que sale y "fin" la que entra.
        Nodo inicio = cabeza;
        while (fin != null) {
            suma = suma + fin.getDulces() - inicio.getDulces();
            if (suma > maxima) {
                maxima = suma;
            }
            inicio = inicio.getSiguiente(); // los dos punteros avanzan juntos
            fin = fin.getSiguiente();
        }
        return maxima;
    }
}
