/**
 * Problema: cuenta_letras_al_vector
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Lista simple propia con un nodo por cada letra del alfabeto.
 */

/**
 * Lista simple donde cada nodo es una letra (de la 'a' a la 'z') con su contador.
 */
public class ListaSimple {
    private Nodo cabeza;
    private Nodo cola;

    /**
     * Crea la lista con los 26 nodos del alfabeto, en orden y con contador en 0.
     */
    public ListaSimple() {
        for (char letra = 'a'; letra <= 'z'; letra++) {
            insertarFinal(letra);
        }
    }

    /**
     * Agrega un nodo con la letra al final de la lista.
     * @param letra letra del nuevo nodo
     */
    private void insertarFinal(char letra) {
        Nodo nuevo = new Nodo(letra);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.setSiguiente(nuevo); // el último actual apunta al nuevo
            cola = nuevo;             // el nuevo pasa a ser el último
        }
    }

    /**
     * Busca el nodo de una letra recorriendo desde la cabeza.
     * @param letra letra a buscar
     * @return el nodo de esa letra, o null si no es una letra minúscula
     */
    private Nodo buscar(char letra) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getLetra() == letra) {
                return actual;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    /**
     * Suma uno al contador de la letra indicada.
     * @param letra letra que apareció en la cadena
     */
    public void contar(char letra) {
        Nodo nodo = buscar(letra);
        if (nodo != null) {
            nodo.incrementar();
        }
    }

    /**
     * Arma la primera línea de la salida: los 26 contadores separados por espacio.
     * @return la línea con los contadores
     */
    public String lineaDeContadores() {
        StringBuilder linea = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            linea.append(actual.getVeces());
            if (actual.getSiguiente() != null) {
                linea.append(" ");
            }
            actual = actual.getSiguiente();
        }
        return linea.toString();
    }

    /**
     * Imprime una línea por cada letra que sí apareció, en orden alfabético.
     */
    public void imprimirLetrasQueAparecen() {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getVeces() > 0) {
                System.out.println("La letra " + actual.getLetra() + " aparece " + actual.getVeces() + " veces");
            }
            actual = actual.getSiguiente();
        }
    }
}
