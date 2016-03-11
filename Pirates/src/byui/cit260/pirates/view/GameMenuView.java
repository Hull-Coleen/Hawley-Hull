
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;


import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import java.io.Serializable;



/**
 *
 * @author Coleen
 */
public class GameMenuView extends View implements Serializable{

    public GameMenuView() {
        super("\n-------------------------------"
            + "\n       Game Start  Up Menu     "
            + "\n-------------------------------"
            + "\nP - Pirate or Navy"
            + "\nS - Pick Ship Size"
            + "\nG - Get supplies for ship"
            + "\nM - Move ship"
            + "\nC - Show Current Supplies"
            + "\nD - Display Map"
            + "\nE - Exit"
            + "\n--------------------------------");
    }
    //Map map = new Map();
    public boolean doAction(String value) {
      value = value.toUpperCase();
      char selection;
      selection = value.charAt(0); 
       Location locations = new Location();
       Map map = new Map();
       switch(selection){
           case 'P': 
               this.chooseAvatar();
               break;
           case 'S':
              this.getShipSize();
               break;
           case 'G':
              this.supplyShip();
              break;
           case 'M':
               this.moveShip();
               break;
           case 'C':
                this.currentSupplies();
                break;
           case 'D':
              // Map map = new Map();
               //this.displayMap(Location[][] locations);
             //  Location locations = new Location();
               this.displayMap(map);
           case 'E': 
               return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }
 
    private void chooseAvatar() {
      
        AvatarView avatar = new AvatarView();
        avatar.display();
    }

    private void getShipSize() {
       System.out.println("getShipSize stubbed");
    }

    private void supplyShip() {
        SupplyShipView supplyShip = new SupplyShipView();
        supplyShip.display();
    }

    private void moveShip() {
        MoveView move = new MoveView();
        move.display();
    }
    private void currentSupplies() {
        CurrentSupplyView CurrentSupply = new CurrentSupplyView();
        CurrentSupply.display();
    }

    private void displayMap(Map map) {
       // Location[][] location = new Location();
        Location[][] locations = map.getLocations();
         String menu = ""
            + "\n***********************************************************************"
            + "\n" + map.getName() + " - " + map.getDescription()
            + "\n***********************************************************************";
            
            System.out.println(menu);
        
         
        for (Location[] location : map.getLocations()) {
            for (int col = 0; col < map.getLocations().length; col++){
                
                
                System.out.print("| " + map.getLocations() + " | ");
            }
        }
    } 


    
}
        
    

