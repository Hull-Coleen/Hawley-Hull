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
public class ControlSuppliesTest {
    
    public ControlSuppliesTest() {
    }

   

    /**
     * Test of getFood method, of class ControlSupplies.
     */
    @Test
    public void testGetFood() {
        /*System.out.println("getFood");
        int food = 5;
        ControlSupplies instance = new ControlSupplies();
        double expResult = 0.1;
        double result = instance.getFood(food);
        assertEquals(expResult, result, 0.0); */
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
         System.out.println("getFood 2");
         int food = 10;
        ControlSupplies instance = new ControlSupplies();
        double expResult = 0.3;
        double result = instance.getFood(food);
        assertEquals(expResult, result, 0.0);
    } 

    /**
     * Test of getRum method, of class ControlSupplies.
     */
   /* @Test
    public void testGetRum() {
        System.out.println("getRum");
        int rum = 0;
        ControlSupplies instance = new ControlSupplies();
        double expResult = 0.0;
        double result = instance.getRum(rum);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmmo method, of class ControlSupplies.
     */
   /* @Test
    public void testGetAmmo() {
        System.out.println("getAmmo");
        int ammo = 0;
        ControlSupplies instance = new ControlSupplies();
        double expResult = 0.0;
        double result = instance.getAmmo(ammo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    } */
   
}
  
  

