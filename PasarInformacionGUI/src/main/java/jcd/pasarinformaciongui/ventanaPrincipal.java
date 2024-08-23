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
 
        etiTexto1.setText("A");
        etiTexto2.setText("A");
        
        btnTraspasa1.addActionListener(this);
        btnTraspasa2.addActionListener(this);
        
        txtTexto.setBounds(16, 16, 252, 24);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.add(txtTexto);
        mainPanel.setLayout(null);
        add(mainPanel);

        setTitle("Mostrar cosas");
        setSize(300, 120);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
