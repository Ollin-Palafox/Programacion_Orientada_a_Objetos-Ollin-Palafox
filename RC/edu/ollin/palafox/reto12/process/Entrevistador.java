package edu.ollin.palafox.reto12.process;

public class Entrevistador extends Empleado {

    public String nombre;

    public int edad;

    public String idioma;

    public Entrevistador(String nombre, int edad, int salario, String idioma) {
        super(edad,nombre,salario);
        this.edad = edad;
        this.idioma = idioma;
        this.nombre = nombre;



    }
    public void realizarEntrevista() {
        System.out.println(this.nombre + " está entrevistando en " + this.idioma + " ...");

    }

}
