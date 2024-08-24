package jcd.eventosmouseyposicionamiento;

import java.awt.Color;
import java.awt.Button;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements ActionListener, MouseListener {
    JPanel mainPanel;
    JLabel etiNombre;
    Button btnEsquina, btnCentro, btnAgrandar, btnAchicar;
    int etiPosX = 176, etiPosY = 112, etiSizeX = 30, etiSizeY = 16, size = 0;
    
    public ventanaPrincipal () {
        mainPanel = new JPanel();
        etiNombre = new JLabel();
        btnEsquina = new Button("Esquina");
        btnCentro = new Button("Centro");
        btnAgrandar = new Button("Agrandar");
        btnAchicar = new Button("Achicar");
        
        btnEsquina.addActionListener(this);
        btnCentro.addActionListener(this);
        btnAgrandar.addActionListener(this);
        btnAchicar.addActionListener(this);
        btnEsquina.addMouseListener(this);
        btnAchicar.addMouseListener(this);
        btnAgrandar.addMouseListener(this);
        btnCentro.addMouseListener(this);
        
        etiNombre.setText("Juan");
        etiNombre.setBackground(Color.white);
        etiNombre.setOpaque(true);
        
        btnEsquina.setBounds(16, 160, 80, 24);
        btnCentro.setBounds(110, 160, 80, 24);
        btnAgrandar.setBounds(200, 160, 80, 24);
        btnAchicar.setBounds(290, 160, 80, 24);
        etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
        etiNombre.setBounds(etiPosX,etiPosY,etiSizeX, etiSizeY);
        
        mainPanel.setBackground(Color.getHSBColor(120, 50, 250));
        mainPanel.add(btnEsquina);
        mainPanel.add(btnCentro);
        mainPanel.add(btnAgrandar);
        mainPanel.add(btnAchicar);
        mainPanel.add(etiNombre);
        mainPanel.setLayout(null);
        add(mainPanel);

        setTitle("Cambiar posición y tamaño del texto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEsquina) {
            etiPosX = 0;
            etiPosY = 0;
        } else if (e.getSource() == btnCentro) {
            etiPosX = 176;
            etiPosY = 112;
        } else if (e.getSource() == btnAgrandar) {
            size += 1;
        } else if (e.getSource() == btnAchicar) {
            size -= 1;
        }
        etiNombre.setLocation(etiPosX - size, etiPosY - size);
        etiNombre.setSize(etiSizeX + size*2, etiSizeY + size*2);
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == btnEsquina) {
            btnEsquina.setLocation(12, 156);
            btnEsquina.setSize(88, 32);
        } else if (e.getSource() == btnCentro) {
            btnCentro.setLocation(106, 156);
            btnCentro.setSize(88, 32);
        } else if (e.getSource() == btnAgrandar) {
            btnAgrandar.setLocation(196, 156);
            btnAgrandar.setSize(88, 32);
        } else if (e.getSource() == btnAchicar) {
            btnAchicar.setLocation(286, 156);
            btnAchicar.setSize(88, 32);
        }
    }
    
    @Override
    public void mouseExited (MouseEvent e) {
        if (e.getSource() == btnEsquina) {
            btnEsquina.setLocation(16, 160);
            btnEsquina.setSize(80, 24);
        } else if (e.getSource() == btnCentro) {
            btnCentro.setLocation(110, 160);
            btnCentro.setSize(80, 24);
        } else if (e.getSource() == btnAgrandar) {
            btnAgrandar.setLocation(200, 160);
            btnAgrandar.setSize(80, 24);
        } else if (e.getSource() == btnAchicar) {
            btnAchicar.setLocation(290, 160);
            btnAchicar.setSize(80, 24);
        }
    }
    
    @Override
    public void mousePressed (MouseEvent e) {}
    @Override
    public void mouseReleased (MouseEvent e) {}
    @Override
    public void mouseClicked (MouseEvent e) {}
}
