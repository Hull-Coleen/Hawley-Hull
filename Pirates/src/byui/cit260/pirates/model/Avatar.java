/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;
import java.util.Objects;
//import byui.cit260.pirates.model.Location;
/**
 *
 * @author Thomas
 */
public class Avatar implements Serializable{
   private boolean pirate;
   private Location coord = new Location();
    private String name;
    public Avatar() {
    
    coord.setRow(3);
    coord.setCol(5);
            }
    public Avatar(boolean pirate, Location coord, String name) {
        this.pirate = pirate;
        this.coord = coord;
        this.name = name;
    }

    public boolean isPirate() {
        return pirate;
    }

    public void setPirate(boolean pirate) {
        this.pirate = pirate;
    }

    public Location getCoord() {
        return coord;
    }

    public void setCoord(Location coord) {
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.pirate ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.coord);
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avatar other = (Avatar) obj;
        if (this.pirate != other.pirate) {
            return false;
        }
        if (!Objects.equals(this.coord, other.coord)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avatar{" + "pirate=" + pirate + ", coord=" + coord + ", name=" + name + '}';
    }
    

    

   
    
}
