/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.model.Avatar;
import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Ship;
import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class ControlMap implements Serializable{
    public void moveAvatar(Avatar avatar, Location location){}
    public void goPort(Avatar avatar, Ship ship){}
    public void goIsland(Avatar avatar, Ship ship){}
    
}
