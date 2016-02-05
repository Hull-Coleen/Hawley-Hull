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
import byui.cit260.pirates.model.ControlSupplies;
import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.OpenSeas;
import byui.cit260.pirates.model.Ship;
import byui.cit260.pirates.model.Map;
import java.io.Serializable;
/**
 *
 * @author Coleen & Thomas
 */
public class Pirates implements Serializable {
      public static void testControlSupplies(){
          ControlSupplies supply = new ControlSupplies();
          System.out.println(supply.storage(2, 6, 2, 2, 3, 2));
      }
    
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
      public static void testLocationClass()
              
      {
          Location location = new Location(5, 6);
          System.out.println(location.toString());
          
      }
      public static void testAvatarClass()
      {
         Avatar avatar = new Avatar();
          Location coord = null;
         avatar.setCoord(coord);
         avatar.setName("Black Beard");
         avatar.setPirate(true);
         System.out.println(avatar.toString());
         
      }
      public static void testSupplyClass()
      {
         Supplies supplies = new Supplies(10, 15 , 5, "food");
         System.out.println(supplies.toString());
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
        //Location coord = new Location();
      testPlayerClass();
      testPortClass();
      testIslandClass();
      testSupplyClass();
      testLocationClass();
      testAvatarClass();
      testOpenSeasClass();
      testShipClass();
      testMapClass();
      testControlSupplies();
    }
}
