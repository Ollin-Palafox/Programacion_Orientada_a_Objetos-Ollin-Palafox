package edu.ollin.palafox.reto12.ui;
import edu.ollin.palafox.reto12.process.JrEnginner;
import java.util.List;
import java.util.Scanner;
import static edu.ollin.palafox.reto12.process.JrEnginner.*;

public class CLI {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        List<JrEnginner> listaJrEnginner = crearListaJrEnginnerAleatoria();
        boolean salir = false;

        while (!salir) {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Crear lista de JrEnginner");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Guardar lista en un archivo");
            System.out.println("4. leer el archivo e imprimirlo");
            System.out.println("5. Filtro entre 20 y 25 años");
            System.out.println("6. Imprimir de manera alfabetica");
            System.out.println("7. Imprimir ultimo empleado teniendo en cuenta la edad y el nombre (alfabetico)");
            System.out.println("0. Salir");
            System.out.print("Ingresa tu opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearListaJrEnginnerAleatoria();
                    break;
                case 2:
                    imprimirListaJrEnginner(listaJrEnginner);
                    break;
                case 3:
                    JrEnginner.guardarArchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner1.txt", listaJrEnginner);
                    break;
                case 4:
                    JrEnginner.leerArchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner1.txt");
                    JrEnginner.imprimirarchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner1.txt");
                    break;
                case 5:
                    List<JrEnginner> listaFiltrada = JrEnginner.filtrarJrEnginnerentre20y25("C:\\Users\\ollin\\Downloads\\lista_jrenginner1.txt");
                    JrEnginner.imprimirJrEnginnerMayoresDe20(listaFiltrada.toString());
                    break;
                case 6:
                    List<JrEnginner> lista = JrEnginner.ordenarListaJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner1.txt");
                    break;
                case 7:
                    encontrarUltimoEmpleado("C:\\Users\\ollin\\Downloads\\lista_jrenginner1.txt");
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
