/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
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
    
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JLabel instrucciones;
    private JButton btnAtras;
    private String texto;
    
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
        
        String texto = "Fuga de Vocales, es un juego muy divertido\n"
                +  "y sencillo, para empezar debes hacer lo siguiente:\n" +
                   "\n1. Agregar tu Nombre. " +
                   "\n2. Escoger la temática con la que deseas jugar. " +
                   "\n3. Ver la palabra en pantalla y escoger la vocal que le hace falta. " +
                   "\n4. Eso es todo amigos";
        
        jlTitulo = new JLabel("FUGA DE LETRAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 36));
        instrucciones = new JLabel(texto);
        instrucciones.setFont(new java.awt.Font("Arial", 0, 25));
        instrucciones.setPreferredSize(new Dimension(520, 500));
        instrucciones.setVerticalAlignment(JLabel.TOP);
        instrucciones.setHorizontalAlignment(JLabel.LEFT);
                
        jpContenido.setBackground(new java.awt.Color(178, 221, 185));
        jpContenido.setSize(520,500);        
        jpContenido.setBounds(0,0, 520, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 520,50);
        jlTitulo.setForeground(Color.BLACK); 
        
        instrucciones.setBounds(0,100, 510,500);
        instrucciones.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(instrucciones);
        
        btnAtras = new JButton("ATRAS");
        btnAtras.setFont(new java.awt.Font("Arial", 0, 25));
        btnAtras.setBounds(200,400, 100,50);
        btnAtras.setBackground(new java.awt.Color(245, 166, 166));
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnAtras);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnAtras.addActionListener(manejadorEventos);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
    }
    
    private void iniciarMenu(){
        
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnAtras){                
                dispose();
                iniciarMenu();
                VentanaMenu Menu = new VentanaMenu();
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
           /* System.out.println("Se liberó la tecla " + e.getKeyChar() +
                    " Con codigo " + e.getKeyCode());*/
            if(e.getKeyCode() == e.VK_ENTER){
                btnAtras.doClick();
            }
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            /*System.out.println("Se presionó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
            
        }
        
        @Override
        public void keyTyped(KeyEvent e) {
            /*System.out.println("Se digitó la tecla " + e.getKeyChar()+
                    " Con codigo " + e.getKeyCode());*/
        }
    }
}
