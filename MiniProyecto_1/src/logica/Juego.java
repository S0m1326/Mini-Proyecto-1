/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Arrays;
import modelo.Jugador;
import vista.VentanaJuego;

/**
 *
 * @author Sebastián
 */
public class Juego {
    private String [] Tematica;
    private Jugador jugador;
    
    public Juego(Jugador jugador, String Tematica[]){
        this.jugador = jugador;
        this.Tematica = Tematica;
    }
    
    public String getJugador(){
        return jugador.getNombre();
    }

    public String[] getTematica() {
        return Tematica;
    }
    
    
}

