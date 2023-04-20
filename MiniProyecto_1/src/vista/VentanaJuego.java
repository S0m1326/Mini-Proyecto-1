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
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
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
    private JLabel jlPalabra;
    private Juego juego;
    private int palabraActualIndex = 0;
    private String palabraActual;
    private int contador = 0;
    private int aciertos = 0;
    private int fallos = 0;
    private String[] tematica;
    private String vocalS;
    
    public VentanaJuego(Jugador jugador, String[] tematica) {
        juego = new Juego(jugador, tematica);
        initComponents();
    }
    
    private void initComponents() {
        String nombre = juego.getJugador();
        tematica = juego.getTematica();
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
        
        jlPalabra = new JLabel("",SwingConstants.CENTER);
        jlPalabra.setVerticalAlignment(SwingConstants.TOP);
        jlPalabra.setFont(new java.awt.Font("Arial", 0, 65));
        jlPalabra.setBounds(0,200,500,100);
        jlPalabra.setForeground(Color.BLACK);
        
        jlJugador = new JLabel("Jugador: " + nombre,SwingConstants.CENTER );
        jlJugador.setFont(new java.awt.Font("Arial", 0, 25));
        jlJugador.setBounds(0,60,520,50);
        jlJugador.setForeground(Color.BLACK);
        
        jlPalabras = new JLabel("Palabras mostradas: " + contador, SwingConstants.CENTER );
        jlPalabras.setFont(new java.awt.Font("Arial", 0, 25));
        jlPalabras.setBounds(0,100,520,50);
        jlPalabras.setForeground(Color.BLACK);
        
        jlAciertos = new JLabel("Aciertos: " + aciertos );
        jlAciertos.setFont(new java.awt.Font("Arial", 0, 25));
        jlAciertos.setBounds(110,130,125,75);
        jlAciertos.setForeground(Color.BLACK);
        
        jlFallos = new JLabel("Fallos: " + fallos );
        jlFallos.setFont(new java.awt.Font("Arial", 0, 25));
        jlFallos.setBounds(300,130,125,75);
        jlFallos.setForeground(Color.BLACK);
        
        jpContenido.add(jlPalabra);
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
        btnA.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnA.setBounds(50,150, 410,50);
        btnA.setBackground(new java.awt.Color(200, 200, 200));
        btnA.setForeground(new java.awt.Color(0, 0, 0));
        btnA.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnE = new JButton("E");
        btnE.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnE.setBounds(50,290, 410,50);
        btnE.setBackground(new java.awt.Color(200, 200, 200));
        btnE.setForeground(new java.awt.Color(0, 0, 0));
        btnE.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));        
        
        btnI = new JButton("I");
        btnI.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnI.setBounds(50,220, 410,50);
        btnI.setBackground(new java.awt.Color(200, 200, 200));
        btnI.setForeground(new java.awt.Color(0, 0, 0));
        btnI.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnO = new JButton("O");
        btnO.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnO.setBounds(50,290, 410,50);
        btnO.setBackground(new java.awt.Color(200, 200, 200));
        btnO.setForeground(new java.awt.Color(0, 0, 0));
        btnO.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnU = new JButton("U");
        btnU.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnU.setBounds(50,290, 410,50);
        btnU.setBackground(new java.awt.Color(200, 200, 200));
        btnU.setForeground(new java.awt.Color(0, 0, 0));
        btnU.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpBotones.add(btnA);
        jpBotones.add(btnE);
        jpBotones.add(btnI);
        jpBotones.add(btnO);
        jpBotones.add(btnU);
        
        btnTerminar = new JButton("Terminar Juego");
        btnTerminar.setFont(new java.awt.Font("Arial", 0, 25));
        btnTerminar.setBounds(30,425, 450,50);
        btnTerminar.setBackground(new java.awt.Color(124, 168, 233));
        btnTerminar.setForeground(new java.awt.Color(0, 0, 0));
        btnTerminar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnTerminar);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
        
        VentanaJuego.ManejadorDeEventos manejadorEventos = new VentanaJuego.ManejadorDeEventos();
        
        btnA.addActionListener(manejadorEventos);
        btnE.addActionListener(manejadorEventos);
        btnI.addActionListener(manejadorEventos);
        btnO.addActionListener(manejadorEventos);
        btnU.addActionListener(manejadorEventos);
        btnTerminar.addActionListener(manejadorEventos);
        
        cambiarPalabra(jlPalabra);
    }
    
    private void cambiarPalabra(JLabel jlPalabra) {
        contador = contador+1;
        palabraActual = tematica[palabraActualIndex];
        
        ArrayList<Character> vocales = new ArrayList<Character>();
        for (char letra : palabraActual.toCharArray()) {
            if ("aeiou".indexOf(letra) != -1) {
                vocales.add(letra);
            }
        }
        
        Random rnd = new Random();
        char vocal = vocales.get(rnd.nextInt(vocales.size()));
        vocalS = String.valueOf(vocal);
        
        String palabraMostrar = tematica[palabraActualIndex].replaceFirst(vocalS, "_");
//        String palabraMostrar = palabraActual.substring(0, palabraActual.length() - 1) + "_";
        jlPalabra.setText(palabraMostrar.toUpperCase());
        palabraActualIndex++;
        if (palabraActualIndex == tematica.length) {
            palabraActualIndex = 0;
        }
    }
    
    private void verificacion (String letra) {
        if (letra.equalsIgnoreCase(vocalS)) {
//      if (letra.equalsIgnoreCase(palabraActual.substring(palabraActual.length() - 1))) {
            aciertos++;
            jlAciertos.setText("Aciertos: " + aciertos);
            cambiarPalabra(jlPalabra);
        } else {
            fallos++;
            jlFallos.setText("Fallos: " + fallos);
        }
    }
    
    class ManejadorDeEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnA){             
                String letra = btnA.getText();
                verificacion(letra);
            }
            if(evento.getSource() == btnE){
                String letra = btnE.getText();
                verificacion(letra);
            }
            if(evento.getSource() == btnI){
                String letra = btnI.getText();
                verificacion(letra);
            }
            if(evento.getSource() == btnO){
                String letra = btnO.getText();
                verificacion(letra);
            }
            if(evento.getSource() == btnU){
                String letra = btnU.getText();
                verificacion(letra);
            }
            if(evento.getSource() == btnTerminar){
                dispose();
                Jugador jugador = new Jugador (contador, aciertos, fallos);
                VentanaEstadisticas ventanaestadisticas = new VentanaEstadisticas(jugador);
            }
        }
    }
}
    
