package jcd.notaestudiantes;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class ventanaPrincipal extends JFrame implements ActionListener {
    JPanel mainPanel;
    JLabel txtPrimerTrimestreLabel, txtSegundoTrimestreLabel, txtTercerTrimestreLabel;
    JLabel etiNotaFinal, etiResultado;
    JTextField txtPrimerTrimestre, txtSegundoTrimestre, txtTercerTrimestre;
    Button btnCalcular;
    
    public ventanaPrincipal () {
        mainPanel = new JPanel();
        txtPrimerTrimestreLabel = new JLabel();
        txtSegundoTrimestreLabel = new JLabel();
        txtTercerTrimestreLabel = new JLabel();
        etiNotaFinal = new JLabel();
        etiResultado = new JLabel();
        txtPrimerTrimestre = new JTextField();
        txtSegundoTrimestre = new JTextField();
        txtTercerTrimestre = new JTextField();
        btnCalcular = new Button("Calcular nota");
        
        txtPrimerTrimestreLabel.setText("Primer trimestre");
        txtSegundoTrimestreLabel.setText("Segundo trimestre");
        txtTercerTrimestreLabel.setText("Tercer trimestre");
        btnCalcular.addActionListener(this);
        
        txtPrimerTrimestreLabel.setBounds(16, 16, 100, 16);
        txtSegundoTrimestreLabel.setBounds(150, 16, 110, 16);
        txtTercerTrimestreLabel.setBounds(290, 16, 110, 16);
        txtPrimerTrimestre.setBounds(8, 32, 110, 24);
        txtSegundoTrimestre.setBounds(144, 32, 118, 24);
        txtTercerTrimestre.setBounds(284, 32, 114, 24);
        btnCalcular.setBounds(118,64,170,32);
        etiNotaFinal.setBounds(32, 120, 100, 16);
        etiResultado.setBounds(180, 120, 100, 16);

        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.setLayout(null);
        mainPanel.add(txtPrimerTrimestreLabel);
        mainPanel.add(txtSegundoTrimestreLabel);
        mainPanel.add(txtTercerTrimestreLabel);
        mainPanel.add(txtPrimerTrimestre);
        mainPanel.add(txtSegundoTrimestre);
        mainPanel.add(txtTercerTrimestre);
        mainPanel.add(btnCalcular);
        mainPanel.add(etiNotaFinal);
        mainPanel.add(etiResultado);
        add(mainPanel);

        setTitle("Calcular resultado del estudiante");
        setSize(430, 200);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            int medium = (
                    Integer.parseInt(txtPrimerTrimestre.getText()) +
                    Integer.parseInt(txtSegundoTrimestre.getText()) +
                    Integer.parseInt(txtTercerTrimestre.getText())
            ) / 3;
            etiNotaFinal.setText("Media: "+medium);
            if (medium >= 5) {
                etiResultado.setText("APROBADO");
                etiResultado.setForeground(Color.black);
                etiNotaFinal.setForeground(Color.black);
            } else if (medium < 5) {
                etiResultado.setText("SUSPENSO");
                etiResultado.setForeground(Color.red);
                etiNotaFinal.setForeground(Color.red);
            }
        }
    }
}
