/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.util.Objects;

/**
 *
 * @author Coleen
 */
public class Ship {
    String type;
    int size;
    int speed;
    int cannons;
    int crew;

    public Ship(String type, int size, int speed, int cannons, int crew) {
        this.type = type;
        this.size = size;
        this.speed = speed;
        this.cannons = cannons;
        this.crew = crew;
    }

    public Ship() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCannons() {
        return cannons;
    }

    public void setCannons(int cannons) {
        this.cannons = cannons;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.type);
        hash = 59 * hash + this.size;
        hash = 59 * hash + this.speed;
        hash = 59 * hash + this.cannons;
        hash = 59 * hash + this.crew;
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
        final Ship other = (Ship) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.speed != other.speed) {
            return false;
        }
        if (this.cannons != other.cannons) {
            return false;
        }
        if (this.crew != other.crew) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ship{" + "type=" + type + ", size=" + size + ", speed=" + speed + ", cannons=" + cannons + ", crew=" + crew + '}';
    }
    
}
