package jcd.ocultaryvisualizargui;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener {
    JPanel mainPanel;
    JLabel etiNombre, etiCiudad;
    Button btnOcultarNombre, btnVisualizarNombre, btnOcultarCiudad, btnVisualizarCiudad;
    
    public ventanaPrincipal() {
        mainPanel = new JPanel();
        etiNombre = new JLabel();
        etiCiudad = new JLabel();
        btnOcultarNombre = new Button("Ocultar nombre");
        btnVisualizarNombre = new Button("Visualizar nombre");
        btnOcultarCiudad = new Button("Ocultar ciudad");
        btnVisualizarCiudad = new Button("Visualizar ciudad");
        
        etiNombre.setText("Juan");
        etiCiudad.setText("Armenia");
        
        etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
        etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
        
        btnOcultarNombre.addActionListener(this);
        btnVisualizarNombre.addActionListener(this);
        btnOcultarCiudad.addActionListener(this);
        btnVisualizarCiudad.addActionListener(this);
        
        etiNombre.setBounds(16, 16, 120, 16);
        etiCiudad.setBounds(148, 16, 120, 16);
        btnOcultarNombre.setBounds(16, 48, 120, 32);
        btnVisualizarNombre.setBounds(16, 90, 120, 32);
        btnOcultarCiudad.setBounds(148, 48, 120, 32);
        btnVisualizarCiudad.setBounds(148, 90, 120, 32);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(etiNombre);
        mainPanel.add(etiCiudad);
        mainPanel.add(btnOcultarNombre);
        mainPanel.add(btnVisualizarNombre);
        mainPanel.add(btnOcultarCiudad);
        mainPanel.add(btnVisualizarCiudad);
        add(mainPanel);

        setTitle("Mostrar cosas");
        setSize(300, 180);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOcultarNombre) {
            etiNombre.setVisible(false);
        } else if (e.getSource() == btnVisualizarNombre) {
            etiNombre.setVisible(true);
        } else if (e.getSource() == btnOcultarCiudad) {
            etiCiudad.setVisible(false);
        } else if (e.getSource() == btnVisualizarCiudad) {
            etiCiudad.setVisible(true);
        }
    }
    
}
