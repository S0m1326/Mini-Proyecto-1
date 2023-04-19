/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import logica.Juego;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
/**
 *
 * @author Sebastián
 */
public class VentanaTematica extends JFrame {
    
    private java.awt.Label TituloMenu;
    private JButton btnColores;
    private JButton btnFrutas;
    private JButton btnAnimales;
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JLabel jlNombre;
    
    public VentanaTematica() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Tematica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,400);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        
        jlTitulo = new JLabel("FUGA DE LETRAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 36));
        jlNombre = new JLabel("Selecciona la temática del juego:",SwingConstants.CENTER );
        jlNombre.setFont(new java.awt.Font("Arial", 0, 25));
        
        jpContenido.setBackground(new java.awt.Color(178, 221, 185));
        jpContenido.setSize(520,400);        
        jpContenido.setBounds(0,0, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 519,50);
        jlTitulo.setForeground(Color.BLACK); 
        
        jlNombre.setBounds(0,100, 519,35);
        jlNombre.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(jlNombre);
        
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
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnColores.addActionListener(manejadorEventos);
        btnFrutas.addActionListener(manejadorEventos);
        btnAnimales.addActionListener(manejadorEventos);
    }
    
    private void iniciarJuego(int numero){
        String[] Colores = {"rojo", "amarillo",  "rosa" ,"verde", "blanco", "violeta"};
        String[] Frutas = {"papaya","mango", "manzana",  "tomate" ,"chontaduro", "kiwi", "banano"};
        String[] Animales = {"perro","elefante", "gato",  "tigre" ,"conejo", "pajaro", "jirafa"};
        dispose();
        if (numero == 1){
        VentanaJuego juego = new VentanaJuego(Colores);
        }
        if (numero == 2){
        VentanaJuego juego = new VentanaJuego(Frutas);
        }
        if (numero == 3){
        VentanaJuego juego = new VentanaJuego(Animales);
        }
    }
    
    class ManejadorDeEventos implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnColores){             
                int num = 1;
                iniciarJuego(num);
            }
            if(evento.getSource() == btnFrutas){
                int num = 2;
                iniciarJuego(num);
            }
            if(evento.getSource() == btnAnimales){
                int num = 3;
                iniciarJuego(num);
            }
        }
    }
}