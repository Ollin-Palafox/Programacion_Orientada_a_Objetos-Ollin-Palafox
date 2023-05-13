package edu.ollin.palafox.RetoFinal.ui;
import edu.ollin.palafox.RetoFinal.process.DatosJuego;
import edu.ollin.palafox.RetoFinal.process.Movimiento;
import java.util.Scanner;
public class CLI {
    public static void menu() {
        Scanner aventurero = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("Merasmus Demise");
        System.out.println("-----------------");
        System.out.println("Nombra a tu aventurero: ");
        DatosJuego jugador = new DatosJuego();
        jugador.setNombre(aventurero.next());
        System.out.println("Bienvenido al mundo de Dustbowl. Tu mision acabar con Merasmus");
        System.out.println("ha capturado a las hadas de la villa");
        System.out.println("junta madera en el bosque y pelea con ogros en el castillo para salvar un hada");
        System.out.println("para asi reconstruir la villa");
        System.out.println("Estas preparado Aventurero " + jugador.getNombre()+"?");
        System.out.println("1. Estoy Listo      2. No estoy listo");
        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();
            switch(decision) {
                case 1:
                    Scanner scanner1= new Scanner(System.in);
                    System.out.println("A donde quieres ir?");
                    System.out.println("1.Villa");
                    System.out.println("2.Bosque");
                    System.out.println("3.Castillo");
                    int nuevaArea = scanner1.nextInt();
                    Movimiento movimiento = new Movimiento();
                    movimiento.moverse(nuevaArea);
                    break;
                case 2:
                    System.out.println("Decidiste dejar el mundo a su suerte.");
                    System.out.println("Secret Ending: Abandono");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        scanner.close();
    }
}
