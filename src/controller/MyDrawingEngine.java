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
import javafx.scene.canvas.GraphicsContext;
import model.*;
//import view.*;

/**
 *
 * @author Tommy
 */
public class MyDrawingEngine implements ActionListener{
public int HorizontalCells = 30;
public int VerticalCells = 30;
//public int CellHeight = GameWindow.Height/VerticalCells;
//public int CellWidth = GameWindow.Width/HorizontalCells;
public int[][] Grid = new int[VerticalCells][HorizontalCells];

    public MyDrawingEngine() {
    }

/*public void parse(int object,int i ,int j,GraphicsContext gc)
        
{
    if(object==3||object==4)
    {
     MonsterFactory MF = new MonsterFactory();
     Monster m =  MF.createMonster(object);
     m.draw(gc);
    }
    else if (object==5||object==6)
    {
     WallFactory WF = new WallFactory();
     Wall w =  WF.createWall(object);
     w.draw(gc);
    }
    else if (object==7||object==8)
    {
     BombFactory BF = new BombFactory();
     Bomb b =  BF.CreateBomb(object);
     b.draw(gc);
    }
}*/
    public void parse(int object,int i ,int j,GraphicsContext gc)
        
{
    if(object==3)
    {
     Thanos3 t = new Thanos3();
     t.setI(i);
     t.setJ(j);
     t.draw(gc);
    }
    else if(object==4)
    {
     Ultron4 t = new Ultron4();
     t.setI(i);
     t.setJ(j);
     t.draw(gc);
    }
    else if (object==5)
    {
     Grenade5 t = new Grenade5();
     t.setI(i);
     t.setJ(j);
     t.draw(gc);
    }
    else if (object==6)
    {
     TNT6 t = new TNT6();
     t.setI(i);
     t.setJ(j);
     t.draw(gc);
    }
    else if (object==7)
    {
     StoneWall7 t = new StoneWall7();
     t.setI(i);
     t.setJ(j);
     t.draw(gc);
    }
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
    
}
