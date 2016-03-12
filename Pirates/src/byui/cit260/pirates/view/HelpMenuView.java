/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import java.io.Serializable;


/**
 *
 * @author hawle_000
 */
public class HelpMenuView extends View implements Serializable{

    public HelpMenuView() {
        super( "\n-------------------------------"
            + "\n          Getting help         "
            + "\n-------------------------------"
            + "\nG - What is the goal of this game?"
            + "\nM - How do I move"
            + "\nL - How do I know where I am or look at the map?"
            + "\nS - What are my supplies?"
            + "\nE - Exit"
            + "\n--------------------------------");
    }
       
    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       switch(selection){
           case 'G':
               this.helpGoal();
               break;
           case 'M':
              this.helpMove();
              break;
           case 'L':
              this.helpPosition();
              break;
           case 'S':
              this.helpSupplies();
              break;
           case 'E': 
               return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }
    
    private void helpGoal(){
        System.out.println("\nThe Goal of this game is to reach the treasure"
                                + "\nbefore the oposing team does while trying"
                                + "\nto stay alive out on the open seas!");
    }
    private void helpMove() {
        System.out.println("You move by selection the direction you want"
                                + "\nto move the boat on the map");
    }
    private void helpPosition(){
        System.out.println("You can know where you are at by looking at"
                         + "\nwhere you are on the map."
                         + "\nYou can look at the map by...");
    }
    private void helpSupplies(){
        System.out.println("You can check on your supplies by...");
    }
   
}
