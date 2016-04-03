
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;



import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.model.Avatar;
import byui.cit260.pirates.model.Map;
import java.io.IOException;
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
            + "\nG - Get supplies for ship"
            + "\nM - Move ship"
            + "\nC - Show Current Supplies"
            + "\nD - Display Map"
            + "\nN - Show Avatar name"
            + "\nF - Show Supply Amounts"
            + "\nR - Show Report"
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
           case 'G':
              this.supplyShip();
              break;
           case 'M':
               this.moveShip();
               break;
           case 'V':
                this.currentSupplies();
                break;
           case 'D':
               this.displayMap();
               break;
           case'C':
               this.displaySupply();
               break;
           case 'N':
               this.displayName();
               break;
           case 'F':
               this.displayFoodAmount();
               break;
           case 'R':
           {
             try {
                this.displayReport();
             } catch (IOException ex) {
              ErrorView.display("ReportView", ex.getMessage());
             }
            }
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


    private void supplyShip() {
        SupplyShipView supplyShip = new SupplyShipView();
        supplyShip.display();
    }

    private void moveShip() {
        Map map = Pirates.getCurrentgame().getMap();
        MapView mapView = new MapView();
        mapView.display(map);
        mapView.move(map);   
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

       SupplyView supply = new SupplyView();
       supply.display();
    }

    private void displayName() {
      // GameControl game = new GameControl();
      // game.names(); 
       int spot = AvatarView.getSpot();
       if (spot == Avatar.Captain_Jane.ordinal()){
           this.console.println(Avatar.Captain_Jane); 
       }
       else if (spot ==Avatar.Captain_Roberts.ordinal()){
           this.console.println(Avatar.Captain_Roberts);
       }
       else if (spot ==Avatar.Pirate_Scarlet.ordinal()){
           this.console.println(Avatar.Pirate_Scarlet);     
       }
       else  
           this.console.println(Avatar.Pirate_Pete);
           
       //this.console.println(Avatar(spot));
    }

    private void displayFoodAmount() {
      CurrentSupplyView supply = new CurrentSupplyView();
      supply.display();
    }

    private void displayReport() throws IOException  {
        ReportView report = new ReportView();
        try {
        report.reportDisplay();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    

}
        
    

