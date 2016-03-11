/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates;

import byui.cit260.pirates.model.Island;
import byui.cit260.pirates.model.Player;
import byui.cit260.pirates.model.Port;
import byui.cit260.pirates.model.Supplies;
import byui.cit260.pirates.model.Avatar;
//import byui.cit260.pirates.control.ControlSupplies;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.OpenSeas;
import byui.cit260.pirates.model.Ship;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.view.StartProgramView;
import java.io.Serializable;
/**
 *
 * @author Coleen & Thomas
 */
public class Pirates implements Serializable {
     private static Game currentgame = null;
     private static Player player = null;

    public static Game getCurrentgame() {
        return currentgame;
    }

    public static void setCurrentgame(Game currentgame) {
        Pirates.currentgame = currentgame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Pirates.player = player;
    }
     
    
     /* public static void testControlSupplies(){
          ControlSupplies supply = new ControlSupplies();
          System.out.println(supply.storage(2, 6, 2, 2, 3, 2));
      } */
    
      public static void testMapClass(){
          Map map = new Map(2, 19);
          System.out.println(map.toString());
      }
      public static void testShipClass(){
          Ship ship = new Ship("Small", 5, 5, 1, 4);
          System.out.println(ship.toString());
          
      }
      public static void testOpenSeasClass()
      {
          OpenSeas sea = new OpenSeas(true, false);
          System.out.println(sea.toString());
          
      }
   
      public static void testIslandClass()
      {
         Island island =  new Island(true, true, false, 10);
         System.out.println(island.toString());  
      }
      public static void testPortClass()
      {
           Port port = new Port(10, 15, true);
           
           System.out.println(port.toString());
           
      }
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
       
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        //Location coord = new Location();
      //testPlayerClass();
      //testPortClass();
      //testIslandClass();
      //testSupplyClass();
      //testLocationClass();
     // testAvatarClass();
      //testOpenSeasClass();
      //testShipClass();
      //testMapClass();
      //testControlSupplies();
    }

    public static void setCurrentGame(Game game) {
       System.out.println("stubbed setCurrentGame in Pirates class");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Game getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
