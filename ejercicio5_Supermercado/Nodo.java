/**
 * Problema: Supermercado
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Nodo de la lista doble; guarda un producto y su precio.
 */

/**
 * Nodo de una lista doble con el nombre y el precio de un producto.
 */
public class Nodo {
    private String producto;
    private double precio;
    private Nodo siguiente;
    private Nodo anterior;

    /**
     * Crea un nodo sin enlazar.
     * @param producto nombre del producto
     * @param precio precio del producto
     */
    public Nodo(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
        this.siguiente = null;
        this.anterior = null;
    }

    /** @return el nombre del producto */
    public String getProducto() { return producto; }

    /** @return el precio del producto */
    public double getPrecio() { return precio; }

    /** @return el nodo siguiente, o null si es el último */
    public Nodo getSiguiente() { return siguiente; }

    /** @param siguiente nodo que quedará después de este */
    public void setSiguiente(Nodo siguiente) { this.siguiente = siguiente; }

    /** @return el nodo anterior, o null si es el primero */
    public Nodo getAnterior() { return anterior; }

    /** @param anterior nodo que quedará antes de este */
    public void setAnterior(Nodo anterior) { this.anterior = anterior; }
}
