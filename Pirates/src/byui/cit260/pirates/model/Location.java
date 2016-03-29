/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Location implements Serializable{
    private int row;
    private int col;
    private boolean visited;
    private boolean friendly;
    private boolean treasure;
    private Scene scene;
    private ArrayList<Avatar> avatars = new ArrayList<>();

    public boolean isFriendly() {
        return friendly;
    }

    public void setFriendly(boolean friendly) {
        this.friendly = friendly;
    }

    public boolean isTreasure() {
        return treasure;
    }

    public void setTreasure(boolean treasure) {
        this.treasure = treasure;
    }

    public Location() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Location(int row, int col) {
        this.row = row;
        this.col = col;
    }
    

    public ArrayList<Avatar> getAvatars() {
        return avatars;
    }
    public void setAvatars(ArrayList<Avatar> avatars) {
        this.avatars = avatars;
    }
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", col=" + col + ", visited=" + visited + ", scene=" + scene + ", avatars=" + avatars + '}';
    }
    

}
