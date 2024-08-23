package jcd.pasarinformaciongui;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener {
    JPanel mainPanel;
    JLabel etiTexto1, etiTexto2;
    JTextField txtTexto;
    Button btnTraspasa1, btnTraspasa2;

    public ventanaPrincipal() {
        mainPanel = new JPanel();
        etiTexto1 = new JLabel();
        etiTexto2 = new JLabel();
        txtTexto = new JTextField();
        btnTraspasa1 = new Button("Traspasa 1");
        btnTraspasa2 = new Button("Traspasa 2");
 
        btnTraspasa1.addActionListener(this);
        btnTraspasa2.addActionListener(this);
        
        txtTexto.setBounds(16, 16, 252, 24);
        btnTraspasa1.setBounds(16, 48, 100, 24);
        btnTraspasa2.setBounds(16, 88, 100, 24);
        etiTexto1.setBounds(124, 48, 200, 24);
        etiTexto2.setBounds(124, 88, 200, 24);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.add(txtTexto);
        mainPanel.add(btnTraspasa1);
        mainPanel.add(btnTraspasa2);
        mainPanel.add(etiTexto1);
        mainPanel.add(etiTexto2);
        mainPanel.setLayout(null);
        add(mainPanel);

        setTitle("Mostrar cosas");
        setSize(300, 164);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTraspasa1) {
            etiTexto1.setText(txtTexto.getText());
        } else if (e.getSource() == btnTraspasa2) {
            etiTexto2.setText(txtTexto.getText());
        }
    }
    
}
