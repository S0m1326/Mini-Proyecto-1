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
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import modelo.Jugador;
/**
 *
 * @author Sebastián
 */
public class VentanaTematica extends JFrame {
    
    private JButton btnColores;
    private JButton btnFrutas;
    private JButton btnAnimales;
    private JPanel jpContenido;
    private JLabel jlTitulo;
    private JLabel jlTematica;
    private JLabel jlNombre;
    private JTextField txtNombre;
    private String[] Colores = {"Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Morado", "Rosa", "Cian", "Turquesa", "Coral", "Marrón", "Gris", "Oro", "Plata", "Blanco", "Negro", "Beige", "Caqui", "Fucsia", "Violeta", "Lila", "Salmon"};
    private String[] Frutas = {"Manzana", "Naranja", "Plátano", "Fresa", "Kiwi", "Mango", "Piña", "Melón", "Sandía", "Limón", "Cereza", "Uva", "Melocotón", "Albaricoque", "Mandarina", "Pera", "Ciruela", "Granada", "Mamey", "Guayaba", "Coco", "Papaya", "Lichi", "Mora", "Frambuesa"};
    private String[] Animales = {"Perro", "Gato", "León", "Tigre", "Elefante", "Jirafa", "Cebra", "Mono", "Oso", "Rinoceronte", "Hipopótamo", "Camello", "Caballo", "Vaca", "Conejo", "Ratón", "Erizo", "Zorro", "Lobo", "Zarigüeya", "Murciélago", "Nutria", "Cangrejo", "Pulpo", "Ballena"};
    
    public VentanaTematica() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Tematica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,500);
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
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnColores.addActionListener(manejadorEventos);
        btnFrutas.addActionListener(manejadorEventos);
        btnAnimales.addActionListener(manejadorEventos);
    }
    
    private void iniciarJuego(int numero){
        String nombre =txtNombre.getText();
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            Jugador jugador = new Jugador(nombre);
            dispose(); 
            if (numero == 1){
                VentanaJuego juego = new VentanaJuego(jugador,Colores);
            }
            if (numero == 2){
                VentanaJuego juego = new VentanaJuego(jugador,Frutas);
            }
            if (numero == 3){
                VentanaJuego juego = new VentanaJuego(jugador,Animales);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese su nombre", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocusInWindow();
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
