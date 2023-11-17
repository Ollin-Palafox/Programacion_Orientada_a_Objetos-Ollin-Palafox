package edu.ollin.palafox.Reto_Regularizacion.ui;
import edu.ollin.palafox.Reto_Regularizacion.process.Lector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * La clase CLI (Interfaz de línea de comandos) proporciona métodos para leer un archivo de comandos y llamar a un método para ejecutar los comandos.
 */
public class CLI {
    /**
     * Lee un archivo de comandos y llama al método ejecutarComando de la clase Lector para ejecutar cada comando.
     */
    public static void lectura() {
        String archivo = "C:\\Users\\ollin\\Downloads\\comandos.txt"; // Nombre del archivo de comandos

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    Lector.ejecutarComando(linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
