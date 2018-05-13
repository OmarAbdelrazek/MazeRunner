/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tommy
 */
public class WallFactory {

    public WallFactory() {
    }


    public Wall createWall(int type) {
        if (type == 7) {
            return new StoneWall7();
        } else if (type == 8) {
            return new TreeWall8();
        }
        return null;
    }
    
}
