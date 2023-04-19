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
    private JPanel jpContenido;
    private GridLayout PanelBotones;
    private JPanel jpBotones;
    private JButton btnA;
    private JButton btnE;
    private JButton btnI;
    private JButton btnO;
    private JButton btnU;
    private JButton btnTerminar;
    private JLabel jlTitulo;
    private JLabel jlJugador;
    private JLabel jlPalabras;
    private JLabel jlAciertos;
    private JLabel jlFallos;
    private Juego juego;
    
    public VentanaJuego(Jugador jugador, String[] Tematica) {
        juego = new Juego(jugador, Tematica);
        initComponents();
    }
    
    private void initComponents() {
        String nombre = juego.getJugador();
        nombre =    nombre.substring(0,1).toUpperCase() + 
                    nombre.substring(1).toLowerCase();
        setTitle(nombre);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,530);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        jpBotones = new JPanel();
        
        jlTitulo = new JLabel("FUGA DE LETRAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 36));
        
        jpContenido.setBackground(new java.awt.Color(178, 221, 185));
        jpContenido.setSize(520,500);        
        jpContenido.setBounds(0,0, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 519,50);
        jlTitulo.setForeground(Color.BLACK); 
        
        jlJugador = new JLabel("Jugador: "+nombre,SwingConstants.CENTER );
        jlJugador.setFont(new java.awt.Font("Arial", 0, 25));
        jlJugador.setBounds(0,60,520,50);
        
        jlPalabras = new JLabel("Palabras mostradas: ",SwingConstants.CENTER );
        jlPalabras.setFont(new java.awt.Font("Arial", 0, 25));
        jlPalabras.setBounds(100,100,250,50);
        
        jlAciertos = new JLabel("Aciertos: ",SwingConstants.CENTER );
        jlAciertos.setFont(new java.awt.Font("Arial", 0, 25));
        jlAciertos.setBounds(100,140,125,50);
        
        jlFallos = new JLabel("Fallos: ",SwingConstants.CENTER );
        jlFallos.setFont(new java.awt.Font("Arial", 0, 25));
        jlFallos.setBounds(240,140,125,50);
        
        jpContenido.add(jlJugador);
        jpContenido.add(jlPalabras);
        jpContenido.add(jlAciertos);
        jpContenido.add(jlFallos);
        jpContenido.add(jlTitulo);
        
        PanelBotones = new GridLayout(1,5);
        jpBotones.setLayout(PanelBotones);
        jpContenido.add(jpBotones);
        jpBotones.setBackground(new java.awt.Color(178, 221, 185));
        jpBotones.setSize(450,100);        
        jpBotones.setBounds(30,300, 450, 100);
        
        PanelBotones.setHgap(10);
        
        btnA = new JButton("A");
        btnA.setFont(new java.awt.Font("Arial", 0, 25));
//        btnA.setBounds(50,150, 410,50);
        btnA.setBackground(new java.awt.Color(245, 166, 166));
        btnA.setForeground(new java.awt.Color(0, 0, 0));
        btnA.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnE = new JButton("E");
        btnE.setFont(new java.awt.Font("Arial", 0, 25));
//        btnE.setBounds(50,290, 410,50);
        btnE.setBackground(new java.awt.Color(245, 218, 166));
        btnE.setForeground(new java.awt.Color(0, 0, 0));
        btnE.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));        
        
        btnI = new JButton("I");
        btnI.setFont(new java.awt.Font("Arial", 0, 25));
//        btnI.setBounds(50,220, 410,50);
        btnI.setBackground(new java.awt.Color(124, 168, 233));
        btnI.setForeground(new java.awt.Color(0, 0, 0));
        btnI.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnO = new JButton("O");
        btnO.setFont(new java.awt.Font("Arial", 0, 25));
//        btnO.setBounds(50,290, 410,50);
        btnO.setBackground(new java.awt.Color(245, 218, 166));
        btnO.setForeground(new java.awt.Color(0, 0, 0));
        btnO.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnU = new JButton("U");
        btnU.setFont(new java.awt.Font("Arial", 0, 25));
//        btnU.setBounds(50,290, 410,50);
        btnU.setBackground(new java.awt.Color(245, 218, 166));
        btnU.setForeground(new java.awt.Color(0, 0, 0));
        btnU.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpBotones.add(btnA);
        jpBotones.add(btnE);
        jpBotones.add(btnI);
        jpBotones.add(btnO);
        jpBotones.add(btnU);
        
        btnTerminar = new JButton("Terminar Juego");
        btnTerminar.setFont(new java.awt.Font("Arial", 0, 25));
        btnTerminar.setBounds(50,450, 450,50);
        btnTerminar.setBackground(new java.awt.Color(245, 218, 166));
        btnTerminar.setForeground(new java.awt.Color(0, 0, 0));
        btnTerminar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnTerminar);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
    }
}
    
