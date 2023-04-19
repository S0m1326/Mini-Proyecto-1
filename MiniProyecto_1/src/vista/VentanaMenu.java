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
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Sebastián
 */
public class VentanaMenu extends JFrame {
    
    private String nombre;
    private JButton btnJugar;
    private JButton btnInstrucciones;
    private JButton btnSalir;
    private JPanel jpContenido;
    private JLabel jlTitulo;
    
    public VentanaMenu() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,400);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
         
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
         
        jpContenido = new JPanel();
        
        jlTitulo = new JLabel("FUGA DE LETRAS",SwingConstants.CENTER);
        jlTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));
                
        jpContenido.setBackground(new java.awt.Color(245, 166, 166));
        jpContenido.setSize(520,400);        
        jpContenido.setBounds(0,0, 519, 400);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,50, 519,75);
        jlTitulo.setForeground(Color.BLACK);
                
        jpContenido.add(jlTitulo);
        
        btnJugar = new JButton("JUGAR");
        btnJugar.setFont(new java.awt.Font("Arial", 0, 25));
        btnJugar.setBounds(50,150, 410,50);
        btnJugar.setBackground(new java.awt.Color(178, 221, 185));
        btnJugar.setForeground(new java.awt.Color(0, 0, 0));
        btnJugar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnInstrucciones = new JButton("INSTRUCCIONES");
        btnInstrucciones.setFont(new java.awt.Font("Arial", 0, 25));
        btnInstrucciones.setBounds(50,220, 410,50);
        btnInstrucciones.setBackground(new java.awt.Color(124, 168, 233));
        btnInstrucciones.setForeground(new java.awt.Color(0, 0, 0));
        btnInstrucciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnSalir = new JButton("SALIR");
        btnSalir.setFont(new java.awt.Font("Arial", 0, 25));
        btnSalir.setBounds(50,290, 410,50);
        btnSalir.setBackground(new java.awt.Color(245, 218, 166));
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(btnJugar);
        jpContenido.add(btnInstrucciones);
        jpContenido.add(btnSalir);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnJugar.addActionListener(manejadorEventos);
        btnInstrucciones.addActionListener(manejadorEventos);
        btnSalir.addActionListener(manejadorEventos);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
    }
    
    private void iniciarTematica(){
        
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnJugar){                
                dispose();
                iniciarTematica();
                VentanaTematica tematica = new VentanaTematica();
            }
            if(evento.getSource() == btnInstrucciones){                
                dispose(); 
                VentanaInstrucciones Instrucciones = new VentanaInstrucciones();
            }
            if(evento.getSource() == btnSalir){                
                System.exit(0);
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e) {
           /* System.out.println("Se liberó la tecla " + e.getKeyChar() +
                    " Con codigo " + e.getKeyCode());*/
            if(e.getKeyCode() == e.VK_ENTER){
                btnJugar.doClick();
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
