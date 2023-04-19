/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import modelo.Jugador;
import logica.Juego;

/**
 *
 * @author Sebastián
 */
public class VentanaEstadisticas extends JFrame {
    
    private JButton btnSalir;
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JLabel jlPalabras;
    private JLabel jlFallos;
    private JLabel jlAciertos;
    private int num_Palabras;
    private int num_Aciertos;
    private int num_Fallos;
    private double prc_Aciertos;
    private double prc_Fallos;
    private Juego Juego;
    
    public VentanaEstadisticas(Jugador jugadorEst) {
        Juego = new Juego(jugadorEst);
        initComponents();
    }
    
    private void initComponents() {
        num_Palabras = Juego.getPalabras();
        num_Fallos = Juego.getFallos();
        num_Aciertos = Juego.getAciertos();
        prc_Aciertos = (double) num_Aciertos / (num_Aciertos+num_Fallos) * 100;
        prc_Fallos = (double) num_Fallos / (num_Aciertos+num_Fallos) * 100;
        
        setTitle("Estadisticas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,400);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        
        jlTitulo = new JLabel("ESTADÍSTICAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
        jlPalabras = new JLabel("Cantidad de Palabras: " + num_Palabras,SwingConstants.CENTER );
        jlPalabras.setFont(new java.awt.Font("Arial", 0, 25));
        jlFallos = new JLabel("Cantidad de Fallos: " + num_Fallos + " - " + prc_Fallos + "%",SwingConstants.CENTER );
        jlFallos.setFont(new java.awt.Font("Arial", 0, 25));
        jlAciertos = new JLabel("Cantidad de Aciertos: " + num_Aciertos + " - " + prc_Aciertos + "%",SwingConstants.CENTER );
        jlAciertos.setFont(new java.awt.Font("Arial", 0, 25));
        
        jpContenido.setBackground(new java.awt.Color(124, 168, 233));
        jpContenido.setSize(520,500);        
        jpContenido.setBounds(0,0, 520, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,30, 520,70);
        jlTitulo.setForeground(Color.BLACK); 
        
        jlPalabras.setBounds(0,100, 520,35);
        jlPalabras.setForeground(new Color(0,0,0));
        
        jlFallos.setBounds(0,150, 520,35);
        jlFallos.setForeground(new Color(0,0,0));
        
        jlAciertos.setBounds(0,200, 520,35);
        jlAciertos.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(jlPalabras);
        jpContenido.add(jlFallos);
        jpContenido.add(jlAciertos);
        
        btnSalir = new JButton("Salir");
        btnSalir.setFont(new java.awt.Font("Arial", 0, 25));
        btnSalir.setBounds(50,270, 410,50);
        btnSalir.setBackground(new java.awt.Color(245, 166, 166));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnSalir);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
        
        VentanaEstadisticas.ManejadorDeEventos manejadorEventos = new VentanaEstadisticas.ManejadorDeEventos();
        
        btnSalir.addActionListener(manejadorEventos);
    }
    
    class ManejadorDeEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnSalir){
                System.exit(0);
            }
        }
    }
}
