/**
 * Problema: Cuadro de Honor
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Imprime en orden alfabético a los alumnos con promedio de 9.5 o más,
 * usando una lista simple propia.
 */

import java.util.Scanner;

/**
 * Lee nombres y promedios, guarda solo a los del cuadro de honor y los imprime.
 */
public class Main {

    /**
     * Lee la siguiente línea que no esté vacía.
     * @param sc lector de la entrada
     * @return la línea sin espacios sobrantes
     */
    private static String leerLinea(Scanner sc) {
        String linea = sc.nextLine().trim();
        while (linea.isEmpty()) {
            linea = sc.nextLine().trim();
        }
        return linea;
    }

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos = Integer.parseInt(leerLinea(sc));

        ListaSimple cuadro = new ListaSimple();
        for (int i = 0; i < alumnos; i++) {
            String nombre = leerLinea(sc); // el nombre puede tener espacios, se lee la línea completa
            double promedio = Double.parseDouble(leerLinea(sc));
            if (promedio >= 9.5) {
                cuadro.insertarOrdenado(nombre);
            }
        }

        cuadro.imprimir();
    }
}
