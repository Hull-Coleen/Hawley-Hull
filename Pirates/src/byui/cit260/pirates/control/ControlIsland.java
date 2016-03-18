/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import java.io.Serializable;

/**
 *
 * @author hawle_000
 */
public class ControlIsland implements Serializable {
    public boolean natives(){
    boolean natives = false;
    return natives;
    }
    public boolean nativesHostile(){   
    boolean nativesHostile = false;
    return nativesHostile;
    }
    public boolean resources(){   
    boolean resources = false;
    return resources;
    }
    public int resouceCount(){
        int resouceCount = 0;
        return resouceCount;
        
    }

    public void explore() {
       System.out.println("This is where we determine what happens if you explore.");
    }

    public void leave() {
        System.out.println("This is what happens if you leave the island");
    }
    
}
