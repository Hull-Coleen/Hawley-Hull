/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.MapControl;
import byui.cit260.pirates.exception.MapControlException;
import byui.cit260.pirates.model.Avatar;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Point;
import java.io.Serializable;
import java.util.Scanner;
import pirates.Pirates;

public class MoveView implements Serializable{
    
    
    public MoveView() {
        //super();
    }
    
    public boolean doAction(Map map){
        
        Scanner keyboard = new Scanner(System.in);
        //Location location = map.setCurrentLocation(locations[0][0]);
        System.out.println("Where do you want to go, enter row and col, between 0 - 4");
        MapView mapview = new MapView();
        mapview.display(map);
        //Game game = Pirates.getCurrentgame();
        int row = -1;
        while(row < 0 || row > 4)
        {
        System.out.println("enter row");
        //row = this.getInt(value);
        row = keyboard.nextInt();
        }
        
        int col = -1; 
        while(col < 0 || col > 4)
        {
        System.out.println("enter col");
        col = keyboard.nextInt();
        }
        Location[][] location = null;
        
        map.setCurrentLocation(location[row][col]);
        //game.getMap().setCurrentLocation(location[row][col]);
    return true;
    }
    
    
    /*    public MoveView() {
        super("\n-------------------------------"
            + "\n       Move  Menu              "
            + "\n-------------------------------"
            + "\nW - Move up"
            + "\nS - Move down"
            + "\nA - Move left"
            + "\nD - Move right"
            + "\nB - Battle"
            + "\nE - Exit"
            + "\n--------------------------------");
    }
    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       switch(selection){
           case 'W': 
               this.moveShipUp();
               break;
           case 'S':
              this.moveShipDown();
               break;
           case 'G':
              this.moveShipLeft();
              break;
           case 'M':
               this.moveShipRight();
               break;
           case 'B':
              this.fight();
              
           case 'E': 
               return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }
  
    private void moveShipUp() {
        System.out.println("Move ship up stubbed");
        Avatar avatar = null;
        Point coordinates = null;
        try
        {
           MapControl.moveAvatarToLocation(avatar, coordinates);
        }
        catch(MapControlException me)
        {
            System.out.println(me.getMessage());
        }
                
        
    }

    private void moveShipDown() {
       System.out.println("Move ship down stubbed");
    }

    private void moveShipLeft() {
        System.out.println("Move ship left stubbed");
        
    }

    private void moveShipRight() {
    System.out.println("Move ship right stubbed");   
    }

    private void fight() {
       BattleView battle = new BattleView();
       battle.display();
    }*/
}
    
 
