package edu.ollin.palafox.RetoFinal.process;

public class Inventario extends DatosJuego {

    public void recolectarMadera() {
        // Genera un número aleatorio entre 1 y 3 para la cantidad de madera recolectada
        maderaRecolectada = (int) (Math.random() * 3) + 1;
        // Añade la cantidad de madera recolectada a los materiales recolectados del jugador
        materialesRecolectados += maderaRecolectada;
        System.out.println("Recolectaste: " + maderaRecolectada + " de madera");
        Movimiento movimiento = new Movimiento();
        setNuevaArea(2);
        movimiento.moverse(nuevaArea);
    }

    public void checarInventario() {
        System.out.println("Tienes: " + getMaterialesRecolectados() + " de madera");
        System.out.println("Tienes: " + getHadasRescatadas() + " Hadas rescatadas");
        System.out.println("Hay " + getHadasconCasa() + " Hadas en la villa");
        Movimiento movimiento = new Movimiento();
        setNuevaArea(1);
        movimiento.moverse(nuevaArea);
    }
}

