package edu.ollin.palafox.reto4.ui;

import edu.ollin.palafox.reto4.process.Matriztabla;

public class CLI {
    /**
     * clase que especifica los valores de la matriz y llama al proceso
     */
    public static void MostrarMenu(){
        // Crear la matriz de datos
        int[][] ventas = {
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}
        };

        Matriztabla.EstadisticasCafes estadisticas = new Matriztabla.EstadisticasCafes(ventas);
        estadisticas.calcularEstadisticas();
    }
}
