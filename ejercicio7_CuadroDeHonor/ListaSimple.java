/**
 * Problema: Cuadro de Honor
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Lista simple propia que mantiene los nombres en orden alfabético.
 */

/**
 * Lista simple ordenada alfabéticamente. Cada nombre se inserta en su lugar.
 */
public class ListaSimple {
    private Nodo cabeza;

    /**
     * Inserta un nombre respetando el orden alfabético.
     * @param nombre nombre del alumno
     */
    public void insertarOrdenado(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        // Caso 1: lista vacía o el nombre va antes que la cabeza -> se vuelve la nueva cabeza
        if (cabeza == null || nombre.compareTo(cabeza.getNombre()) < 0) {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
            return;
        }

        // Caso 2: se busca el nodo después del cual va el nuevo.
        // Hay que pararse en el ANTERIOR porque en una lista simple no se puede regresar.
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null
                && actual.getSiguiente().getNombre().compareTo(nombre) <= 0) {
            actual = actual.getSiguiente();
        }
        nuevo.setSiguiente(actual.getSiguiente()); // el nuevo apunta al que seguía
        actual.setSiguiente(nuevo);                // el actual apunta al nuevo
    }

    /**
     * Imprime todos los nombres, uno por línea.
     */
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getNombre());
            actual = actual.getSiguiente();
        }
    }
}
