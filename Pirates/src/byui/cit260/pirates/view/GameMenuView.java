
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;



import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.model.Map;
import java.io.Serializable;
import pirates.Pirates;



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
    
    public boolean doAction(String value) {
      value = value.toUpperCase();
      char selection;
      selection = value.charAt(0); 

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
               this.displayMap();
               break;
           case'V':
               this.displaySupply();
               break;
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

    private void displayMap() {
      
       Map map = Pirates.getCurrentgame().getMap();
       MapView mapView = new MapView();
       mapView.display(map);
  
    } 

    private void displaySupply() {

       GameControl game = new GameControl();
       game.supplyAmount();
    }
    

}
        
    

