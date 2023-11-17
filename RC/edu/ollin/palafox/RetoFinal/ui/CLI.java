package edu.ollin.palafox.RetoFinal.ui;
import edu.ollin.palafox.RetoFinal.process.DatosJuego;
import edu.ollin.palafox.RetoFinal.process.Movimiento;
import java.util.Scanner;
public class CLI {
    /**
     * Muestra el menú principal del juego y permite al usuario interactuar con él mediante la entrada de texto en la consola.
     * El usuario puede nombrar a su aventurero y elegir entre ir a la villa, el bosque o el castillo.
     * Si elige ir al bosque, puede recolectar madera y si elige ir al castillo, puede luchar contra ogros.
     * Si gana la pelea contra el ogro, rescata un hada y puede moverse a otra área.
     */
    public static void menu() {
        Scanner aventurero = new Scanner(System.in);

        // Saludo al usuario y solicito su nombre
        System.out.println("-----------------");
        System.out.println("Merasmus Demise");
        System.out.println("-----------------");
        System.out.println("Nombra a tu aventurero: ");
        DatosJuego jugador = new DatosJuego();
        jugador.setNombre(aventurero.next());

        // Muestro la introducción del juego
        System.out.println("Bienvenido al mundo de Dustbowl. Tu mision acabar con Merasmus");
        System.out.println("ha capturado a las hadas de la villa");
        System.out.println("junta madera en el bosque y pelea con ogros en el castillo para salvar un hada");
        System.out.println("para asi reconstruir la villa");
        System.out.println("Estas preparado Aventurero " + jugador.getNombre() + "?");

        // Pregunto si el usuario está listo para jugar
        System.out.println("1. Estoy Listo      2. No estoy listo");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();

        // Según la decisión del usuario, se muestra el menú para elegir la próxima área o se finaliza el juego
        switch (decision) {
            case 1 -> {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("A donde quieres ir?");
                System.out.println("1.Villa");
                System.out.println("2.Bosque");
                System.out.println("3.Castillo");
                int nuevaArea = scanner1.nextInt();
                Movimiento movimiento = new Movimiento();
                movimiento.moverse(nuevaArea);
            }
            case 2 -> {
                System.out.println("Decidiste dejar el mundo a su suerte.");
                System.out.println("Secret Ending: Abandono");
            }
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
