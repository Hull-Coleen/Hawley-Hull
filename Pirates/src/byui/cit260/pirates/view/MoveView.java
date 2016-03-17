/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.MapControl;
import byui.cit260.pirates.exception.MapControlException;
import byui.cit260.pirates.model.Avatar;
import byui.cit260.pirates.model.Point;
import java.io.Serializable;

public class MoveView extends View implements Serializable{

    public MoveView() {
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
    }
}
    
 
