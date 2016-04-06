/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Avatar;
import java.util.Scanner;


/**
 *
 * @author Coleen
 */
public class AvatarView extends View {
    private static int  spot;
    Avatar[] names = Avatar.values();
    public AvatarView() {
        super("Navy or Pirate type N for Navy or P for Pirate: ");
      //  Avatar[] names = Avatar.values();
        for (Avatar name : Avatar.values())
            this.console.println(name);
    }
    
    public boolean doAction(String value){
       //Avatar avatar = new Avatar();
        
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       
       String choice;
       char charChoice;
       //int avatar;
       try {
       switch(selection){    
          case 'N':
              this.console.println("Enter B for boy or G for Girl");
              choice = this.keyboard.readLine().toUpperCase();
              choice = choice.trim();
                      
              charChoice = choice.charAt(0);
              if (charChoice == 'B'){
                  Avatar avatar = Avatar.Captain_Roberts;
                  this.console.println("you chose " + avatar);
                  setSpot(3);
              }
              else if (charChoice == 'G'){
                  Avatar avatar = Avatar.Captain_Jane;
                  this.console.println("you chose " + avatar);
                  setSpot(2);
              }
               else {
                  this.console.println("Invalid Entry");
                  return false;
              }
              return true;
       
              
          case 'P':
              this.console.println("Enter B for boy or G for Girl");
              choice = this.keyboard.readLine().toUpperCase();
              choice = choice.trim();
                      
              charChoice = choice.charAt(0);
              if (charChoice == 'B'){
                  Avatar avatar = Avatar.Pirate_Pete;
                  this.console.println("you chose " + avatar);
                  setSpot(1);
              }
              else if (charChoice == 'G'){
                  Avatar avatar = Avatar.Pirate_Scarlet;
                  this.console.println("you chose " + avatar);
                  setSpot(0);
              }
              else {
                  this.console.println("Invalid Entry");
                  return false;
              }
              return true;
         
          default:
              this.console.println("invalid entry");
      }
        
       }catch(Exception e){
           this.console.println("\nError reading input:" + e.getMessage());
       }
       return false;
    }
    public static int getSpot()
    { 
        return spot;
    }
    public void setSpot(int spot){
        this.spot = spot;
    }

}
