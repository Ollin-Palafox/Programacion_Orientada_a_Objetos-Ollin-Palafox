package edu.ollin.palafox.reto2.piramides.ui;
import java.util.Scanner;
import edu.ollin.palafox.reto2.piramides.process.piramide;

public class CLI {
    public static void mostrarMenus(){
        System.out.println("Introduce el numero de filas");
        Scanner scanner=new Scanner(System.in);
        String tamano = scanner.nextLine();
        try {
            int filas = Integer.parseInt(tamano);
        int pirami = piramide.asteriscos(tamano);}
        catch (NumberFormatException e) {
            System.out.println("Entrada inválida, por favor ingrese un número entero.");
        }
    }
}
