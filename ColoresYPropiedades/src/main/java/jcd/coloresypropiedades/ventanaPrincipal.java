package jcd.coloresypropiedades;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener {
    JPanel mainPanel;
    JLabel etiTexto;
    Button btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerde, btnTransparente, btnOpaca;
    
    public ventanaPrincipal () {
        mainPanel = new JPanel();
        etiTexto = new JLabel();
        btnAzul = new Button("Azul");
        btnRojo = new Button("Rojo");
        btnVerde = new Button("Verde");
        btnFondoAzul = new Button("Fondo azul");
        btnFondoRojo = new Button("Fondo rojo");
        btnFondoVerde = new Button("Fondo verde");
        btnTransparente = new Button("Transparencia");
        btnOpaca = new Button("Opacar");
        
        etiTexto.setText("كالي");
        etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
        etiTexto.setBounds(0, 10, 200, 16);
        btnAzul.setBounds(8, 32, 168, 24);
        btnRojo.setBounds(8, 64, 168, 24);
        btnVerde.setBounds(8, 96, 168, 24);
        btnFondoAzul.setBounds(8, 128, 168, 24);
        btnFondoRojo.setBounds(8, 160, 168, 24);
        btnFondoVerde.setBounds(8, 192, 168, 24);
        btnTransparente.setBounds(8, 224, 168, 24);
        btnOpaca.setBounds(8, 256, 168, 24);
        
        btnAzul.addActionListener(this);
        btnRojo.addActionListener(this);
        btnVerde.addActionListener(this);
        btnFondoAzul.addActionListener(this);
        btnFondoRojo.addActionListener(this);
        btnFondoVerde.addActionListener(this);
        btnTransparente.addActionListener(this);
        btnOpaca.addActionListener(this);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(etiTexto);
        mainPanel.add(btnAzul);
        mainPanel.add(btnRojo);
        mainPanel.add(btnVerde);
        mainPanel.add(btnFondoAzul);
        mainPanel.add(btnFondoRojo);
        mainPanel.add(btnFondoVerde);
        mainPanel.add(btnTransparente);
        mainPanel.add(btnOpaca);
        add(mainPanel);

        setTitle("Cambiar el color del texto");
        setSize(200, 320);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAzul) {
            etiTexto.setForeground(Color.blue);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(Color.red);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(Color.green);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(Color.blue);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(Color.red);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(Color.green);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        }
    }
}
