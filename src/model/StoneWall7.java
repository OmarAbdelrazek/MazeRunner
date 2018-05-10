/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class StoneWall7 extends Cell implements Wall{

    public StoneWall7() throws IOException {
        this.setImg(ImageIO.read(new File("model/crate.png")));
    }
    

    @Override
    public void draw(Graphics2D g,int i ,int j) {
        g.drawImage(this.getImg(), 0, 0, 0, 0, null);
    }

    @Override
    public void hit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


}



