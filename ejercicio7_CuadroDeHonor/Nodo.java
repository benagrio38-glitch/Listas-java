/**
 * Problema: Cuadro de Honor
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista simple; guarda el nombre de un alumno.
 */

/**
 * Nodo de una lista simple con el nombre de un alumno.
 */
public class Nodo {
    private String nombre;
    private Nodo siguiente;

    /**
     * Crea un nodo sin enlazar.
     * @param nombre nombre del alumno
     */
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    /** @return el nombre del alumno */
    public String getNombre() { return nombre; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }
}
