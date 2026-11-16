/**
 * Problema: Comprando agua
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Lista simple propia con los precios de las marcas.
 */

/**
 * Lista simple de precios. Permite insertar al final y buscar el menor.
 */
public class ListaSimple {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Agrega un precio al final de la lista.
     * @param precio precio a guardar
     */
    public void insertarFinal(int precio) {
        Nodo nuevo = new Nodo(precio);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo); // se enlaza después del último
            cola = nuevo;
        }
    }

    /**
     * Recorre toda la lista y devuelve el precio más bajo.
     * @return el menor precio de la lista
     */
    public int buscarMenor() {
        int menor = cabeza.getPrecio(); // se empieza suponiendo que el primero es el menor
        Nodo actual = cabeza.getSiguiente();
        while (actual != null) {
            if (actual.getPrecio() < menor) {
                menor = actual.getPrecio();
            }
            actual = actual.getSiguiente();
        }
        return menor;
    }
}
