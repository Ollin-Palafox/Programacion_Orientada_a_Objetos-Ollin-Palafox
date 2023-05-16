package edu.ollin.palafox.Reto_Regularizacion.process;

/**
 * La clase Lector proporciona métodos para ejecutar comandos y realizar diversas operaciones en función del tipo de comando.
 */
public class Lector {
    /**
     * Ejecuta un comando y realiza una operación específica según el tipo de comando proporcionado.
     * Si el comando no cumple con las especificaciones, se muestra una alerta de invalidez.
     *
     * @param comando el comando a ejecutar en formato "tipo:argumento"
     */
    public static void ejecutarComando(String comando) {
        String[] partes = comando.split(":");

        if (partes.length != 2) {
            System.out.println("Comando inválido: " + comando);
            return;
        }

        String tipo = partes[0];
        String argumento = partes[1];
//Switch que identifica que tipo de comando se va a realizar
        switch (tipo) {
            case "C" -> imprimirCuadrado(argumento);
            case "T" -> imprimirTriangulo(argumento);
            case "P" -> imprimirPalindromo(argumento);
            case "S" -> imprimirFormatoEspecial(argumento);
            default -> System.out.println("Comando desconocido: " + comando);
        }
    }
    /**
     * Imprime un cuadrado de asteriscos basado en el valor del argumento.
     *
     * @param argumento el tamaño del lado del cuadrado
     */
    public static void imprimirCuadrado(String argumento) {
        int ladoC = Integer.parseInt(argumento);
        for (int i = 0; i < ladoC; i++) {
            for (int j = 0; j < ladoC; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /**
     * Imprime un triángulo de asteriscos basado en la altura proporcionada en el argumento.
     *
     * @param argumento la altura del triángulo
     */
    public static void imprimirTriangulo(String argumento) {
        int alturaT = Integer.parseInt(argumento);
        int espacios = alturaT - 1;

        for (int i = 1; i <= alturaT; i++) {
            // Imprimir espacios
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
            espacios--;
        }
    }

    /**
     * Imprime el palíndromo de la cadena proporcionada en el argumento.
     *
     * @param argumento la cadena a invertir e imprimir
     */
    public static void imprimirPalindromo(String argumento) {
        StringBuilder sb = new StringBuilder(argumento);
        sb.reverse();
        System.out.println(sb);
    }
    /**
     * Imprime una representación especial de la cadena proporcionada en el argumento,
     * donde las vocales se reemplazan por '*' y las consonantes por '#'.
     *
     * @param argumento la cadena para la transformación y la impresión
     */
    public static void imprimirFormatoEspecial(String argumento) {
        StringBuilder sb = new StringBuilder();
        boolean contieneNumeros = false;

        for (char c : argumento.toCharArray()) {
            if (Character.isDigit(c)) {
                contieneNumeros = true;
                break;
            }

            if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' ||
                    Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' ||
                    Character.toLowerCase(c) == 'u') {
                sb.append('*');
            }
            else {
                sb.append('#');
            }
        }

        if (contieneNumeros) {
            System.out.println("El argumento contiene números.");
        } else {
            System.out.println(sb);
        }
    }

}
