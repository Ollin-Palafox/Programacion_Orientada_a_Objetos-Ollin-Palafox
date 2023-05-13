package edu.ollin.palafox.RetoFinal.process;

import java.util.Random;
import java.util.Scanner;

public class Combate extends DatosJuego {
    public void combateOgro() {
        System.out.println("El ogro puede atacarte o defenderse");
        System.out.println("Vencelo y rescataras 1 hada");
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    opcion = r.nextInt(2) + 1;
                    switch (opcion) {
                        case 1:
                            System.out.println("El ogro te ataca y te quita " + poderOgro + " puntos de vida.");
                            vida -= poderOgro;
                            vidaOgro -= poder;
                            break;
                        case 2:
                            System.out.println("El ogro se defiende y el daño que le haces se reduce a la mitad.");
                            vidaOgro -= poder / 2;
                            break;
                    }
                    System.out.println("Tu vida: " + vida);
                    System.out.println("Vida del ogro: " + vidaOgro);
                    break;
                case 2:
                    System.out.println("Has decidido salir del combate");
                    Movimiento movimiento = new Movimiento();
                    setNuevaArea(3);
                    movimiento.moverse(nuevaArea);
                    return;
                default:
                    System.out.println("Opción inválida. Escoge una opción válida.");
            }

            // Comprobar si la vida del ogro o la vida del personaje llegaron a 0
            if (vidaOgro <= 0) {
                System.out.println("¡Ganaste el combate contra el ogro!");
                System.out.println("Rescataste 1 hada");
                aumentarHadas();
                Movimiento movimiento = new Movimiento();
                setNuevaArea(3);
                movimiento.moverse(nuevaArea);
                return;
            } else if (vida <= 0) {
                System.out.println("Has muerto");
                System.out.println("Bad Ending: Morido");
                return;
            }

        } while (vidaOgro > 0 && vida > 0);
    }


    public void Victoria() {
        Movimiento movimiento = new Movimiento();
        if (getHadasconCasa()>9 && getHadasconCasa()<20){
            System.out.println("El poder del mago ahora es 9");
            setPoderMago(getPoderMago() - 1);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>19 && getHadasconCasa()<30){
            System.out.println("El poder del mago ahora es 8");
            setPoderMago(getPoderMago() - 2);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>29 && getHadasconCasa()<40){
            System.out.println("El poder del mago ahora es 7");
            setPoderMago(getPoderMago() - 3);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>39 && getHadasconCasa()<50){
            System.out.println("El poder del mago ahora es 6");
            setPoderMago(getPoderMago() - 4);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>49 && getHadasconCasa()<60){
            System.out.println("El poder del mago ahora es 5");
            setPoderMago(getPoderMago() - 5);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>59 && getHadasconCasa()<70){
            System.out.println("El poder del mago ahora es 4");
            setPoderMago(getPoderMago() - 6);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>69 && getHadasconCasa()<80){
            System.out.println("El poder del mago ahora es 3");
            setPoderMago(getPoderMago() - 7);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>79 && getHadasconCasa()<90){
            System.out.println("El poder del mago ahora es 2");
            setPoderMago(getPoderMago() - 8);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>89 && getHadasconCasa()<100){
            System.out.println("El poder del mago ahora es 1");
            setPoderMago(getPoderMago() - 9);
            poderMago = 10;
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
        if (getHadasconCasa()>=100){
            System.out.println("El poder del mago ahora es 0");
            setPoderMago(getPoderMago() - 10);
            setNuevaArea(3);
            movimiento.moverse(nuevaArea);
        }
            if (getPoderMago() <= 0) {
                System.out.println("Felicidades has rescatado a las hadas y has despojado al Mago de su poder. Ya puedes descansar");
                System.out.println("Fin del juego");
            }
        }
    }
