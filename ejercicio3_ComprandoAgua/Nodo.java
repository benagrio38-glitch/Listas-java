/**
 * Problema: Comprando agua
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista simple; guarda el precio de una marca de agua.
 */

/**
 * Nodo de una lista simple con un precio.
 */
public class Nodo {
    private int precio;
    private Nodo siguiente;

    /**
     * Crea un nodo sin enlazar.
     * @param precio precio de la marca
     */
    public Nodo(int precio) {
        this.precio = precio;
        this.siguiente = null;
    }

    /** @return el precio guardado */
    public int getPrecio() { return precio; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}
