package edu.ollin.palafox.Reto_Regularizacion.ui;
import edu.ollin.palafox.Reto_Regularizacion.process.Lector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CLI {
//Metodo que lee el archivo y llama al metodo ejecutarComando
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
