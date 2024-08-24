package jcd.eventosmouse;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ventanaPrincipal extends JFrame implements MouseListener {
    JPanel mainPanel;
    JLabel etiPal1, etiPal2, etiPal3, etiPal4;
    JLabel etiOcultar;

    public ventanaPrincipal () {
        mainPanel = new JPanel();
        etiPal1 = new JLabel();
        etiPal2 = new JLabel();
        etiPal3 = new JLabel();
        etiPal4 = new JLabel();
        etiOcultar = new JLabel();
        
        etiPal1.setText("Un");
        etiPal2.setText("texto");
        etiPal3.setText("oculto");
        etiPal4.setText("talvez");
        etiOcultar.setText("Ocultar");
        etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
        etiOcultar.setBackground(Color.getHSBColor(120, 50, 250));
        etiOcultar.setOpaque(true);
        etiOcultar.setFont(new Font("Arial", Font.PLAIN, 24));
        
        etiOcultar.addMouseListener(this);
        
        etiPal1.setBounds(16, 16, 252, 16);
        etiPal2.setBounds(8*5, 16, 252, 16);
        etiPal3.setBounds(8*10, 16, 252, 16);
        etiPal4.setBounds(8*16, 16, 252, 16);
        etiOcultar.setBounds(35, 48, 100, 24);

        mainPanel.setLayout(null);
        mainPanel.add(etiPal1);
        mainPanel.add(etiPal2);
        mainPanel.add(etiPal3);
        mainPanel.add(etiPal4);
        mainPanel.add(etiOcultar);
        add(mainPanel);

        setTitle("Ocultar textos");
        setSize(200, 120);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == etiOcultar) {
            etiPal1.setVisible(false);
            etiPal2.setVisible(false);
            etiPal3.setVisible(false);
            etiPal4.setVisible(false);
        }
    }
    
    @Override
    public void mouseExited (MouseEvent e) {
        if (e.getSource() == etiOcultar) {
            etiPal1.setVisible(true);
            etiPal2.setVisible(true);
            etiPal3.setVisible(true);
            etiPal4.setVisible(true);
        }
    }
    
    @Override
    public void mousePressed (MouseEvent e) {}
    @Override
    public void mouseReleased (MouseEvent e) {}
    @Override
    public void mouseClicked (MouseEvent e) {}
}
