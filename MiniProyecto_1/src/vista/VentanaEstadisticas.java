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
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
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
    private JButton btnInicio;
    private JPanel jpBotones;
    
    public VentanaEstadisticas(Jugador jugadorEst) {
        Juego = new Juego(jugadorEst);
        initComponents();
    }
    
    private void initComponents() {
        num_Palabras = Juego.getPalabras();
        num_Palabras = num_Palabras - 1;
        num_Fallos = Juego.getFallos();
        num_Aciertos = Juego.getAciertos();
        prc_Aciertos = (double) num_Aciertos / (num_Aciertos+num_Fallos) * 100;
        prc_Fallos = (double) num_Fallos / (num_Aciertos+num_Fallos) * 100;
        DecimalFormat formato = new DecimalFormat("0.0");
        String porcentajeAciertos = formato.format(prc_Aciertos);
        String porcentajeFallos = formato.format(prc_Fallos);
        
        setTitle("Estadisticas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,400);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        jpBotones = new JPanel();
        
        jlTitulo = new JLabel("ESTADÍSTICAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
        jlPalabras = new JLabel("Cantidad de Palabras: " + num_Palabras,SwingConstants.CENTER );
        jlPalabras.setFont(new java.awt.Font("Arial", 0, 25));
        jlFallos = new JLabel("Cantidad de Fallos: " + num_Fallos + " - " + porcentajeFallos + "%",SwingConstants.CENTER );
        jlFallos.setFont(new java.awt.Font("Arial", 0, 25));
        jlAciertos = new JLabel("Cantidad de Aciertos: " + num_Aciertos + " - " + porcentajeAciertos + "%",SwingConstants.CENTER );
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
        
        jlFallos.setBounds(0,200, 520,35);
        jlFallos.setForeground(new Color(0,0,0));
        
        jlAciertos.setBounds(0,150, 520,35);
        jlAciertos.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(jlPalabras);
        jpContenido.add(jlFallos);
        jpContenido.add(jlAciertos);
        
        btnInicio = new JButton("Inicio");
        btnInicio.setFont(new java.awt.Font("Arial", 0, 25));
        btnInicio.setBounds(110,255, 300,40);
        btnInicio.setBackground(new java.awt.Color(245, 218, 166));
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnInicio);
        
        btnSalir = new JButton("Salir");
        btnSalir.setFont(new java.awt.Font("Arial", 0, 25));
        btnSalir.setBounds(110,310, 300,40);
        btnSalir.setBackground(new java.awt.Color(245, 166, 166));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnSalir);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
        
        VentanaEstadisticas.ManejadorDeEventos manejadorEventos = new VentanaEstadisticas.ManejadorDeEventos();
        
        btnInicio.addActionListener(manejadorEventos);
        btnSalir.addActionListener(manejadorEventos);
    }
    
    private void iniciarMenu(){
        
    }
    
    class ManejadorDeEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnInicio){                
                dispose();
                VentanaMenu Menu = new VentanaMenu();
            }
            if(evento.getSource() == btnSalir){
                System.exit(0);
            }
            if(evento.getSource() == btnInicio){                
                dispose();
                iniciarMenu();
                VentanaMenu Menu = new VentanaMenu();
            }
        }
              
    }
}
