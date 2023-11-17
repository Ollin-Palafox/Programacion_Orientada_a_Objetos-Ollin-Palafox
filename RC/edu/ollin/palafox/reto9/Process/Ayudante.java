package edu.ollin.palafox.reto9.Process;
/*
Este código define una clase llamada "Ayudante"
que tiene seis atributos privados: "numOjos", "colorPiel", "altura", "nivelCreacion", "nivelArreglo" y "nivelDestructivo".

También tiene un constructor que recibe los seis atributos como parámetros y los asigna a las variables de instancia correspondientes.

La clase tiene seis métodos públicos llamados "getNumOjos", "getColorPiel", "getAltura", "getNivelCreacion", "getNivelArreglo" y "getNivelDestructivo"
cada uno de los cuales devuelve el valor correspondiente del atributo correspondiente.

En resumen, esta clase representa un ayudante con características específicas, como el número de ojos, el color de piel, la altura y diferentes niveles de habilidad.
 */
public class Ayudante {
    private int numOjos;
    private String colorPiel;
    private String altura;
    private int nivelCreacion;
    private int nivelArreglo;
    private int nivelDestructivo;

    public Ayudante(int numOjos, String colorPiel, String altura, int nivelCreacion, int nivelArreglo, int nivelDestructivo) {
        this.numOjos = numOjos;
        this.colorPiel = colorPiel;
        this.altura = altura;
        this.nivelCreacion = nivelCreacion;
        this.nivelArreglo = nivelArreglo;
        this.nivelDestructivo = nivelDestructivo;
    }

    public int getNumOjos() {
        return numOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public String getAltura() {
        return altura;
    }

    public int getNivelCreacion() {
        return nivelCreacion;
    }

    public int getNivelArreglo() {
        return nivelArreglo;
    }

    public int getNivelDestructivo() {
        return nivelDestructivo;
    }
}

