/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;

//import byui.cit260.pirates.model.Location;
/**
 *
 * @author Thomas
 */
public enum Avatar implements Serializable{
    Pirate_Scarlet("Girl pirate."),
    Pirate_Pete("Boy pirate."),
    Captain_Jane("Girl navy."),
    Captian_Roberts("Boy navy.");
    
    private final String description;
    private final Point coordinates;

    
    Avatar(String description){
       this.description = description;
       coordinates = new Point(1,1);
    }
    public String getDescription(){
       return description;
    }
    
    public Point getCoordinates(){
       return coordinates;
    }
    
}
