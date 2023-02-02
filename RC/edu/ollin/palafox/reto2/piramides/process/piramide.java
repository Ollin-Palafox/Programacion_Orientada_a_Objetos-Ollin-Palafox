package edu.ollin.palafox.reto2.piramides.process;
public class piramide {
    public static int asteriscos(String tamano) {
        int filas = Integer.parseInt(tamano);
        for (int altura = 1; altura <= filas; altura++) {
            //Espacios en blanco
            for (int blancos = 1; blancos <= filas - altura; blancos++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
                System.out.print("*");
            }

            System.out.println();
        }
        return filas;
    }
}
