package edu.ollin.palafox.Reto_Regularizacion.process;


public class Lector {
//Metodo que realiza la lectura del comando e identifica que comando es
//Si el comando no cumple con las especificaciones, se manda una alerta de invalidez
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
//Metodo que imprime el comando C
    public static void imprimirCuadrado(String argumento) {
        int ladoC = Integer.parseInt(argumento);
        for (int i = 0; i < ladoC; i++) {
            for (int j = 0; j < ladoC; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//Metodo que imprime el comando T
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

//Metodo que ejecuta el comando P
    public static void imprimirPalindromo(String argumento) {
        StringBuilder sb = new StringBuilder(argumento);
        sb.reverse();
        System.out.println(sb);
    }
//Mtodo que ejecuta el comando S
    public static void imprimirFormatoEspecial(String argumento) {
        StringBuilder sb = new StringBuilder();
        for (char c : argumento.toCharArray()) {
            if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' ||
                    Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'o' ||
                    Character.toLowerCase(c) == 'u') {
                sb.append('*');
            } else {
                sb.append('#');
            }
        }
        System.out.println(sb);
    }
}
