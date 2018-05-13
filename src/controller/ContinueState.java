/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author ooomooo
 */
public class ContinueState implements GameState{

    @Override
    public void gameState(Context c, Canvas gameplayCanvas) {
        GraphicsContext gc = gameplayCanvas.getGraphicsContext2D();
      //  gameplayCanvas.setDisable(false);
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLACK);
    }
    
}
