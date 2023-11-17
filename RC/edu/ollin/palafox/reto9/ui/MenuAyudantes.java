package edu.ollin.palafox.reto9.ui;
import edu.ollin.palafox.reto9.Process.Ayudante;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
/*
Este código define una clase llamada "MenuAyudantes" que contiene dos métodos: "menu" y "generarAyudantes".

El método "menu" es el encargado de mostrar un menú de opciones al usuario y manejar la entrada del usuario.
El menú ofrece dos opciones: generar ayudantes o salir. Si el usuario elige generar ayudantes, se llama al método "generarAyudantes".
Si el usuario elige salir, se imprime un mensaje de despedida y el bucle termina.

El método "generarAyudantes" genera cinco objetos de tipo "Ayudante" con atributos aleatorios y los almacena en un array.
Luego, itera sobre el array y muestra los atributos de cada objeto por pantalla.

El código maneja la entrada del usuario utilizando un bloque try-catch.
Si el usuario ingresa algo que no es un número entero, se captura una excepción de tipo "InputMismatchException" y se imprime un mensaje de error.
Luego, se limpia el buffer del scanner para evitar problemas de lectura de entrada.
 */

public class MenuAyudantes {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Generar ayudantes");
            System.out.println("2. Salir");
            System.out.print("Opción: ");

            try {
                opcion = scanner.nextInt();
                switch(opcion) {
                    case 1:
                        generarAyudantes();
                        break;
                    case 2:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número entero. Intente de nuevo.");
                scanner.nextLine(); // limpiar el buffer del scanner
            }

            System.out.println();
        } while (opcion != 2);

        scanner.close();
    }

    public static void generarAyudantes() {
        Ayudante[] ayudantes = new Ayudante[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int numOjos = random.nextInt(2) + 1;
            String colorPiel = random.nextInt(2) == 0 ? "amarilla" : "morada";
            String altura = random.nextInt(2) == 0 ? "mediano" : "alto";
            int nivelCreacion = random.nextInt(5) + 1;
            int nivelArreglo = random.nextInt(5) + 1;
            int nivelDestructivo = random.nextInt(5) + 1;
            ayudantes[i] = new Ayudante(numOjos, colorPiel, altura, nivelCreacion, nivelArreglo, nivelDestructivo);
        }

        for (int i = 0; i < 5; i++) {
            Ayudante ayudante = ayudantes[i];
            System.out.println("Ayudante " + (i+1) + ":");
            System.out.println("- Número de ojos: " + ayudante.getNumOjos());
            System.out.println("- Color de piel: " + ayudante.getColorPiel());
            System.out.println("- Altura: " + ayudante.getAltura());
            System.out.println("- Nivel de creación: " + ayudante.getNivelCreacion());
            System.out.println("- Nivel de arreglo: " + ayudante.getNivelArreglo());
            System.out.println("- Nivel destructivo: " + ayudante.getNivelDestructivo());
            System.out.println();
        }
    }
}
