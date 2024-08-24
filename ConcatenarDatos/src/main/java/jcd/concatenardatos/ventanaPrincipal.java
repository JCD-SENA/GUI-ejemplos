package jcd.concatenardatos;

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
    JLabel etiTexto;
    JTextField txtPalabra1, txtPalabra2;
    Button btnConcatena;
    
    public ventanaPrincipal () {
        mainPanel = new JPanel();
        etiTexto = new JLabel();
        txtPalabra1 = new JTextField();
        txtPalabra2 = new JTextField();
        btnConcatena = new Button("Concatenar");
        
        btnConcatena.addActionListener(this);
        
        txtPalabra1.setBounds(16, 16, 150, 24);
        txtPalabra2.setBounds(170, 16, 150, 24);
        etiTexto.setBounds(0, 48, 338, 16);
        btnConcatena.setBounds(16, 70, 302, 32);
        etiTexto.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(txtPalabra1);
        mainPanel.add(txtPalabra2);
        mainPanel.add(etiTexto);
        mainPanel.add(btnConcatena);
        add(mainPanel);

        setTitle("Juntar palabras");
        setSize(350, 150);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConcatena) {
            etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
        }
    }
}
