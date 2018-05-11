/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ooomooo
 */
public class DrawMaze1 {
    private  static BufferedImage stoneWall , treeWall ,player , bomb ;
    private Graphics g;
    
   
    private static void loadImages(){
    try { stoneWall = ImageIO.read(new File("crate.png"));
                       JLabel sWall =  new JLabel(new ImageIcon(stoneWall));
                       System.out.println("opa");
                   } catch (IOException ex) {
                       JOptionPane.showMessageDialog(null, "Error!!");
                   }
    
    }
    protected void paintComponent(Graphics g) {
                
                g.drawImage(stoneWall, 0, 0, null);
      }
    public static void drawImages(JPanel gameplayPnl){
        loadImages();
       for (int i=0 ; i< 8 ; i++){
           for(int j=0 ; j< 21 ; j++){
               if(LoadMaze.maze1[i][j] == 7){
                   
                   
               }
           }
    }
    }
  
//    
//    
//    public  void drawMaze1(int[][] maze1 , JPanel g){
//        Graphics gc;
//        for(int i=0 ; i<8;i++){
//            for(int j=0 ; j< 21 ; j++){
//                if(maze1[i][j] == 7){
//                    
//                }
//                
//            }
//        }
//        
//    
//    }
   

    
}
