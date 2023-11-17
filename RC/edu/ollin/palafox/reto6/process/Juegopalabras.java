package edu.ollin.palafox.reto6.process;
import java.util.Random;

/**
 * Aqui encontraremos el proceso con el cual elaboramos el codigo del porgrama es decir que esto es solo la parte de procesos
 */
public class Juegopalabras {

    //Palabras aleatorias que se usaran para determinado nivel
    private static final String[] FACIL = {
            "amor", "vaso", "pelo", "vela", "peso", "lago", "mesa", "taco"
    };

    private static final String[] INTERMEDIO = {
            "cabalgar", "daiquiri", "ebanista", "fabricar",
            "gabinete", "habanera", "naciente", "obelisco"
    };

    private static final String[] AVANZADO = {
            "abnegaciones", "chubasqueros", "deliberacion",	"emocionantes",
            "enloquecedor",	"inmobiliaria",	"instrumentos",	"urbanizacion",
            "traumatizado", "trasnochador"
    };

    /**
     * Proporciona una palabra al azar de uno de los arrays de palabras
     * prefijadas, según el nivel de dificultad indicado.
     * @param nivel Valor del nivel de dificultad
     * @return Palabra al azar o valor null si el valor de nivel no es válido.
     */
    public static String ObtenerPalabra(String nivel) {
        Random azar = new Random();
        switch(nivel) {
            case "1":
                return FACIL[azar.nextInt(FACIL.length)];
            case "2":
                return INTERMEDIO[azar.nextInt(INTERMEDIO.length)];
            case "3":
                return AVANZADO[azar.nextInt(AVANZADO.length)];
            default:
                return null;

        }
    }

}