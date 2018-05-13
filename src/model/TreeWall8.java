/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javafx.scene.canvas.GraphicsContext;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import view.*;

public class TreeWall8 extends Cell implements Wall {

    public TreeWall8() {
    }

    @Override
    public void draw(GraphicsContext gc) {
        javafx.scene.image.Image img = new javafx.scene.image.Image("Resources/treewall.jpg");        
        double x = GameplayController.CellHeight;
        double y = GameplayController.CellWidth;
        double XonGrid = x * (this.getI());
        double YonGrid = y * (this.getJ());
        gc.drawImage(img, XonGrid, YonGrid, GameplayController.CellWidth,GameplayController.CellHeight+6);
    }

    @Override
    public void hit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
