/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;


public class PauseState implements GameState{

   @Override
    public void gameState(Context c,Canvas gameplayCanvas) {
     //   gameplayCanvas.setDisable(true);
        GraphicsContext gc = gameplayCanvas.getGraphicsContext2D();
        gc.fillRect(0, 0, 1000, 1000);
        //gc.setFill(Color.RED);
        gc.setStroke(Color.RED);
        gc.setLineWidth(1);
        
        gc.strokeText("paused", gameplayCanvas.getWidth()/2, gameplayCanvas.getHeight()/2);
        gc.setStroke(Color.BLACK);
       // lbl.setText("Game Paused");
     //  JOptionPane.showMessageDialog(null, "Press C to continue");
    }

}
