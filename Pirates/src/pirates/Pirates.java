/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates;

import byui.cit260.pirates.model.Player;

/**
 *
 * @author Coleen
 */
public class Pirates {
    
      public static void testPlayerClass()
      {
         Player PlayerOne = new Player();
        Player PlayerTwo = new Player("Ashley", 4.5);
        
        PlayerOne.setName("Katelynn");
        PlayerOne.setBestTime(5.6);
        
        System.out.println(PlayerOne.toString());
        System.out.println(PlayerTwo.toString());
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      testPlayerClass();
    }
}
