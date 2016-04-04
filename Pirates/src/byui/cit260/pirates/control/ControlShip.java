/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.exception.ControlShipException;
import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class ControlShip implements Serializable{
    private int numCrew = 6;
    private int numFoodCrate;
    private int numCannon = 6;
    private int numAmmoCrate;

    public int getNumAmmoCrate() {
        return numAmmoCrate;
    }

    public void setNumAmmoCrate(int numAmmoCrate) {
        this.numAmmoCrate = numAmmoCrate;
    }

    public int getNumCrew() {
        return numCrew;
    }

    public int getNumCannon() {
        return numCannon;
    }
     
    //public void setNumCrew(int numCrew) {
     //   this.numCrew = numCrew;
    //}

    public int getNumFoodCrate() {
        return numFoodCrate;
    }

    public void setNumFoodCrate(int numFoodCrate) {
        this.numFoodCrate = numFoodCrate;
    }
    
    public static double daysOfFood(int numFoodCrate, int numCrew) throws ControlShipException
    {
        if (numFoodCrate < 0 || numCrew <= 0)
              throw new ControlShipException(" Invalid entry try again");
        if (numFoodCrate >= 20 || numCrew >= 9)
              throw new ControlShipException(" invalid entry");
        double numOfMeals = numFoodCrate * 6;
        double daysOfFood = numOfMeals / 6;
        return daysOfFood;
    }

    public void moveShip(){}
    public void fireCannon(){}
    public static double checkAmmo(int numAmmoCrate, int numCannon) throws ControlShipException
    {
        if (numAmmoCrate < 0 || numCannon <= 0)
            throw new ControlShipException(" Invalid entry try again");  
        if (numAmmoCrate >= 12 || numCannon >= 9)
             throw new ControlShipException(" Invalid entry try again"); 
        int numOfAmmo = numAmmoCrate * 6;
        double numBattle = numOfAmmo / 6;
        return numBattle;
    }
    public static double checkRum(int numRumCrate) throws ControlShipException
    {
        int rum = numRumCrate;
        if (rum > 15)
            throw new ControlShipException("Invalid entry: Try again");
        return rum;
    }
    
}
