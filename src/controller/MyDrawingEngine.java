/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.*;

/**
 *
 * @author Tommy
 */
public class MyDrawingEngine implements ActionListener{
public int HorizontalCells = 30;
public int VerticalCells = 30;
public Dimension CellDimensions = new Dimension(GameWindow.Height/VerticalCells, GameWindow.Width/HorizontalCells);
public int[][] Grid = new int[VerticalCells][HorizontalCells];

public void parse(int object,int i ,int j,Graphics g)
        
{
    //g.drawImage(image, i, i, io);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
    
}
