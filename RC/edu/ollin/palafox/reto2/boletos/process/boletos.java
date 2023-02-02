package edu.ollin.palafox.reto2.boletos.process;

public class boletos {
public static String calcularCosto(String tipo){
    double child=70.00;
    double adult=100;
    double senior=50.00;
    switch (tipo) {
        case "A" -> System.out.println("Escogiste el boleto A que cuesta" + adult);
        case "N" -> System.out.println("Escogiste el boleto N que cuesta" + child);
        case "I" -> System.out.println("Escogiste el boleto I que cuesta" + senior);
        case "B" -> System.out.println("Escogiste el boleto B que cuesta" + child);
        default -> System.out.println("No exite este tipo de boleto");
    }
    return tipo;
}
}
