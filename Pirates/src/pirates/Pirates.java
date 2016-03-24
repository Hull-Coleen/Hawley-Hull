/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates;

import byui.cit260.pirates.model.Player;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Coleen & Thomas
 */
public class Pirates implements Serializable {
     private static Game currentgame = null;
     private static Player player = null;
     private static PrintWriter outFile = null;
     private static BufferedReader inFile = null;
     private static PrintWriter logFile= null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Pirates.logFile = logFile;
    }
     
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Pirates.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Pirates.inFile = inFile;
    }
     
    public static Game getCurrentgame() {
        return currentgame;
    }

    public static void setCurrentgame(Game currentgame) {
        Pirates.currentgame = currentgame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Pirates.player = player;
    }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Pirates.inFile = new BufferedReader(new InputStreamReader(System.in));
            Pirates.outFile = new PrintWriter(System.out, true);
            try {
                String filePath = "log.txt";
                Pirates.logFile = new PrintWriter(filePath);
            }catch(Exception e){
                System.out.println("Exception: " + e.toString() +
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
            }
        
           StartProgramView startProgramView = new StartProgramView();
           startProgramView.display();
           return;
        }
        catch(Throwable te){
            System.out.println(te.getMessage());
            System.out.println("Exception" + te.toString()+
                               "\nCauses" + te.getCause()+
                               "\nMessage" + te.getMessage());
            te.printStackTrace();;
            

        }
        finally{
            try {
                if(Pirates.inFile != null)
                    Pirates.inFile.close();
                if(Pirates.outFile != null)
                    Pirates.outFile.close();
                if (Pirates.logFile != null)
                    Pirates.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        
        }
    }

  
}
