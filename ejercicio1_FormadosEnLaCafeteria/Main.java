/**
 * Problema: Formados en la cafetería
 * Autor: Oscar Manuel Ayala Ortiz
 * Grupo: ________
 * Fecha: 15/11/2026
 * Descripción: Resuelve el problema usando dos listas simples propias como colas,
 * una para trabajadores y otra para alumnos.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Procesa los eventos LLEGA y ATIENDE. Al atender se le da preferencia
 * a la cola de trabajadores; los alumnos solo pasan si no hay trabajadores.
 */
public class Main {
    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer partes = new StringTokenizer("");

    /**
     * Lee la siguiente palabra de la entrada (se usa BufferedReader porque
     * puede haber hasta 200,000 eventos y Scanner sería lento).
     * @return la siguiente palabra
     * @throws IOException si falla la lectura
     */
    private static String siguientePalabra() throws IOException {
        while (!partes.hasMoreTokens()) {
            partes = new StringTokenizer(lector.readLine());
        }
        return partes.nextToken();
    }

    /**
     * Punto de entrada del programa.
     * @param args no se usan
     * @throws IOException si falla la lectura
     */
    public static void main(String[] args) throws IOException {
        ListaSimple trabajadores = new ListaSimple();
        ListaSimple alumnos = new ListaSimple();
        StringBuilder salida = new StringBuilder();

        int eventos = Integer.parseInt(siguientePalabra());
        for (int i = 0; i < eventos; i++) {
            String accion = siguientePalabra();
            if (accion.equals("LLEGA")) {
                String tipo = siguientePalabra();
                String nombre = siguientePalabra();
                if (tipo.equals("TRABAJADOR")) {
                    trabajadores.insertarFinal(nombre);
                } else {
                    alumnos.insertarFinal(nombre);
                }
            } else { // ATIENDE
                // Primero los trabajadores; si no hay, se atiende a un alumno
                if (!trabajadores.estaVacia()) {
                    salida.append(trabajadores.eliminarInicio()).append("\n");
                } else {
                    salida.append(alumnos.eliminarInicio()).append("\n");
                }
            }
        }
        System.out.print(salida);
    }
}
