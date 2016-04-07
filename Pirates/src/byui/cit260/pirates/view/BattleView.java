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
        super("\nThe people where you landed are attacking."
            + "\nWhat aare you going to do? Are you going to fight?"
            + "\nOr are you going to try to out run the ship?"
            + "\nEnter F for fight or R for run away");
    }
    @Override
    public boolean doAction(String value){
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       switch(selection){    
          case 'F':
             ControlBattles.battle();
             
              return true;
          case 'R':
             ControlBattles.run();
             
              return true;
          default:
              this.console.println("invalid entry");
      }
        return false;
    }

    
}
