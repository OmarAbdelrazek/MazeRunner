/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.DrawMaze1;
import java.awt.Graphics;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import model.TreeWall8;

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
        

    @FXML
    private Canvas gameplayPnl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CellHeight=gameplayPnl.getHeight()/30;
        CellWidth=gameplayPnl.getWidth()/30;
        gc = gameplayPnl.getGraphicsContext2D();
        TreeWall8 test = new TreeWall8();
        test.setI(0);
        test.setJ(0);
        test.draw(gc);
    }    
    
}
