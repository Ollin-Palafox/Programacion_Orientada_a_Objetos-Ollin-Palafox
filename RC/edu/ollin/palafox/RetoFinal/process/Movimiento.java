package edu.ollin.palafox.RetoFinal.process;
import java.util.*;
public class Movimiento extends DatosJuego {

    /**
     * Método para moverse a una nueva área.
     * @param nuevaArea entero que indica la nueva área a la que se moverá el usuario.
     */
    public void moverse(int nuevaArea) {
        switch (nuevaArea) {
            case 1 -> {
                this.areaActual = 1;
                System.out.println("Te has movido a la Villa.");
                setAreaPresente(1);
                acciones();
            }
            case 2 -> {
                this.areaActual = 2;
                System.out.println("Te has movido al Bosque.");
                setAreaPresente(2);
                acciones();
            }
            case 3 -> {
                this.areaActual = 3;
                System.out.println("Te has movido al Castillo.");
                setAreaPresente(3);
                acciones();
            }
            default -> System.out.println("No encuentras ningun otro lugar mas que los anteriores.");
        }
    }

    /**
     * Método que permite realizar acciones en el área actual.
     */
    public void acciones(){
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        switch (this.areaPresente) {
            case 1:
                //Presenta las acciones que se pueden hacer en la villa
                System.out.println("Que quieres hacer?");
                System.out.println("1.Construir casa");
                System.out.println("2.Checar inventario");
                System.out.println("3.Ir al bosque");
                System.out.println("4.Ir al castillo");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        Construccion construccion = new Construccion();
                        construccion.construirCasa();
                    }
                    case 2 -> inventario.checarInventario();
                    case 3 -> {
                        setAreaActual(2);
                        moverse(areaActual);
                    }
                    case 4 -> {
                        setAreaActual(3);
                        moverse(areaActual);
                    }
                    default -> System.out.println("Vamos escoge una de las otras");
                }
            case 2:
                //Presenta las acciones que se pueden hacer en el bosque
                System.out.println("Que quieres hacer?");
                System.out.println("1.Recolectar madera");
                System.out.println("2.Ir a la villa");
                System.out.println("3.Ir al castillo");
                int opcion2 = scanner.nextInt();
                switch (opcion2) {
                    case 1 -> inventario.recolectarMadera();
                    case 2 -> {
                        setAreaActual(1);
                        moverse(areaActual);
                    }
                    case 3 -> {
                        setAreaActual(3);
                        moverse(areaActual);
                    }
                    default -> System.out.println("Vamos escoge una de las otras");
                }
                break;
            case 3:
                //Presenta las acciones que se pueden hacer en el castillo
                System.out.println("Que quieres hacer?");
                System.out.println("1.Combatir al Ogro");
                System.out.println("2.Ir a la villa");
                System.out.println("3.Ir al Bosque");
                System.out.println("4.Checar poder del mago");
                Combate combate = new Combate();
                int opcion3 = scanner.nextInt();
                switch (opcion3) {
                    case 1 -> combate.combateOgro();
                    case 2 -> {
                        setAreaActual(1);
                        moverse(areaActual);
                    }
                    case 3 -> {
                        setAreaActual(2);
                        moverse(areaActual);
                    }
                    case 4 -> combate.Victoria();
                    default -> System.out.println("Vamos escoge una de las otras");
                }
                break;
            default:
                System.out.println("No encuentras ningun otro lugar mas que los anteriores.");
        }
        scanner.close();
    }

}
