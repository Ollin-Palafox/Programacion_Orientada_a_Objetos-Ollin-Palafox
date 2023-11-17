package edu.ollin.palafox.reto6.ui;

import java.util.Scanner;

import static edu.ollin.palafox.reto5.process.Juegopalabras.ObtenerPalabra;

/**
 * Esta clase representa la interfaz de línea de comandos (CLI) para el juego de palabras.
 * Permite al usuario interactuar con el juego a través de un menú.
 */
public class CLI {

    /**
     * Muestra el menú de opciones y permite al usuario interactuar con el juego.
     * El juego se ejecuta hasta que el usuario ingrese "0" para salir.
     */
    public static void MuestraElMenu() {
        Scanner teclado = new Scanner(System.in);
        String entrada = "";

        while (!entrada.equals("0")) {
            System.out.println("\nElija nivel dificultad...");
            System.out.println("(1) --> Fácil");
            System.out.println("(2) --> Intermedio");
            System.out.println("(3) --> Avanzado");
            System.out.println("(0) --> SALIR");

            try {
                entrada = teclado.nextLine();

                if (entrada.equals("0")) {
                    System.out.println("\n\nFIN DEL PROGRAMA");
                    break;
                }

                int nivel = Integer.parseInt(entrada);

                if (nivel < 1 || nivel > 3) {
                    throw new IllegalArgumentException("Opción no válida.");
                }

                // Pedimos una palabra en base al nivel de dificultad
                String palabra = ObtenerPalabra(entrada);

                if (palabra == null) {
                    System.out.println("Escoja una opción válida.");
                } else {
                    String letra = "";
                    System.out.print("\nPruebe una letra [0 = SALIR]: ");
                    letra = teclado.nextLine().toLowerCase();
                    {
                        while (!letra.equals("0")) {
                            if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                                System.out.println("Por favor, ingrese solo una letra.");
                            } else {
                                if (palabra.contains(letra)) {
                                    System.out.println("\nEsa letra SI existe en la palabra:");
                                    for (int i = 0; i < palabra.length(); i++) {
                                        if (palabra.charAt(i) == letra.charAt(0)) {
                                            System.out.print(palabra.charAt(i));
                                        } else {
                                            System.out.print('*');
                                        }
                                    }
                                } else {
                                    System.out.println("Esa letra NO existe en la palabra");
                                }
                            }

                            System.out.print("\nPruebe otra letra [0 = SALIR]: ");
                            letra = teclado.nextLine();
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, ingrese un número.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        teclado.close();
    }
}
