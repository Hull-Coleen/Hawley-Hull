/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.ControlBattles;

/**
 *
 * @author Coleen
 */
public class BattleView extends View {

    public BattleView() {
        super("\nYou've come across another ship on the open seas"
            + "\nWhat aare you going to do? Are you going to fight?"
            + "\nOr are you going to try to out run the ship?"
            + "\nEnter F for fight or R for run away");
    }
    @Override
    public boolean doAction(String value){
       ControlBattles battle = new ControlBattles();
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       switch(selection){    
          case 'F':
             battle.fight();
             
              return true;
          case 'R':
             battle.run();
             
              return true;
          default:
              System.out.println("invalid entry");
      }
        return false;
    }

   // void display() {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
    
}
