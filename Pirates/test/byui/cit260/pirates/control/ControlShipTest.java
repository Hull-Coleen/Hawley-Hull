/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Coleen
 */
public class ControlShipTest {
    
    public ControlShipTest() {
    }

    /**
     * Test of daysOfFood method, of class ControlShip. Test 1
     */
    @Test
    public void testDaysOfFood() {
        System.out.println("Test daysOfFood");
        System.out.println("Test 1");
        
        int numFoodCrate = 3;
        int numCrew = 2;
        ControlShip instance = new ControlShip();
        double expResult = 4.5;
        double result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
        /*
           test 2
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 2");
        
        numFoodCrate = 2;
        numCrew = 6;
        expResult = 1;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
          /*
           test 3
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 3");
        
        numFoodCrate = 0;
        numCrew = 2;
        expResult = 0.0;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
          /*
           test 4
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 4");
        
        numFoodCrate = 3;
        numCrew = -1;
        expResult = -1.0;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
          /*
           test 5
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 5");
        
        numFoodCrate = -1;
        numCrew = 3;
        expResult = -1.0;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
          /*
           test 6
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 6");
        
        numFoodCrate = 5;
        numCrew = 0;
        expResult = -1.0;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
          /*
           test 7
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 7");
        
        numFoodCrate = 50;
        numCrew = 3;
        expResult = -1.0;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
          /*
           test 8
        */
         System.out.println("Test daysOfFood");
        System.out.println("Test 8");
        
        numFoodCrate = 9;
        numCrew = 10;
        expResult = -1.0;
        result = instance.daysOfFood(numFoodCrate, numCrew);
        assertEquals(expResult, result, 0.0);
        
    }

  
  /*  @Test
    
    public void testCheckAmmo() {
        System.out.println("checkAmmo");
        ControlShip instance = new ControlShip();
        int expResult = 0;
        int result = instance.checkAmmo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
    
}
