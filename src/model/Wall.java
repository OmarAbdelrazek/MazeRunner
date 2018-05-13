/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Tommy
 */
public interface Wall {
    public void hit();
    public void draw(GraphicsContext gc);
    
    
}
