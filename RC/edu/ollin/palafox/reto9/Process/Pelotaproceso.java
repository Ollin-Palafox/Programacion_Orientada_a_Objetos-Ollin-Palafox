package edu.ollin.palafox.reto9.Process;
/*
Este código define una clase llamada "Pelotaproceso", que representa una pelota con ciertas características como color, rapidez y poder.
La clase tiene tres atributos privados: "color" de tipo String, "rapidez" de tipo int y "poder" de tipo int.

La clase tiene un constructor que acepta tres parámetros (color, rapidez y poder) y los asigna a los atributos correspondientes de la instancia de la clase.

La clase también tiene dos métodos públicos: "disminuirRapidez()" y "aumentarPoder()". El método "disminuirRapidez()" disminuye la rapidez de la pelota en 1, mientras que el método "aumentarPoder()" aumenta el poder de la pelota en 1.
Además, la clase tiene cuatro métodos getters y setters públicos para acceder y modificar los atributos privados "color", "rapidez" y "poder".

En resumen, esta clase representa una pelota con ciertas características y permite cambiar y obtener los valores de estas características a través de métodos específicos.
 */
public class Pelotaproceso {
    // Atributos
    private String color;
    private int rapidez;
    private int poder;

    // Constructor
    public Pelotaproceso(String color, int rapidez, int poder) {
        this.color = color;
        this.rapidez = rapidez;
        this.poder = poder;
    }

    // Métodos
    public void disminuirRapidez() {
        rapidez--;
    }

    public void aumentarPoder() {
        poder++;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
