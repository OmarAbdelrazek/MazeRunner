/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TreeWall8 extends Cell implements Wall {

    ImageIcon ic = new ImageIcon("crate.png");
    Image image = ic.getImage(); // transform it 
    Image newimg = image.getScaledInstance(500, 500, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon uc = new ImageIcon(newimg);

    public TreeWall8() {
    }

    @Override
    public void draw(JPanel jpanel, Graphics2D g) {

        int x = 960 / 30;
        int y = 960 / 30;
        int XonGrid = x * (this.getI() + 1);
        int YonGrid = y * (this.getJ() + 1);
        uc.paintIcon(jpanel, g, 0, 0);
        g.drawImage(newimg, 0, 0, null);
        System.out.println(uc);
    }

    @Override
    public void hit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
