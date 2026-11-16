/**
 * Problema: Formados en la cafetería
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Lista simple propia que funciona como cola (FIFO).
 */

/**
 * Lista enlazada simple usada como cola: se inserta al final y se elimina al inicio.
 * Guarda una referencia a la cabeza y otra a la cola para que ambas operaciones sean O(1).
 */
public class ListaSimple {
    private Nodo cabeza; // primer nodo (el siguiente en ser atendido)
    private Nodo cola;   // último nodo (el último que llegó)

    /**
     * Indica si la lista no tiene nodos.
     * @return true si está vacía
     */
    public boolean estaVacia() {
        return cabeza == null;
    }

    /**
     * Agrega un nombre al final de la lista.
     * @param nombre nombre de la persona que llega a formarse
     */
    public void insertarFinal(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (estaVacia()) {
            // Lista vacía: el nuevo nodo es cabeza y cola al mismo tiempo
            cabeza = nuevo;
            cola = nuevo;
        } else {
            // El último nodo actual apunta al nuevo y el nuevo pasa a ser la cola
            cola.setSiguiente(nuevo);
            cola = nuevo;
        }
    }

    /**
     * Quita el primer nodo de la lista y devuelve su nombre.
     * @return el nombre de la persona atendida
     */
    public String eliminarInicio() {
        String nombre = cabeza.getNombre();
        cabeza = cabeza.getSiguiente(); // la cabeza avanza al siguiente nodo
        if (cabeza == null) {
            cola = null; // si ya no quedan nodos, la cola también queda vacía
        }
        return nombre;
    }
}
