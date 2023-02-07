package edu.ollin.palafox.reto1.ui;

import edu.ollin.palafox.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu(){

        System.out.println("Elije la operacion a realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();scanner.nextLine();
        System.out.println("Introduce el primer valor");
        int operando1 = scanner.nextInt();scanner.nextLine();
        System.out.println("Introduce el segundo valor");
        int operando2 = scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion ="";

        switch (option){
            case 1:
                resultado = Calculadora.sumarNumeros(operando1,operando2);
                operacion = "+";
                break;
            case 2:
                resultado = Calculadora.restarNumeros(operando1,operando2);
                operacion="-";
                break;
            case 3:
                resultado = Calculadora.multiplicarNumeros(operando1,operando2);
                operacion="x";
                break;
            case 4:
                resultado = Calculadora.dividirNumeros(operando1,operando2);
                operacion="/";
                break;
            default:
                System.out.printf("No se selecciono ninguna operacion");
                break;
        }
        System.out.printf("El resultado de la operacion es %d %s %d = %d",operando1,operacion,operando2,resultado);
    }
}
