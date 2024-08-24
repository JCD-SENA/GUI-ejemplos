package jcd.unirnumeros;

import java.awt.Color;
import java.awt.Button;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener, MouseListener {
    JPanel mainPanel;
    JLabel etiCero, etiUno, etiDos, etiTres, etiCuatro, etiCinco, etiSeis, etiSiete, etiOcho, etiNueve;
    JLabel txtNumero;
    Button btnBorrar;
    
    public ventanaPrincipal () {
        mainPanel = new JPanel();
        etiCero = new JLabel();
        etiUno = new JLabel();
        etiDos = new JLabel();
        etiTres = new JLabel();
        etiCuatro = new JLabel();
        etiCinco = new JLabel();
        etiSeis = new JLabel();
        etiSiete = new JLabel();
        etiOcho = new JLabel();
        etiNueve = new JLabel();
        txtNumero = new JLabel();
        btnBorrar = new Button("Borrar");
        
        etiCero.addMouseListener(this);
        etiUno.addMouseListener(this);
        etiDos.addMouseListener(this);
        etiTres.addMouseListener(this);
        etiCuatro.addMouseListener(this);
        etiCinco.addMouseListener(this);
        etiSeis.addMouseListener(this);
        etiSiete.addMouseListener(this);
        etiOcho.addMouseListener(this);
        etiNueve.addMouseListener(this);
        btnBorrar.addActionListener(this);
        txtNumero.setHorizontalAlignment(SwingConstants.CENTER);

        etiCero.setText("0");
        etiUno.setText("1");
        etiDos.setText("2");
        etiTres.setText("3");
        etiCuatro.setText("4");
        etiCinco.setText("5");
        etiSeis.setText("6");
        etiSiete.setText("7");
        etiOcho.setText("8");
        etiNueve.setText("9");
        txtNumero.setBounds(0, 16, 180, 16);
        etiCero.setBounds(16, 64, 16, 16);
        etiUno.setBounds(48, 64, 16, 16);
        etiDos.setBounds(80, 64, 16, 16);
        etiTres.setBounds(112, 64, 16, 16);
        etiCuatro.setBounds(144, 64, 16, 16);
        etiCinco.setBounds(16, 100, 16, 16);
        etiSeis.setBounds(48, 100, 16, 16);
        etiSiete.setBounds(80, 100, 16, 16);
        etiOcho.setBounds(112, 100, 16, 16);
        etiNueve.setBounds(144, 100, 16, 16);
        btnBorrar.setBounds(16, 130, 130, 24);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(txtNumero);
        mainPanel.add(etiCero);
        mainPanel.add(etiUno);
        mainPanel.add(etiDos);
        mainPanel.add(etiTres);
        mainPanel.add(etiCuatro);
        mainPanel.add(etiCinco);
        mainPanel.add(etiSeis);
        mainPanel.add(etiSiete);
        mainPanel.add(etiOcho);
        mainPanel.add(etiNueve);
        mainPanel.add(btnBorrar);
        add(mainPanel);

        setTitle("Juntar palabras");
        setSize(180, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBorrar) {
            txtNumero.setText("");
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == etiCero) {
            txtNumero.setText(txtNumero.getText() + "0");
        } else if (e.getSource() == etiUno) {
            txtNumero.setText(txtNumero.getText() + "1");
        } else if (e.getSource() == etiDos) {
            txtNumero.setText(txtNumero.getText() + "2");
        } else if (e.getSource() == etiTres) {
            txtNumero.setText(txtNumero.getText() + "3");
        } else if (e.getSource() == etiCuatro) {
            txtNumero.setText(txtNumero.getText() + "4");
        } else if (e.getSource() == etiCinco) {
            txtNumero.setText(txtNumero.getText() + "5");
        } else if (e.getSource() == etiSeis) {
            txtNumero.setText(txtNumero.getText() + "6");
        } else if (e.getSource() == etiSiete) {
            txtNumero.setText(txtNumero.getText() + "7");
        } else if (e.getSource() == etiOcho) {
            txtNumero.setText(txtNumero.getText() + "8");
        } else if (e.getSource() == etiNueve) {
            txtNumero.setText(txtNumero.getText() + "9");
        } 
    }
    
    @Override
    public void mouseExited (MouseEvent e) {}
    
    @Override
    public void mousePressed (MouseEvent e) {}
    @Override
    public void mouseReleased (MouseEvent e) {}
    @Override
    public void mouseClicked (MouseEvent e) {}
}