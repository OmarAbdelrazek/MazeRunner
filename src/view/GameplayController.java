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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
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
    Player1 p = Player1.getInstance();
    GraphicsContext gc;
    int x = 0, y = 11, i, j;
    int tempx, tempy;
    LoadMaze load = new LoadMaze();
    MyDrawingEngine drawingengine = new MyDrawingEngine();
    @FXML
    private Canvas gameplayPnl;
    @FXML
    private Label hitLbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gameplayPnl.setHeight(960);
        gameplayPnl.setWidth(1000);

        CellHeight = gameplayPnl.getHeight() / 35;
        CellWidth = gameplayPnl.getWidth() / 30;
        gc = gameplayPnl.getGraphicsContext2D();
        gameplayPnl.setFocusTraversable(true);

        //load 
        try {
            load.load();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GameplayController.class.getName()).log(Level.SEVERE, null, ex);
        }
        gc.fillRect(0, 0, 1000, 1000);
        for (j = 0; j < 30; j++) {
            for (i = 0; i < 30; i++) {

                drawingengine.parse(load.maze1[i][j], i, j, gc);
            }

        }
    }

    @FXML
    private void gameplayKeyPressed(KeyEvent event) {

        if (event.getCode() == KeyCode.UP) {
            if (load.maze1[x][y - 1] == 7 || load.maze1[x][y - 1] == 8) {

            } else {
                if(load.maze1[x][y-1] == 5  ){
                    hitLbl.setText("-50");
                    
                }
                else if(load.maze1[x][y-1] == 6)
                {
                     Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("DeadWindow.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
                }
                load.maze1[x][y] = 0;
                load.maze1[x][y - 1] = 1;
                y--;
                gc.fillRect(0, 0, 1000, 1000);
                for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }

            } 
        }
        if (event.getCode() == KeyCode.DOWN) {
            if (load.maze1[x][y + 1] == 7 || load.maze1[x][y + 1] == 8) {

            } else {
                if(load.maze1[x][y+1] == 5  ){
                    hitLbl.setText("-50");
                    
                }
                else if(load.maze1[x][y+1] == 6)
                {
                     Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("DeadWindow.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
                }
                load.maze1[x][y] = 0;
                load.maze1[x][y + 1] = 1;
                y++;

                gc.fillRect(0, 0, 1000, 1000);
                for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }
            }
        }
        if (event.getCode() == KeyCode.RIGHT) {
            if (load.maze1[x + 1][y] == 7 || load.maze1[x + 1][y] == 8) {

            } else {
                if(load.maze1[x+1][y] == 5  ){
                    hitLbl.setText("-50");
                    
                }
                else if(load.maze1[x+1][y] == 6)
                {
                     Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("DeadWindow.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
                }
                load.maze1[x][y] = 0;
                load.maze1[x + 1][y] = 1;
                x++;

                gc.fillRect(0, 0, 1000, 1000);
                for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }
            }
        }
        if (event.getCode() == KeyCode.LEFT) {
            if (load.maze1[x - 1][y] == 7 || load.maze1[x - 1][y] == 8) {

            } else {
                if(load.maze1[x-1][y] == 5  ){
                    hitLbl.setText("-50");
                    
                }
                else if(load.maze1[x-1][y] == 6)
                {
                     Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("DeadWindow.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
                }
                load.maze1[x][y] = 0;
                load.maze1[x-1][y] = 1;
                x--;

                gc.fillRect(0, 0, 1000, 1000);
                for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }
            }
        }
        if (event.getCode() == KeyCode.SPACE) {
            System.out.println("space");
        }
        if(event.getCode() == KeyCode.P){
            Context c = new Context();
            PauseState p = new PauseState();
            p.gameState(c, gameplayPnl);
            
      //  gc.setFill(Color.RED);
      //  gc.setStroke(Color.RED);
        gc.setLineWidth(60);
        gc.fillText("Game Paused", gameplayPnl.getWidth()/2, 0);
        if(event.getCode() == KeyCode.C){
            System.out.println("in C");
            Context cd = new Context();
            ContinueState con = new ContinueState();
            con.gameState(cd, gameplayPnl);
            for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }
        }
        else 
        {}
        }
        

    }
}
