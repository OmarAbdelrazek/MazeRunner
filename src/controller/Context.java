/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;


public class Context {
    private GameState state;
    public Context(){
      state = null;
   }

   public void setState(GameState state){
      this.state = state;		
   }

   public GameState getState(){
      return state;
   }

}
