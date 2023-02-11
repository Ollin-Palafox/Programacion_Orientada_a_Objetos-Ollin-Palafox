package edu.ollin.palafox.reto3.ui;
import edu.ollin.palafox.reto3.process.Conversor;
import java.util.Scanner;

public class CLI {
   public static void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int decimal;
        String binario;
        String octal;
        String hexadecimal;
        while (opcion != 6) {
             System.out.println("\nMenú de conversiones:");
             System.out.println("1. Convertir de decimal a binario");
             System.out.println("2. Convertir de decimal a octal");
             System.out.println("3. Convertir de binario a decimal");
             System.out.println("4. Convertir de octal a decimal");
             System.out.println("5. Convertir de hexadecimal a decimal");
             System.out.println("6. Salir");
             System.out.print("Seleccione una opción: ");

             try {
                  opcion = Integer.parseInt(sc.nextLine());
             } catch (NumberFormatException e) {
                  System.out.println("Error: Entrada inválida. Introduzca un número entero.");
                  continue;
             }

             switch (opcion) {
                  case 1 -> {
                       System.out.print("Introduzca un número decimal: ");
                       decimal = Integer.parseInt(String.valueOf(Integer.parseInt(sc.nextLine())));
                       System.out.println("El número binario es: " + Conversor.binario(decimal));
                  }
                  case 2 -> {
                       System.out.print("Introduzca un número decimal: ");
                       decimal = Integer.parseInt(String.valueOf(Integer.parseInt(sc.nextLine())));
                       System.out.println("El número binario es: " + Conversor.octal(decimal));
                  }
                  case 3 -> {
                       System.out.print("Introduzca un número binario: ");
                       binario = sc.nextLine();
                       System.out.println("El número decimal es: " + Conversor.binariodecimal(binario));
                  }
                  case 4 -> {
                       System.out.print("Introduzca un número octal: ");
                       octal = sc.nextLine();
                       System.out.println("El número decimal es: " + Conversor.octalDecimal(octal));
                  }
                  case 5 -> {
                       System.out.print("Introduzca un número hexadecimal: ");
                       hexadecimal = sc.nextLine();
                       System.out.println("El número decimal es: " + Conversor.hexadecimalDecimal(hexadecimal));
                  }
                  case 6 -> System.out.println("Gracias por usar el programa");
                  default -> System.out.println("Opción inválida, seleccione una opción del menú");
             }
        }
        sc.close();
    }
}
