/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
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
    private JLabel jlPalabra;
    private GridLayout PanelBotones;
    private JPanel jpBotones;
    private JButton btnA;
    private JButton btnE;
    private JButton btnI;
    private JButton btnO;
    private JButton btnU;
    
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
        jpBotones = new JPanel();
        
        String texto = "Escoge la vocal que le falta a la palabra";
        
        jlTitulo = new JLabel("INSTRUCCIONES",SwingConstants.CENTER);
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
        
        instrucciones.setBounds(25,100, 510,500);
        instrucciones.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(instrucciones);
        
        jlPalabra = new JLabel("GANAST_",SwingConstants.CENTER);
        jlPalabra.setFont(new java.awt.Font("Arial", 0, 75));
        jlPalabra.setBounds(0,200,520,75);
        
        jpContenido.add(jlPalabra);
        
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
        btnA.setBackground(new java.awt.Color(245, 218, 166));
        btnA.setForeground(new java.awt.Color(0, 0, 0));
        btnA.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnE = new JButton("E");
        btnE.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnE.setBounds(50,290, 410,50);
        btnE.setBackground(new java.awt.Color(124, 168, 233));
        btnE.setForeground(new java.awt.Color(0, 0, 0));
        btnE.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));        
        
        btnI = new JButton("I");
        btnI.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnI.setBounds(50,220, 410,50);
        btnI.setBackground(new java.awt.Color(245, 218, 166));
        btnI.setForeground(new java.awt.Color(0, 0, 0));
        btnI.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnO = new JButton("O");
        btnO.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnO.setBounds(50,290, 410,50);
        btnO.setBackground(new java.awt.Color(245, 218, 166));
        btnO.setForeground(new java.awt.Color(0, 0, 0));
        btnO.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnU = new JButton("U");
        btnU.setFont(new java.awt.Font("Britannic Bold", 0, 75));
//        btnU.setBounds(50,290, 410,50);
        btnU.setBackground(new java.awt.Color(245, 218, 166));
        btnU.setForeground(new java.awt.Color(0, 0, 0));
        btnU.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpBotones.add(btnA);
        jpBotones.add(btnE);
        jpBotones.add(btnI);
        jpBotones.add(btnO);
        jpBotones.add(btnU);
        
        btnAtras = new JButton("VOLVER");
        btnAtras.setFont(new java.awt.Font("Arial", 0, 25));
        btnAtras.setBounds(110,420, 300,50);
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
