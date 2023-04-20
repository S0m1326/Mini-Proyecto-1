/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Autores:  Luis Carlos Lucero A <lucero.luis@correounivalle.edu.co> <202027560>
          Sebastian Orrego Marin <orrego.sebastian@correounivalle.edu.co> <201941144>
Grupo: 01
N° Laboratorio: 01
Fecha de realización: 20/04/2023
*/
package logica;

import modelo.Jugador;

/**
 *
 * @author Sebastián
 */
public class Juego {
    private String [] Tematica;
    private Jugador jugador;
    private Jugador jugadorEst;
    
    public Juego(Jugador jugador, String Tematica[]){
        this.jugador = jugador;
        this.Tematica = Tematica;
    }
    
    public Juego(Jugador jugadorEst){
        this.jugadorEst = jugadorEst;
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }

    public String[] getTematica() {
        return Tematica;
    }
    
    public int getPalabras(){
        return jugadorEst.getPalabras();
    }
    
    public int getAciertos(){
        return jugadorEst.getAciertos();
    }
    
    public int getFallos(){
        return jugadorEst.getFallos();
    }
}

