package edu.ollin.palafox.reto11.process;

public class Empleado {
    public String idioma;

    public String departamento;
    public String lenguajeProgramacion;
    public int edad;
    public String nombre;
    public int salario;

    public Empleado(int edad, String nombre, int salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public int getSalario(){
        return salario;
    }

    public void trabajar() {

        System.out.println(this.nombre + " está trabajando con un salario de" + this.salario + "...");
    }


    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void realizarEntrevista() {
        System.out.println(this.nombre + " está entrevistando en " + this.idioma + " ...");

    }

    public void administrar() {
        System.out.println(this.nombre + " está administrando el departamento de " + this.departamento+ "...");
    }

    public void escribirCodigo() {
        System.out.println(this.nombre + " está escribiendo código en " + this.lenguajeProgramacion + "...");

    }


    public String getIdioma() {
        return idioma;
    }


    public int getEdad() {
        return edad;
    }
}