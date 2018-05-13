/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.canvas.GraphicsContext;
import view.GameplayController;

public class Player1 {

    private int i;
    private int j;
    private static Player1 player;
    private int health = 100;
    private int lives = 3;
    private int score = 0;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int bullets = 6;
    private String name;

    private Player1() {

    }

    public static Player1 getInstance() {
        if (player == null) {
            player = new Player1();
        }

        return player;
    }
    public void draw(GraphicsContext gc, int i ,int j) {
        javafx.scene.image.Image img = new javafx.scene.image.Image("Resources/player.gif");        
        double x = GameplayController.CellHeight;
        double y = GameplayController.CellWidth;
        double XonGrid = x * (i);
        double YonGrid = y * (j);
        gc.drawImage(img, XonGrid, YonGrid, GameplayController.CellWidth,GameplayController.CellHeight+6);
    }
    
    public void fire() {

    }

    public void die() {
        
    }

    public void hit() {
        
    }

    public void move() {

    }

}
