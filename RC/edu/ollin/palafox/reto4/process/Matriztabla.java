package edu.ollin.palafox.reto4.process;

public class Matriztabla {
    /**
     * Clase para calcular las estadistivas de ventas en diferentes sabores de cafe frio en diferentes trimestres
     */
    public static class EstadisticasCafes {
        private int[][] ventas;
        /**
         * Constructor de la clase EstadisticasCafes. Recibe una matriz de enteros que representa las ventas de diferentes
         * sabores de café frío en diferentes trimestres del año.
         *
         * @param ventas La matriz de ventas de café frío.
         */
        public EstadisticasCafes(int[][] ventas) {
            this.ventas = ventas;
        }
        /**
         * Calcula las estadísticas de ventas de café frío y las imprime en la consola. Imprime el trimestre con más ventas
         * por cada sabor de café frío, así como el trimestre con más ventas en general.
         */
        public void calcularEstadisticas() {
            // Validar las dimensiones de la matriz
            if (ventas.length != 4) {
                System.out.println("La matriz debe tener 4 filas");
                return;
            }
            for (int i = 0; i < ventas.length; i++) {
                if (ventas[i].length != 4) {
                    System.out.println("Cada fila de la matriz debe tener 4 columnas");
                    return;
                }
            }

            // Calcular el trimestre más vendido por sabor
            for (int i = 0; i < ventas.length; i++) {
                int max = ventas[i][0];
                int trimestreMax = 1;
                for (int j = 1; j < ventas[i].length; j++) {
                    if (ventas[i][j] > max) {
                        max = ventas[i][j];
                        trimestreMax = j + 1;
                    }
                }
                System.out.println("El trimestre más vendido de " + obtenerSabor(i) + " es el trimestre " + trimestreMax);
            }

            // Calcular el trimestre más vendido en general
            int maxVentas = 0;
            int trimestreMax = 1;
            for (int j = 0; j < ventas[0].length; j++) {
                int ventasTrimestre = 0;
                for (int i = 0; i < ventas.length; i++) {
                    // Validar que los valores sean positivos
                    if (ventas[i][j] < 0) {
                        System.out.println("Los valores en la matriz deben ser números positivos");
                        return;
                    }
                    ventasTrimestre += ventas[i][j];
                }
                if (ventasTrimestre > maxVentas) {
                    maxVentas = ventasTrimestre;
                    trimestreMax = j + 1;
                }
            }
            System.out.println("El trimestre más vendido en general es el trimestre " + trimestreMax);
        }

        // Método para obtener el nombre del sabor a partir del índice en la matriz
        private static String obtenerSabor(int indice) {
            switch (indice) {
                case 0:
                    return "Chocolate";
                case 1:
                    return "Vainilla";
                case 2:
                    return "Fresa";
                case 3:
                    return "Oreo";
                default:
                    return "";
            }
        }
}
}
