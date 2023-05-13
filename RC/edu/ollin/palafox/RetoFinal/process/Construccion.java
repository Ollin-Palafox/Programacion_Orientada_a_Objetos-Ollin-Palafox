package edu.ollin.palafox.RetoFinal.process;

public class Construccion extends DatosJuego {
    /**
     * Este método construye una casa en el juego si el jugador tiene los materiales necesarios.
     * Si tiene 5 unidades de madera y al menos 1 hada rescatada, se construye la casa, aumentando la cantidad de hadas con casa en 1,
     * disminuyendo la cantidad de materiales recolectados en 5 y la cantidad de hadas rescatadas en 1.
     * Además, la vida y el poder del jugador aumentan en 1 unidad.
     * Si no tiene los materiales necesarios, el método muestra un mensaje indicando que necesita 5 unidades de madera y 1 hada rescatada.
     * En ambos casos, el método mueve al jugador a la nueva área correspondiente.
     */
    public void construirCasa() {
        if (getMaterialesRecolectados() >= 5 && getHadasRescatadas() >= 1) {
            System.out.println("¡Casa construida!");
            setHadasconCasa(getHadasconCasa()+1);
            setMaterialesRecolectados(materialesRecolectados - 5);
            setHadasRescatadas(getHadasRescatadas() - 1);
            setVida(getVida() + 1);
            setPoder(getPoder() + 1);
            System.out.println("Tu vida y poder aumentan en 1 unidad");
            Movimiento movimiento = new Movimiento();
            setNuevaArea(1);
            movimiento.moverse(nuevaArea);
        } else {
            System.out.println("Necesitas 5 de madera y 1 hada rescatada.");
            Movimiento movimiento = new Movimiento();
            setNuevaArea(1);
            movimiento.moverse(nuevaArea);
        }
    }
}
