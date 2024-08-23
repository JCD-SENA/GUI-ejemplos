package jcd.eventosteclado;


import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventanaPrincipal extends JFrame implements ActionListener, KeyListener {
    JPanel mainPanel;
    JLabel etiTexto;
    JTextField txtTexto;
    Button btnVaciar;
    String text = "";

    public ventanaPrincipal() {
        mainPanel = new JPanel();
        etiTexto = new JLabel();
        txtTexto = new JTextField();
        btnVaciar = new Button("Vaciar");

        btnVaciar.addActionListener(this);
        txtTexto.addKeyListener(this);

        txtTexto.setBounds(16, 16, 252, 24);
        etiTexto.setBounds(16, 44, 252, 24);
        btnVaciar.setBounds(16, 72, 252, 32);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.add(txtTexto);
        mainPanel.add(etiTexto);
        mainPanel.add(btnVaciar);
        mainPanel.setLayout(null);
        add(mainPanel);

        setTitle("Mostrar cosas");
        setSize(300, 164);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnVaciar) {
            txtTexto.setText("");
            etiTexto.setText("");
            text = "";
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (Character.isLetter(e.getKeyChar()) || e.getKeyChar() == ' ')
            text += e.getKeyChar();
        etiTexto.setText(text);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

}
