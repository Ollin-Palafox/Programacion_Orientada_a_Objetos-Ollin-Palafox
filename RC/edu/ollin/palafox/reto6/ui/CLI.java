package edu.ollin.palafox.reto6.ui;

import java.util.Scanner;

import static edu.ollin.palafox.reto5.process.Juegopalabras.ObtenerPalabra;

/** en este apartado esta el menu de interfaz el cual esta creado para que solo te arroje los resultados con los que el usuario va a interactuar con dicho programa
 *
 */
public class CLI {
    public static void MuestraElMenu() {
        Scanner teclado = new Scanner(System.in);
        String entrada = "";

        while (!entrada.equals("0")) {
            System.out.println("\nElija nivel dificultad...");
            System.out.println("(1) --> Fácil");
            System.out.println("(2) --> Intermedio");
            System.out.println("(3) --> Avanzado");
            System.out.println("(0) --> SALIR");
            entrada = teclado.nextLine();

            if (!entrada.equals("0")) {
                //Pedimos una palabra en base al nivel de dificultad
                String palabra = ObtenerPalabra(entrada);

                if (palabra == null) //Si hemos recibido null, es porque la opcion no es válida
                    System.out.println("Escoja una opción válida.");
                else {
                    String letra = "";
                    System.out.print("\nPruebe una letra [0 = SALIR]: ");
                    letra = teclado.nextLine().toLowerCase();
                    {
                        while (!letra.equals("0")) {
                            if (palabra.contains(letra)) {
                                //Mostramos palabra pero solo enseñando la letra coincidente
                                System.out.println("\nEsa letra SI existe en la palabra:");
                                for (int i = 0; i < palabra.length(); i++) {
                                    if (palabra.charAt(i) == letra.charAt(0)) //Entonces es la letra coincidente
                                        System.out.print(palabra.charAt(i));
                                    else //Si no se tapa con un asterisco
                                        System.out.print('*');
                                }
                            } else
                                System.out.println("Esa letra NO existe en la palabra");

                            System.out.print("\nPruebe otra letra [0 = SALIR]: ");
                            letra = teclado.nextLine();
                        }
                    }
                }
            }
            //cerramos el codigo con un mensaje y con teclado.close para acabarlo
            System.out.println("\n\nFIN DEL PROGRAMA");
        }
    }
}
