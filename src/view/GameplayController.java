/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DrawMaze1;
import controller.MyDrawingEngine;
import java.awt.Graphics;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import view.*;
import controller.*;
import static controller.LoadMaze.maze1;
import model.*;

/**
 * FXML Controller class
 *
 * @author ooomooo
 */
public class GameplayController implements Initializable {

    public static int Height;
    public static int Width;
    public static double CellHeight;
    public static double CellWidth;
    GraphicsContext gc;
    int i, j;

    @FXML
    private Canvas gameplayPnl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gameplayPnl.setHeight(960);
        gameplayPnl.setWidth(1000);
        MyDrawingEngine drawingengine = new MyDrawingEngine();
        CellHeight = gameplayPnl.getHeight() / 30;
        CellWidth = gameplayPnl.getWidth() / 30;
        gc = gameplayPnl.getGraphicsContext2D();
        for (j = 0; j < 30; j++) {
            for (i = 0; i < 30; i++) {
                
                drawingengine.parse(3, i, j, gc);
            }

        }
    }
}
