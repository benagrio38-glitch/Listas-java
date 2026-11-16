/**
 * Problema: Derdenio y sus Estructuras de Datos
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Lista doble propia que permite mezclar dos listas ordenadas
 * y recorrerse de atrás hacia adelante.
 */

/**
 * Lista doblemente enlazada de números con referencia a cabeza y cola.
 */
public class ListaDoble {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Agrega un número al final de la lista.
     * @param numero número a agregar
     */
    public void insertarFinal(long numero) {
        Nodo nuevo = new Nodo(numero);
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
     * Mezcla dos listas ordenadas de menor a mayor en una nueva lista también ordenada.
     * Se recorren las dos al mismo tiempo y siempre se pasa el menor de los dos actuales.
     * @param primera primera lista ordenada
     * @param segunda segunda lista ordenada
     * @return una lista nueva con todos los números de menor a mayor
     */
    public static ListaDoble mezclar(ListaDoble primera, ListaDoble segunda) {
        ListaDoble resultado = new ListaDoble();
        Nodo a = primera.cabeza;
        Nodo b = segunda.cabeza;

        // Mientras las dos tengan números, se toma el menor y se avanza en esa lista
        while (a != null && b != null) {
            if (a.getNumero() <= b.getNumero()) {
                resultado.insertarFinal(a.getNumero());
                a = a.getSiguiente();
            } else {
                resultado.insertarFinal(b.getNumero());
                b = b.getSiguiente();
            }
        }
        // Lo que sobre de cualquiera de las dos ya está ordenado, se pasa tal cual
        while (a != null) {
            resultado.insertarFinal(a.getNumero());
            a = a.getSiguiente();
        }
        while (b != null) {
            resultado.insertarFinal(b.getNumero());
            b = b.getSiguiente();
        }
        return resultado;
    }

    /**
     * Imprime la lista desde la cola hasta la cabeza usando el enlace anterior.
     * Como la lista está de menor a mayor, al revés queda de mayor a menor.
     */
    public void imprimirAlReves() {
        StringBuilder linea = new StringBuilder();
        Nodo actual = cola;
        while (actual != null) {
            linea.append(actual.getNumero());
            if (actual.getAnterior() != null) {
                linea.append(" ");
            }
            actual = actual.getAnterior(); // se retrocede un nodo
        }
        System.out.println(linea);
    }
}
