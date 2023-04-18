/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import modelo.Jugador;
import logica.Juego;

/**
 *
 * @author Sebastián
 */
public class VentanaJuego extends JFrame {
    
    private String[] Tematica;    
    private JLabel TituloMenu;
    private JPanel jpContenido;
    private GridLayout glEstadisticas;
    private JPanel jpEstadisticas;
    private JPanel jpBotones;
    private JButton btnColores;
    private JButton btnFrutas;
    private JButton btnAnimales;
    private JLabel jlTitulo;
    private JLabel jlJugador;
    private JLabel jlPalabras;
    private JLabel jlAciertos;
    private JLabel jlFallos;
    
    private Juego juego;
    
    public VentanaJuego(Jugador jugador) {
        juego = new Juego(jugador);
        juego.getJugador();
    }
    
    public VentanaJuego(String[] Tematica){
        this.Tematica = Tematica;
        initComponents();
    }
    
    //public VentanaJuego(String Jugador){
        //this.Jugador = Jugador;
    //}
    
    private void initComponents() {
        setTitle("Juego");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,530);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        
        jlTitulo = new JLabel("FUGA DE LETRAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 36));
        
        jpContenido.setBackground(new java.awt.Color(178, 221, 185));
        jpContenido.setSize(520,400);        
        jpContenido.setBounds(0,0, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 519,50);
        jlTitulo.setForeground(Color.BLACK); 
        
        glEstadisticas = new GridLayout(2,2);
        jpEstadisticas = new JPanel();
        jpEstadisticas.setBackground(new java.awt.Color(0, 221, 185));
        jpEstadisticas.setSize(400,100);        
        jpEstadisticas.setBounds(55,100, 400, 100);
        
        
        String nombre = juego.getJugador();
        nombre =    nombre.substring(0,1).toUpperCase() + 
                    nombre.substring(1).toLowerCase();
        jlJugador = new JLabel(nombre,SwingConstants.CENTER );
        jlJugador.setFont(new java.awt.Font("Arial", 0, 25));
        jpEstadisticas.add(jlJugador);
        
        jpContenido.add(jlTitulo);
        jpEstadisticas.setLayout(glEstadisticas);
        jpContenido.add(jpEstadisticas);
        
        btnColores = new JButton("COLORES");
        btnColores.setFont(new java.awt.Font("Arial", 0, 25));
        btnColores.setBounds(50,150, 410,50);
        btnColores.setBackground(new java.awt.Color(245, 166, 166));
        btnColores.setForeground(new java.awt.Color(0, 0, 0));
        btnColores.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnFrutas = new JButton("FRUTAS");
        btnFrutas.setFont(new java.awt.Font("Arial", 0, 25));
        btnFrutas.setBounds(50,220, 410,50);
        btnFrutas.setBackground(new java.awt.Color(124, 168, 233));
        btnFrutas.setForeground(new java.awt.Color(0, 0, 0));
        btnFrutas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnAnimales = new JButton("ANIMALES");
        btnAnimales.setFont(new java.awt.Font("Arial", 0, 25));
        btnAnimales.setBounds(50,290, 410,50);
        btnAnimales.setBackground(new java.awt.Color(245, 218, 166));
        btnAnimales.setForeground(new java.awt.Color(0, 0, 0));
        btnAnimales.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnColores);
        jpContenido.add(btnFrutas);
        jpContenido.add(btnAnimales);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
    }
}
    
