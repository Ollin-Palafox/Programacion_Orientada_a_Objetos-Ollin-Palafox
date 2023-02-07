package edu.ollin.palafox.reto2.boletos.ui;
import java.util.Scanner;
import edu.ollin.palafox.reto2.boletos.process.boletos;
public class CLI {
    public static void mostrarMenu(){
        String input="";
        do {
            System.out.println("Introduce el tipo de boleto");
            System.out.println("N) niño: $70.00");
            System.out.println("A) adulto: $100.00");
            System.out.println("I) Adulto mayor con INAPAM: $50.00");
            System.out.println("B) Adulto mayor: $70.00");
            Scanner scanner = new Scanner(System.in);
            String tipo = scanner.nextLine();
            String tipos = boletos.calcularCosto(tipo);
            System.out.println("Otro boleto?(s/n)");
            Scanner scanner2 = new Scanner(System.in);
            input = scanner2.nextLine();
        }
        while (!input.equals("n"));
    }

}
