/**
 * Problema: Inserción en Lista Enlazada
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Lista doble propia que inserta un -1 antes de cada número impar.
 */

/**
 * Lista doblemente enlazada de enteros con referencia a cabeza y cola.
 */
public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Agrega un valor al final de la lista.
     * @param valor entero a agregar
     */
    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo); // el último actual apunta hacia adelante al nuevo
            nuevo.setAnterior(cola);  // el nuevo apunta hacia atrás al último actual
            cola = nuevo;
        }
    }

    /**
     * Inserta un nodo nuevo justo antes del nodo indicado.
     * @param actual nodo delante del cual se inserta
     * @param valor valor del nodo nuevo
     */
    private void insertarAntes(Nodo actual, int valor) {
        Nodo nuevo = new Nodo(valor);
        Nodo previo = actual.getAnterior();

        // Enlaces del nodo nuevo: queda entre "previo" y "actual"
        nuevo.setSiguiente(actual);
        nuevo.setAnterior(previo);

        // El nodo actual ahora tiene al nuevo como anterior
        actual.setAnterior(nuevo);

        if (previo == null) {
            cabeza = nuevo;              // si actual era la cabeza, el nuevo es la nueva cabeza
        } else {
            previo.setSiguiente(nuevo);  // si no, el previo apunta hacia adelante al nuevo
        }
    }

    /**
     * Inserta un -1 antes de cada nodo con número impar.
     * @return la cantidad de nodos insertados
     */
    public int insertarMenosUnoAntesDeImpares() {
        int insertados = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getValor() % 2 != 0) {
                insertarAntes(actual, -1);
                insertados++;
            }
            // Se avanza al siguiente nodo original; el -1 quedó atrás y no se vuelve a revisar
            actual = actual.getSiguiente();
        }
        return insertados;
    }

    /**
     * Imprime la lista con el formato "a -> b -> NULL".
     */
    public void imprimir() {
        StringBuilder linea = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            linea.append(actual.getValor()).append(" -> ");
            actual = actual.getSiguiente();
        }
        linea.append("NULL");
        System.out.println(linea);
    }
}
