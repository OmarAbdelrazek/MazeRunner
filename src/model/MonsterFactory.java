/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class MonsterFactory {

    public MonsterFactory() {
    }

    public Monster createMonster(int type) {
        if (type == 3) {
            return new Thanos3();
        } else if (type == 4) {
            return new Ultron4();
        }
        return null;
    }

}
