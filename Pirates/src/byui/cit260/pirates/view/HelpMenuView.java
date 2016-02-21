/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author hawle_000
 */
public class HelpMenuView implements Serializable{
    
    public HelpMenuView() {
    }
    public final String HELPMENU = "\n"
            + "\n-------------------------------"
            + "\n          Getting help         "
            + "\n-------------------------------"
            + "\nG - What is the goal of this game?"
            + "\nM - How do I move"
            + "\nL - How do I know where I am or look at the map?"
            + "\nS - What are my supplies?"
            + "\nE - Exit"
            + "\n--------------------------------";
    
      private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
    
        while(!valid){
            input = keyboard.nextLine();
           
            if (input.length() < 1){
            System.out.println("Invalid name: must not be empty");
            continue;
            }
            break;
        }
      
        return input;
    }       
    
    private void doAction(char selection) {
       switch(selection){
           case 'G':
           case 'g':
               this.helpGoal();
               break;
           case 'M':
           case 'm':
              this.helpMove();
              break;
           case 'L':
           case 'l':
              this.helpPosition();
              break;
           case 'S':
           case 's':
              this.helpSupplies();
              break;
           case 'E': case 'e':
               return;
           default:
               System.out.println("Invalid Entry");
               break;
       }
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
    void displayHelpMenuView() {
        
         char selection = ' ' ;
       do {
           System.out.println(HELPMENU);
           String input = this.getInput();
           selection = input.charAt(0);
           //char fUpper = Character.toUpperCase(selection);
           this.doAction(selection);        
       }while(selection != 'E');
    }
}
