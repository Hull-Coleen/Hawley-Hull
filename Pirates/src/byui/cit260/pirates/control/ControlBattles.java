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

    public void fight() {
       System.out.println("This is where we determine what happens if they fight.");
    }

    public void run() {
        System.out.println("This is what happens if you run intead");
    }
    
    
}
