package edu.ollin.palafox.reto11.process;

public class Programador extends Empleado {
    public int salario;
    public String nombre;
    int edad;
    public String lenguajeProgramacion;

    public Programador(String nombre, int edad, int salario , String lenguajeProgramacion) {
        super(edad, nombre,salario);
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;
        this.lenguajeProgramacion = lenguajeProgramacion;

    }

    public void escribirCodigo() {
        System.out.println(this.nombre + " está escribiendo código en " + this.lenguajeProgramacion + "...");

    }
}
