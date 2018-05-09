/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dimension;
import java.awt.Graphics;
import view.*;

/**
 *
 * @author Tommy
 */
public class MyDrawingEngine {
public int HorizontalCells = 30;
public int VerticalCells = 30;
public Dimension CellDimensions = new Dimension(GameWindow.Dimensions.height/VerticalCells, GameWindow.Dimensions.width/HorizontalCells);
public int[][] Grid = new int[VerticalCells][HorizontalCells];

public void parse(int object,int i ,int j,Graphics g)
        
{
    //g.drawImage(image, i, i, io);
}


    
    
    
    
}
