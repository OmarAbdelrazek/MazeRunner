/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javafx.scene.canvas.GraphicsContext;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Tommy
 */
public abstract class Cell {
    private int i;
    private int j;


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

  
}
