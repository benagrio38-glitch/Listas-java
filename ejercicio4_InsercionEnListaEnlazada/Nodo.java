/**
 * Problema: Inserción en Lista Enlazada
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista doble; guarda un entero y dos enlaces.
 */

/**
 * Nodo de una lista doble: guarda un valor, el nodo siguiente y el anterior.
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo anterior;

    /**
     * Crea un nodo sin enlazar.
     * @param valor entero a guardar
     */
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    /** @return el valor del nodo */
    public int getValor() { return valor; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }

    /** @return el nodo anterior, o null si es el primero */
    public Nodo getAnterior() { return anterior; }

    /** @param anterior nodo que quedará antes de este */
    public void setAnterior(Nodo anterior) { this.anterior = anterior; }
}
