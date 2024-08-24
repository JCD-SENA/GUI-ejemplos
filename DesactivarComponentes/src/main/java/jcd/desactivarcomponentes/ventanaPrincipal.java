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
        btnAceptar = new Button("Aceptar");
        btnDesactivar = new Button("Desactivar");
        btnActivar = new Button("Activar");

        labelNombre.setText("Nombre: ");
        labelCiudad.setText("Ciudad: ");
        txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
        btnDesactivar.addActionListener(this);
        btnActivar.addActionListener(this);
        btnAceptar.addActionListener(this);
        
        txtFrase.setBounds(16, 10, 305, 16);
        labelNombre.setBounds(16, 32, 305, 16);
        labelCiudad.setBounds(16, 64, 305, 16);
        txtNombre.setBounds(70, 30, 170, 24);
        txtCiudad.setBounds(70, 62, 170, 24);
        btnAceptar.setBounds(16, 95, 100, 24);
        btnDesactivar.setBounds(116, 95, 100, 24);
        btnActivar.setBounds(216, 95, 100, 24);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(txtFrase);
        mainPanel.add(labelNombre);
        mainPanel.add(labelCiudad);
        mainPanel.add(txtNombre);
        mainPanel.add(txtCiudad);
        mainPanel.add(btnAceptar);
        mainPanel.add(btnDesactivar);
        mainPanel.add(btnActivar);
        add(mainPanel);
        
        setTitle("Desactivar componentes");
        setSize(350, 164);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAceptar) {
            txtFrase.setText("Usted se llama "+txtNombre.getText()+" y vive en "+txtCiudad.getText()+".");
        } else if (e.getSource() == btnDesactivar) {
            txtNombre.setEnabled(false);
            txtCiudad.setEnabled(false);
        } else if (e.getSource() == btnActivar) {
            txtNombre.setEnabled(true);
            txtCiudad.setEnabled(true);
        }
    }
}
