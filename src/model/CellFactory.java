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
public class CellFactory {

    public Cell CreateCell(int type) {
        if (type == 1) {
            return new Player1();
        } else if (type == 3) {
            return new Thanos3();
        } else if (type == 4) {
            return new Ultron4();
        } else if (type == 5) {
            return new Grenade5();
        } else if (type == 6) {
            return new TNT6();
        } else if (type == 7) {
            return new StoneWall7();
        } else if (type == 8) {
            return new TreeWall8();
        }
        return null;

    }

}
