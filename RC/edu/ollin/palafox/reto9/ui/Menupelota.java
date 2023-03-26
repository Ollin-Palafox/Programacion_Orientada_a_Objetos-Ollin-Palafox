package edu.ollin.palafox.reto9.ui;
import edu.ollin.palafox.reto9.Process.Pelotaproceso;
import java.util.Scanner;
/*
Este código define una clase llamada "Menupelota" que contiene un método estático llamado "menu()".
En el método "menu()", se crea una instancia de la clase "Pelotaproceso" con un color "Rojo", una rapidez de 10 y un poder de 5.

Luego, se muestra un menú de opciones utilizando la clase "Scanner" para leer la entrada del usuario desde la consola. El menú tiene tres opciones: disminuir rapidez, aumentar poder y salir.

Dentro del bucle "do-while", se utiliza una estructura de control "switch" para ejecutar la opción elegida por el usuario.
Si el usuario elige la opción 1, se llama al método "disminuirRapidez()" de la instancia de la clase "Pelotaproceso" y se muestra la rapidez actual.
Si el usuario elige la opción 2, se llama al método "aumentarPoder()" de la instancia de la clase "Pelotaproceso" y se muestra el poder actual.
Si el usuario elige la opción 3, se muestra un mensaje de salida del programa y se sale del bucle.

Finalmente, se cierra la instancia de la clase "Scanner" para liberar los recursos utilizados.
 */
public class Menupelota {
    public static void menu() {
        // Crear una pelota
        Pelotaproceso pelota = new Pelotaproceso("Rojo", 10, 5);

        // Mostrar el menú
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Disminuir rapidez");
            System.out.println("2. Aumentar poder");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pelota.disminuirRapidez();
                    System.out.println("Rapidez actual: " + pelota.getRapidez());
                    break;
                case 2:
                    pelota.aumentarPoder();
                    System.out.println("Poder actual: " + pelota.getPoder());
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }
}
