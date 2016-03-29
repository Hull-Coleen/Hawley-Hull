/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class ControlBattles implements Serializable{
    public int battleStrength(){
    int strength = 0;
    return strength;
    }
    public int battleSpeed(){
        int speed = 0;
        return speed;
        
    }

    public void battle() {
        // TODO figure out ammo
        int ammo = 0;
       System.out.println("You are in a battle for your life!!");
       if (ammo > 1)
           System.out.println("You won the battle!!");
       else
       {
           System.out.println("You didnt have enough ammo to survive the battle"
                   + "You died...");
                   System.exit(0);
        }
       
    }

    public void run() {
        int run = 0;
        System.out.println("You try to run away"
                + "lets see if you made it");
        if(run > 5)
            System.out.println("You got away!");
        else 
        {
            System.out.println("You were not able to get away!"
                    + "Prepair for battle!!");
            battle();
        }
    }
    
    
}
