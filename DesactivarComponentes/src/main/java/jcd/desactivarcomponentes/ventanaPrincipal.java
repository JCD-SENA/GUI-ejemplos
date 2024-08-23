package jcd.desactivarcomponentes;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener {
    JPanel mainPanel;
    JTextField txtNombre, txtCiudad;
    JLabel txtFrase;
    JLabel labelNombre, labelCiudad;
    Button btnAceptar, btnDesactivar, btnActivar;
    
    public ventanaPrincipal () {
        mainPanel = new JPanel();
        txtFrase = new JLabel();
        labelNombre = new JLabel();
        labelCiudad = new JLabel();
        txtNombre = new JTextField();
        txtCiudad = new JTextField();

        txtFrase.setText("Placeholder");
        txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
        
        txtFrase.setBounds(16, 16, 305, 16);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(txtFrase);
        add(mainPanel);
        
        setTitle("Desactivar componentes");
        setSize(350, 164);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {}
}
