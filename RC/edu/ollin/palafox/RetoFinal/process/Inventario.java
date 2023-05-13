package edu.ollin.palafox.RetoFinal.process;
/**

 La clase Inventario representa el inventario del jugador que hereda los datos del juego.

 Contiene métodos para recolectar madera y verificar el inventario del jugador.
 */
public class Inventario extends DatosJuego {
    /**

     Genera un número aleatorio entre 1 y 3 para la cantidad de madera recolectada.
     Agrega la cantidad de madera recolectada a los materiales recolectados del jugador.
     Imprime la cantidad de madera recolectada y mueve al jugador a la nueva área.
     */
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
    /**

     Imprime la cantidad de madera recolectada, hadas rescatadas y hadas con casa en el inventario del jugador.
     Mueve al jugador a la nueva área.
     */
    public void checarInventario() {
        System.out.println("Tienes: " + getMaterialesRecolectados() + " de madera");
        System.out.println("Tienes: " + getHadasRescatadas() + " Hadas rescatadas");
        System.out.println("Hay " + getHadasconCasa() + " Hadas en la villa");
        Movimiento movimiento = new Movimiento();
        setNuevaArea(1);
        movimiento.moverse(nuevaArea);
    }
}

