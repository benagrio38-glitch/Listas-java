/**
 * Problema: cuenta_letras_al_vector
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista simple; guarda una letra y cuántas veces apareció.
 */

/**
 * Nodo de una lista simple con una letra y su contador.
 */
public class Nodo {
    private char letra;
    private int veces;
    private Nodo siguiente;

    /**
     * Crea un nodo para una letra con contador en 0.
     * @param letra letra que representa el nodo
     */
    public Nodo(char letra) {
        this.letra = letra;
        this.veces = 0;
        this.siguiente = null;
    }

    /** @return la letra del nodo */
    public char getLetra() { return letra; }

    /** @return cuántas veces ha aparecido la letra */
    public int getVeces() { return veces; }

    /** Suma uno al contador de la letra. */
    public void incrementar() { veces++; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}
