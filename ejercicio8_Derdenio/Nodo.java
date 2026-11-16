/**
 * Problema: Derdenio y sus Estructuras de Datos
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista doble; guarda un número entero y dos enlaces.
 */

/**
 * Nodo de una lista doble: guarda un número, el nodo siguiente y el anterior.
 */
public class Nodo {
    private long numero;
    private Nodo siguiente;
    private Nodo anterior;

    /**
     * Crea un nodo sin enlazar.
     * @param numero número a guardar
     */
    public Nodo(long numero) {
        this.numero = numero;
        this.siguiente = null;
        this.anterior = null;
    }

    /** @return el número del nodo */
    public long getNumero() { return numero; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }

    /** @return el nodo anterior, o null si es el primero */
    public Nodo getAnterior() { return anterior; }

    /** @param anterior nodo que quedará antes de este */
    public void setAnterior(Nodo anterior) { this.anterior = anterior; }
}
