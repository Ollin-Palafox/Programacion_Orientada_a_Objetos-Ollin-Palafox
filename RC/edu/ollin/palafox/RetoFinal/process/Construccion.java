package edu.ollin.palafox.RetoFinal.process;

public class Construccion extends DatosJuego {

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
