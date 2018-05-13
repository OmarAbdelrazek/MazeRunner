/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class BombFactory {

    public BombFactory() {
    }
    
    public Bomb CreateBomb(int type){
        if(type == 5)
            return new Grenade5();
            else if(type == 6)
                return new TNT6();
            return null;
    }

}
