/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.canvas.GraphicsContext;
import view.GameplayController;

/**
 *
 * @author ooomooo
 */
public class Bullets10 {
     private int i,j;
    public Bullets10(){
        
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
        
    }
    
     public void draw(GraphicsContext gc) {
        javafx.scene.image.Image img = new javafx.scene.image.Image("Resources/bullet.png");        
        double x = GameplayController.CellHeight;
        double y = GameplayController.CellWidth;
        double XonGrid = x * (this.getI());
        double YonGrid = y * (this.getJ());
        gc.drawImage(img, XonGrid, YonGrid, GameplayController.CellWidth,GameplayController.CellHeight+6);
    }
    
}
