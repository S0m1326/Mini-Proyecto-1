/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sebastián
 */
public class VentanaEstadisticas extends JFrame {
    
    private JLabel TituloMenu;
    private JPanel jpContenido;
    
    public VentanaEstadisticas() {
        initComponents();
    }
    
    private void initComponents() {
        setTitle("Estadisticas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,530);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
    }
}
