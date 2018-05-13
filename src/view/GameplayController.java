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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    public static ArrayList<int[][]> list = new ArrayList<>();
    Player1 p = Player1.getInstance();
    GraphicsContext gc;
    public static int x = 0, y = 11, i, j;
    int tempx, tempy;
    public  static int bullets = 6;
    String lastMove = null;
    LoadMaze load = new LoadMaze();
    MyDrawingEngine drawingengine = new MyDrawingEngine();
    @FXML
    private Canvas gameplayPnl;
    @FXML
    private Label hitLbl;
    @FXML
    private Label healthLbl;
    public static int health =100;
    @FXML
    private Label ScoreLbl;
    public static int score =0;
    @FXML
    private Label bulletsLbl;
    @FXML
    private Button loadBtn;

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
        healthLbl.setText(health+"%");
        ScoreLbl.setText(String.valueOf(score));
        bulletsLbl.setText(String.valueOf(bullets));
    }

    @FXML
    private void gameplayKeyPressed(KeyEvent event) throws IOException {

        if (event.getCode() == KeyCode.UP) {
            if (load.maze1[x][y - 1] == 7 || load.maze1[x][y - 1] == 8) {

            } else {
                if (load.maze1[x][y - 1] == 5 || load.maze1[x][y - 1] == 3 || load.maze1[x][y - 1] == 4) {
                    if(health == 100){
                    healthLbl.setText("50 %");
                    hitLbl.setText("-50");
                    health =50;
                    }
                    else
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
                    

                } else if (load.maze1[x][y - 1] == 6) {
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
                else if (load.maze1[x][y - 1] == 2){
                    score += 20;
                    ScoreLbl.setText(String.valueOf(score));
                } 
                else if (load.maze1[x][y - 1] == 10){
                    bullets += 2;
                    bulletsLbl.setText(String.valueOf(bullets));
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
            lastMove = "UP";
            list.add(load.maze1);
            hitLbl.setVisible(false);
        }
        if (event.getCode() == KeyCode.DOWN) {
            if (load.maze1[x][y + 1] == 7 || load.maze1[x][y + 1] == 8) {

            } else {
                if (load.maze1[x][y + 1] == 5 || load.maze1[x][y + 1] == 3 || load.maze1[x][y + 1] == 4) {
                    if(health == 100){
                    healthLbl.setText("50 %");
                    hitLbl.setText("-50");
                    health =50;
                    }
                    else
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

                } else if (load.maze1[x][y + 1] == 6) {
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
                else if (load.maze1[x][y + 1] == 2){
                    score += 20;
                    ScoreLbl.setText(String.valueOf(score));
                }
                else if (load.maze1[x][y + 1] == 10){
                    bullets += 2;
                    bulletsLbl.setText(String.valueOf(bullets));
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
            list.add(load.maze1);
            lastMove = "DOWN";
            hitLbl.setVisible(false);;
        }
        if (event.getCode() == KeyCode.RIGHT) {
            if (load.maze1[x + 1][y] == 7 || load.maze1[x + 1][y] == 8) {

            } else {
                if (load.maze1[x + 1][y] == 5 || load.maze1[x + 1][y] == 3 || load.maze1[x + 1][y] == 4) {
if(health == 100){
                    healthLbl.setText("50 %");
                    hitLbl.setText("-50");
                    health =50;
                    }
                    else
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
                } else if (load.maze1[x + 1][y] == 6) {
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
                else if(load.maze1[x+1][y] == 9){
                     Parent choosePlayerParent;
        try {
            choosePlayerParent = FXMLLoader.load(getClass().getResource("WinGate.fxml"));
            Scene choosePlayerScene = new Scene(choosePlayerParent);
           
        
         Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
         s.setScene(choosePlayerScene);
         s.show();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
                }
                else if (load.maze1[x+1][y] == 2){
                    score += 20;
                    ScoreLbl.setText(String.valueOf(score));
                } 
                else if (load.maze1[x+1][y] == 10){
                    bullets += 2;
                    bulletsLbl.setText(String.valueOf(bullets));
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
            list.add(load.maze1);
            lastMove = "RIGHT";
            hitLbl.setVisible(false);
        }
        if (event.getCode() == KeyCode.LEFT) {
            if (load.maze1[x - 1][y] == 7 || load.maze1[x - 1][y] == 8) {

            } else {
                if (load.maze1[x - 1][y] == 5 || load.maze1[x - 1][y] == 3 || load.maze1[x - 1][y] == 4) {
if(health == 100){
                    healthLbl.setText("50 %");
                    hitLbl.setText("-50");
                    health =50;
                    }
                    else
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
                } else if (load.maze1[x - 1][y] == 6) {
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
                else if (load.maze1[x-1][y ] == 2){
                    score += 20;
                    ScoreLbl.setText(String.valueOf(score));
                } 
                else if (load.maze1[x-1][y] == 10){
                    bullets += 2;
                    bulletsLbl.setText(String.valueOf(bullets));
                } 
                load.maze1[x][y] = 0;
                load.maze1[x - 1][y] = 1;
                x--;

                gc.fillRect(0, 0, 1000, 1000);
                for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }
            }
            list.add(load.maze1);
            lastMove = "LEFT";
           hitLbl.setVisible(false);
        }
        if (event.getCode() == KeyCode.SPACE) {
            if(bullets > 0){
            //System.out.println("space");
            switch (lastMove) {
                
                    
                case "UP":
                    bullets --;
                  //  System.out.println(lastMove);
                    if (load.maze1[x][y - 1] == 8 || load.maze1[x][y - 1] == 3 || load.maze1[x][y - 1] == 4) {
                        System.out.println("its crate");
                        load.maze1[x][y - 1] = 0;
                    }
                    gc.fillRect(0, 0, 1000, 1000);
                    for (j = 0; j < 30; j++) {
                        for (i = 0; i < 30; i++) {

                            drawingengine.parse(load.maze1[i][j], i, j, gc);
                        }
                    }
                    break;
                case "DOWN":
                    bullets --;
                    if (load.maze1[x][y + 1] == 8 || load.maze1[x][y + 1] == 3 || load.maze1[x][y + 1] == 4) {
                        System.out.println("its crate");
                        load.maze1[x][y + 1] = 0;
                    }
                    gc.fillRect(0, 0, 1000, 1000);
                    for (j = 0; j < 30; j++) {
                        for (i = 0; i < 30; i++) {

                            drawingengine.parse(load.maze1[i][j], i, j, gc);
                        }
                    }
                    break;
                case "RIGHT":
                    bullets --;
                    if (load.maze1[x +1][y ] == 8 || load.maze1[x +1][y ] == 3 || load.maze1[x +1][y ] == 4) {
                        System.out.println("its crate");
                        load.maze1[x +1][y] = 0;
                    }
                    gc.fillRect(0, 0, 1000, 1000);
                    for (j = 0; j < 30; j++) {
                        for (i = 0; i < 30; i++) {

                            drawingengine.parse(load.maze1[i][j], i, j, gc);
                        }
                    }
                    break;
                case "LEFT":
                    bullets --;
                    if (load.maze1[x-1][y] == 8 || load.maze1[x-1][y] == 3 || load.maze1[x-1][y] == 4) {
                        System.out.println("its crate");
                        load.maze1[x-1][y] = 0;
                    }
                    gc.fillRect(0, 0, 1000, 1000);
                    for (j = 0; j < 30; j++) {
                        for (i = 0; i < 30; i++) {

                            drawingengine.parse(load.maze1[i][j], i, j, gc);
                        }
                    }
                    break;
                    
            }
            bulletsLbl.setText(String.valueOf(bullets));
            
        }
            else {}
        }
        if (event.getCode() == KeyCode.P) {
            Context c = new Context();
            PauseState p = new PauseState();
            p.gameState(c, gameplayPnl);

            //  gc.setFill(Color.RED);
            //  gc.setStroke(Color.RED);
            gc.setLineWidth(60);
            gc.fillText("Game Paused", gameplayPnl.getWidth() / 2, 0);
            if (event.getCode() == KeyCode.C) {
                System.out.println("in C");
                Context cd = new Context();
                ContinueState con = new ContinueState();
                con.gameState(cd, gameplayPnl);
                for (j = 0; j < 30; j++) {
                    for (i = 0; i < 30; i++) {

                        drawingengine.parse(load.maze1[i][j], i, j, gc);
                    }
                }
            } else {
            }
            list.add(load.maze1);
        }
        if (event.getCode() == KeyCode.S) {
            LoadGame.saveMaze(list.get(list.size() - 1));
        }

    }

    @FXML
    private void loadBtnAvtion(ActionEvent event) throws FileNotFoundException {
        load.loadSaved();
         gc.fillRect(0, 0, 1000, 1000);
                    for (j = 0; j < 30; j++) {
                        for (i = 0; i < 30; i++) {

                            drawingengine.parse(load.maze1[i][j], i, j, gc);
                        }
                    }
                    healthLbl.setText(String.valueOf(health));
                    ScoreLbl.setText(String.valueOf(score));
                    bulletsLbl.setText(String.valueOf(bullets));
        
    }
}
