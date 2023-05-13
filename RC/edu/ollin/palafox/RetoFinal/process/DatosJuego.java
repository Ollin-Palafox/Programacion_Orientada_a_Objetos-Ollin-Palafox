package edu.ollin.palafox.RetoFinal.process;

public class DatosJuego {

    // Atributos del Jugador
    private String nombre;
    public int vida = 100;
    public int poder = 2;
    public int materialesRecolectados;
    public int maderaRecolectada;
    public int hadasRescatadas;
    public int nuevaArea;
    public int areaActual;
    public int areaPresente;

    // Atributos del Mago
    public int poderMago = 10;

    // Atributos del Ogro
    public int vidaOgro = 26;
    public int poderOgro = 10;

    // Atributos de las Casas
    public int hadasconCasa;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getMaterialesRecolectados() {
        return materialesRecolectados;
    }

    public void setMaterialesRecolectados(int materialesRecolectados) {
        this.materialesRecolectados = materialesRecolectados;
    }

    public int getHadasRescatadas() {
        return hadasRescatadas;
    }

    public void setHadasRescatadas(int hadasRescatadas) {
        this.hadasRescatadas = hadasRescatadas;
    }

    public int getNuevaArea() {
        return nuevaArea;
    }

    public void setNuevaArea(int nuevaArea) {
        this.nuevaArea = nuevaArea;
    }

    public int getAreaActual() {
        return areaActual;
    }

    public void setAreaActual(int areaActual) {
        this.areaActual = areaActual;
    }

    public int getAreaPresente() {
        return areaPresente;
    }

    public void setAreaPresente(int areaPresente) {
        this.areaPresente = areaPresente;
    }

    public int getPoderMago() {
        return poderMago;
    }

    public void setPoderMago(int poderMago) {
        this.poderMago = poderMago;
    }

    public int getVidaOgro() {
        return vidaOgro;
    }

    public void setVidaOgro(int vidaOgro) {
        this.vidaOgro = vidaOgro;
    }

    public int getPoderOgro() {
        return poderOgro;
    }

    public void setPoderOgro(int poderOgro) {
        this.poderOgro = poderOgro;
    }

    public int getHadasconCasa() {
        return hadasconCasa;
    }

    public void setHadasconCasa(int hadasconCasa) {
        this.hadasconCasa = hadasconCasa;
    }

    // Constructor de la clase Juego
    public void Juego(String nombre, int vida, int poder, int materialesRecolectados, int hadasRescatadas,
                 int poderMago, int vidaOgro, int poderOgro, int hadasconCasa, int areaActual, int areaPresente) {
        this.nombre = nombre;
        this.vida = vida;
        this.poder = poder;
        this.materialesRecolectados = materialesRecolectados;
        this.hadasRescatadas = hadasRescatadas;
        this.poderMago = poderMago;
        this.vidaOgro = vidaOgro;
        this.poderOgro = poderOgro;
        this.hadasconCasa = hadasconCasa;
        this.areaActual = areaActual;
        this.areaPresente = areaPresente;
    }
    public void aumentarHadas(){
        setHadasRescatadas(hadasRescatadas++);
    }
    public void resetearVidas() {
        vida = getVida();
        vidaOgro = 26;
        if (poder>=30){
            vidaOgro = 150;
        }
        if (poder>=50){
            vidaOgro = 300;
        }
    }
}

