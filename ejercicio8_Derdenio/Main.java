/**
 * Problema: Derdenio y sus Estructuras de Datos
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: GTID244
 * Fecha: 15/11/2026
 * Descripción: Combina dos listas ordenadas y las imprime de mayor a menor
 * usando una lista doble propia.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Lee las dos listas, las mezcla e imprime el resultado de mayor a menor.
 */
public class Main {
    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer partes = new StringTokenizer("");

    /**
     * Lee el siguiente número de la entrada (con BufferedReader por si N es grande).
     * @return el siguiente número
     * @throws IOException si falla la lectura
     */
    private static long siguienteNumero() throws IOException {
        while (!partes.hasMoreTokens()) {
            partes = new StringTokenizer(lector.readLine());
        }
        return Long.parseLong(partes.nextToken());
    }

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     * @throws IOException si falla la lectura
     */
    public static void main(String[] args) throws IOException {
        int n = (int) siguienteNumero();

        ListaDoble primera = new ListaDoble();
        for (int i = 0; i < n; i++) {
            primera.insertarFinal(siguienteNumero());
        }
        ListaDoble segunda = new ListaDoble();
        for (int i = 0; i < n; i++) {
            segunda.insertarFinal(siguienteNumero());
        }

        ListaDoble combinada = ListaDoble.mezclar(primera, segunda);
        combinada.imprimirAlReves();
    }
}
