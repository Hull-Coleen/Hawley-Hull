/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

/**
 *
 * @author Coleen
 */
public class ControlShip {
    public int daysOfFood(int numFoodCrate, int numCrew)
    {
        if (numFoodCrate < 0 || numCrew <= 0)
              return -1;
        if (numFoodCrate >= 50 || numCrew >= 9)
              return -1;
        int numOfMeals = numFoodCrate * 9;
        int daysOfFood = (numOfMeals / numCrew) / 3;
        return daysOfFood;
    }

    public void moveShip(){}
    public void fireCannon(){}
    public int checkAmmo(){
        int ammo = 0;
    return ammo;
    }
    
}
