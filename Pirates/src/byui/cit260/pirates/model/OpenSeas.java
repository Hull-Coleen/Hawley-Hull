/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class OpenSeas implements Serializable{
    private boolean storm;
    private boolean opposition;

    public OpenSeas(boolean storm, boolean opposition) {
        this.storm = storm;
        this.opposition = opposition;
    }

    public OpenSeas() {
    }

    public boolean isStorm() {
        return storm;
    }

    public void setStorm(boolean storm) {
        this.storm = storm;
    }

    public boolean isOpposition() {
        return opposition;
    }

    public void setOpposition(boolean opposition) {
        this.opposition = opposition;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.storm ? 1 : 0);
        hash = 71 * hash + (this.opposition ? 1 : 0);
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
        final OpenSeas other = (OpenSeas) obj;
        if (this.storm != other.storm) {
            return false;
        }
        if (this.opposition != other.opposition) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OpenSeas{" + "storm=" + storm + ", opposition=" + opposition + '}';
    }
    
    
}
