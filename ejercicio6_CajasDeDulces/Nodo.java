/**
 * Problema: Cajas de dulces
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista simple; guarda los dulces de una caja.
 */

/**
 * Nodo de una lista simple con la cantidad de dulces de una caja.
 */
public class Nodo {
    private int dulces;
    private Nodo siguiente;

    /**
     * Crea un nodo sin enlazar.
     * @param dulces cantidad de dulces de la caja
     */
    public Nodo(int dulces) {
        this.dulces = dulces;
        this.siguiente = null;
    }

    /** @return la cantidad de dulces */
    public int getDulces() { return dulces; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}
