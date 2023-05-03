package edu.ollin.palafox.reto11.ui;
import edu.ollin.palafox.reto11.process.JrEnginner;
import java.util.List;
import java.util.Scanner;
import static edu.ollin.palafox.reto11.process.JrEnginner.*;

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
            System.out.println("4. leer el archivo");
            System.out.println("5. Imprimir archivo leido");
            System.out.println("6. Filtro para mayor de 20 años");
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
                    JrEnginner.guardarArchivoJrEnginner("listaJrEnginner.txt", listaJrEnginner);
                    break;
                case 4:
                    JrEnginner.leerArchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
                    break;
                case 5:
                    JrEnginner.imprimirarchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
                    break;
                case 6:
                    List<JrEnginner> listaFiltrada = JrEnginner.filtrarJrEnginnerMayoresDe20("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
                    JrEnginner.imprimirJrEnginnerMayoresDe20(listaFiltrada.toString());
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
