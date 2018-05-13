/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javafx.scene.canvas.GraphicsContext;
import javax.swing.JPanel;
import view.GameplayController;


public class TNT6 extends Cell implements Bomb{

    public TNT6() {
    }

    @Override
    public void explode () {
    }

    @Override
    public void draw(GraphicsContext gc) {
        javafx.scene.image.Image img = new javafx.scene.image.Image("Resources/bomb2.png");        
        double x = GameplayController.CellHeight;
        double y = GameplayController.CellWidth;
        double XonGrid = x * (this.getI());
        double YonGrid = y * (this.getJ());
        gc.drawImage(img, XonGrid, YonGrid, GameplayController.CellWidth,GameplayController.CellHeight);
    }



}
