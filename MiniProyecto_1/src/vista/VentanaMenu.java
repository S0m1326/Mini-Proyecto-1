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
import modelo.Jugador;

/**
 *
 * @author Sebastián
 */
public class VentanaMenu extends JFrame {
    
    private String nombre;
    private java.awt.Label TituloMenu;
    private JButton btnJugar;
    private JButton btnInstrucciones;
    private JButton btnSalir;
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JLabel jlNombre;
    private JTextField txtNombre;
    
    public VentanaMenu() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Menú");
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
        jlNombre = new JLabel("Ingresa tu nombre:",SwingConstants.CENTER );
        jlNombre.setFont(new java.awt.Font("Arial", 0, 25));
        
        jpContenido.setBackground(new java.awt.Color(245, 166, 166));
        jpContenido.setSize(520,500);        
        jpContenido.setBounds(0,0, 519, 500);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlTitulo.setBounds(0,20, 519,50);
        jlTitulo.setForeground(Color.BLACK); 
        
        jlNombre.setBounds(0,200, 519,35);
        jlNombre.setForeground(new Color(0,0,0));
        
        jpContenido.add(jlTitulo);
        jpContenido.add(jlNombre);
        
        txtNombre = new JTextField("");
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.BOLD, 20)); 
        txtNombre.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        jpContenido.add(txtNombre);
        
        txtNombre.setBounds(50,240,410, 40);
        
        btnJugar = new JButton("JUGAR");
        btnJugar.setFont(new java.awt.Font("Arial", 0, 25));
        btnJugar.setBounds(50,325, 410,35);
        btnJugar.setBackground(new java.awt.Color(178, 221, 185));
        btnJugar.setForeground(new java.awt.Color(0, 0, 0));
        btnJugar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnInstrucciones = new JButton("INSTRUCCIONES");
        btnInstrucciones.setFont(new java.awt.Font("Arial", 0, 25));
        btnInstrucciones.setBounds(50,380, 410,35);
        btnInstrucciones.setBackground(new java.awt.Color(124, 168, 233));
        btnInstrucciones.setForeground(new java.awt.Color(0, 0, 0));
        btnInstrucciones.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        btnSalir = new JButton("SALIR");
        btnSalir.setFont(new java.awt.Font("Arial", 0, 25));
        btnSalir.setBounds(50,435, 410,35);
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
        txtNombre.addKeyListener(manejadorEventos);
        
        Image miIcono = miPantalla.getImage("src/imagenes/icono.png");
	setIconImage(miIcono);
    }
    
    private void iniciarTematica(){
        String nombre =txtNombre.getText();
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            Jugador jugador = new Jugador(nombre);
            dispose(); 
            VentanaJuego ventanajuego = new VentanaJuego(jugador);
            VentanaTematica ventanaTematica = new VentanaTematica();
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocusInWindow();
        }
    }
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnJugar){                
                iniciarTematica();
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
