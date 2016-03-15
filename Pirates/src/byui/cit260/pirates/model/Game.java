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
public class Game implements Serializable{
    private Ship ship;
    private Supplies[] supply;
    private Player player;
    private Map map;
    private String[] avatars;
    private Avatar avatar;
    private Scene[] scenes;
    private Location[][] location;

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }
    

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }
    
    
    
    public Supplies[] getSupply() {
        return supply;
    } 
   public String[] getAvatars() {
        return avatars;
    }
   
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
   
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setScenes(Scene[] scenes) {
       this.scenes = scenes;
    }


}
