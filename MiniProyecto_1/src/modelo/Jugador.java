/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Sebastián
 */
public class Jugador {
    private String nombre;
    private int palabras;
    private int aciertos;
    private int fallos;
    
    public Jugador(){
        nombre = "Jugador 1";
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public Jugador(int palabras, int aciertos, int fallos) {
        this.palabras = palabras;
        this.aciertos = aciertos;
        this.fallos = fallos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlabras(int palabras) {
        this.palabras = palabras;
    }
    
    public int getPalabras() {
        return palabras;
    }

    public int getAciertos() {
        return aciertos;
    }

    public int getFallos() {
        return fallos;
    }
    
    
}
