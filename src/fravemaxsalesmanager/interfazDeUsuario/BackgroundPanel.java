/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemaxsalesmanager.interfazDeUsuario;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


    public class BackgroundPanel extends JPanel {
    private ImageIcon background;

    public BackgroundPanel() {
        background = new ImageIcon(getClass().getResource("/fravemaxsalesmanager/recursos/1.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}
    

