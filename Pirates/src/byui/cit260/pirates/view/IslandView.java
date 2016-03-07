/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.ControlIsland;

/**
 *
 * @author hawle_000
 */
public class IslandView extends View{
    
    public IslandView (){
        super("\nAs you are sailing you come accross an island"
            + "\nWhat will you do? Will you explore it?"
            + "\nOr are you going to ignore it and continue sailing?"
            + "\nEnter E for explore or C to continue sailing");
    }
    
    @Override
    public boolean doAction(String value){
       ControlIsland island = new ControlIsland();
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       switch(selection){    
          case 'E':
             island.explore();
             
              return true;
          case 'C':
             island.leave();
             
              return true;
          default:
              System.out.println("invalid entry");
      }
        return false;
    }
    
}
