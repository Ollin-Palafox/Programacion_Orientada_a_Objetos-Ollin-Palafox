package edu.ollin.palafox.reto11.process;
import java.io.*;
import java.util.*;
public class JrEnginner extends Empleado {

    private String RFC; //define una variable de instancia privada llamada "RFC"

    //es el constructor de la clase. Toma tres parámetros: "nombre" (tipo String), "edad" (tipo int) y "rfc" (tipo String).
    //luego asigna el valor del "rfc" a su campo "RFC"
    public JrEnginner(String nombre, int edad, String rfc) {
        super(edad, nombre, 0);
        this.RFC = rfc;
    }

    public String getRFC() {//es un método público que devuelve el valor del campo "RFC".
        return RFC;
    }

    public void setRFC(String RFC) {//es un método público que establece el valor del campo "RFC" al valor pasado como parámetro.
        this.RFC = RFC;
    }

    public static List<JrEnginner> crearListaJrEnginnerAleatoria() { //Metodo que crea la lista de objetos de JrEnginner aleatoriamente
        String[] nombres = {"Juan", "Pedro", "Luis", "Ana", "María", "Sofía", "Jorge", "Carla", "José", "Laura"};
        int[] edades = {20, 18, 21, 22, 24, 26, 28};

        List<JrEnginner> listaJrEnginner = new ArrayList<>();//Crea una nueva lista vacia
        Set<String> nombresUtilizados = new HashSet<>();//Crea un nuevo conjunto vacio de strings para los nombres utilizados

        for (int i = 0; i < 10; i++) {
            String nombre;
            do {
                nombre = nombres[(int) (Math.random() * nombres.length)];
            } while (nombresUtilizados.contains(nombre));
            nombresUtilizados.add(nombre);

            int edad = edades[(int) (Math.random() * edades.length)];

            String rfc = generarRFC();

            JrEnginner jrEnginner = new JrEnginner(nombre, edad, rfc);
            listaJrEnginner.add(jrEnginner);
        }
        System.out.println("Lista creada");
        return listaJrEnginner;
    }

    private static String generarRFC() {//Genera un RFC aleatorio
        String[] letrasRFC = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(letrasRFC[(int) (Math.random() * letrasRFC.length)]);
        }
        sb.append((int) (Math.random() * 100));
        return sb.toString();
    }

    //Toma la lista de objetos creada y los imprime en la consola
    public static void imprimirListaJrEnginner(List<JrEnginner> listaJrEnginner) {
        for (JrEnginner jrEnginner : listaJrEnginner) {
            System.out.println(jrEnginner.getNombre() + ", " + jrEnginner.getEdad() + " años, RFC: " + jrEnginner.getRFC());
        }
    }

    //Es un metodo que toma la lista de objetos JrEnginner de entrada y crea un archivo de texto, que contendra los nombres, edades y RFC
    public static void guardarArchivoJrEnginner(String lista_jrenginner, List<JrEnginner> listaJrEnginner) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
            for (JrEnginner jrEnginner : listaJrEnginner) {
                String linea = jrEnginner.getNombre() + "," + jrEnginner.getEdad() + "," + jrEnginner.getRFC() + "\n";
                fileWriter.write(linea);
            }
            fileWriter.close();
            System.out.println("Archivo creado y actualizado.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    //Es un metodo que permite leer los valores del archivo que contenga  un formato CSV (comma-separated values).
    //Y los guarda en un arraylist
    public static List<JrEnginner> leerArchivoJrEnginner(String nombreArchivo) {
        List<JrEnginner> listaJrEnginner = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String rfc = datos[2];
                JrEnginner jrEnginner = new JrEnginner(nombre, edad, rfc);
                listaJrEnginner.add(jrEnginner);
            }
            br.close();
            System.out.println("Archivo leído correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

        return listaJrEnginner;
    }

    //Este metodo agarra el arraylist que se creo al leer el archivo y lo imprime en la consola
    public static void imprimirarchivoJrEnginner(String lista) {
        List<JrEnginner> listaJrEnginner = leerArchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
        for (JrEnginner jrEnginner : listaJrEnginner) {
            System.out.println(jrEnginner.getNombre() + ", " + jrEnginner.getEdad() + ", " + jrEnginner.getRFC());
        }
    }

    //Este metodo es un filtro que guarda en una nueva lista a todos los objetos de la lista del archivo leido siempre y cuando tengan mas de 20 años
    public static List<JrEnginner> filtrarJrEnginnerMayoresDe20(String lista_jrenginner) {
        List<JrEnginner> listaJrEnginner = leerArchivoJrEnginner("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
        List<JrEnginner> listaJrEnginnerMayoresDe20 = new ArrayList<>();

        for (JrEnginner jrEnginner : listaJrEnginner) {
            if (jrEnginner.getEdad() > 20) {
                listaJrEnginnerMayoresDe20.add(jrEnginner);
            }
        }

        return listaJrEnginnerMayoresDe20;
    }

//Este metodo imprime la lista ya filtrada
    public static void imprimirJrEnginnerMayoresDe20(String lista_jrenginner) {
        List<JrEnginner> listaFiltrada = filtrarJrEnginnerMayoresDe20("C:\\Users\\ollin\\Downloads\\lista_jrenginner.txt");
        if (listaFiltrada.isEmpty()) {
            System.out.println("No se encontraron JrEnginner mayores de 20 años.");
        } else {
            System.out.println("JrEnginner mayores de 20 años:");
            for (JrEnginner jrEnginner : listaFiltrada) {
                System.out.println("Nombre: " + jrEnginner.getNombre() + ", Edad: " + jrEnginner.getEdad());
            }
        }
    }

}
