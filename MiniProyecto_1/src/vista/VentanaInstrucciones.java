/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class VentanaInstrucciones extends JFrame {
    
    private JButton btnColores;
    private JButton btnFrutas;
    private JButton btnAnimales;
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JLabel jlTematica;
    private JLabel jlNombre;
    private JTextField txtNombre;
    
    public VentanaInstrucciones() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Instrucciones");
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
        jlTematica = new JLabel("Selecciona la temática del juego:",SwingConstants.CENTER );
        jlTematica.setFont(new java.awt.Font("Arial", 0, 25));
        jlNombre = new JLabel("Ingresa tu nombre:",SwingConstants.CENTER );
        jlNombre.setFont(new java.awt.Font("Arial", 0, 25));
        
        jpContenido.setBackground(new java.awt.Color(178, 221, 185));
        jpContenido.setSize(520,500);        
        jpContenido.setBounds(0,0, 520, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 520,50);
        jlTitulo.setForeground(Color.BLACK); 
        
        jlNombre.setBounds(0,100, 520,35);
        jlNombre.setForeground(new Color(0,0,0));
        
        jlTematica.setBounds(0,200, 520,35);
        jlTematica.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(jlTematica);
        jpContenido.add(jlNombre);
        
        txtNombre = new JTextField("");
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20)); 
        txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(txtNombre);
        
        txtNombre.setBounds(50,140,410, 40);
        
        btnColores = new JButton("COLORES");
        btnColores.setFont(new java.awt.Font("Arial", 0, 25));
        btnColores.setBounds(50,250, 410,50);
        btnColores.setBackground(new java.awt.Color(245, 166, 166));
        btnColores.setForeground(new java.awt.Color(0, 0, 0));
        btnColores.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnFrutas = new JButton("FRUTAS");
        btnFrutas.setFont(new java.awt.Font("Arial", 0, 25));
        btnFrutas.setBounds(50,320, 410,50);
        btnFrutas.setBackground(new java.awt.Color(124, 168, 233));
        btnFrutas.setForeground(new java.awt.Color(0, 0, 0));
        btnFrutas.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnAnimales = new JButton("ANIMALES");
        btnAnimales.setFont(new java.awt.Font("Arial", 0, 25));
        btnAnimales.setBounds(50,390, 410,50);
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
