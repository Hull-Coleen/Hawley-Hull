/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import java.io.PrintWriter;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class ErrorView {
 private static final PrintWriter errorFile = Pirates.getOutFile();
 private static final PrintWriter logFile = Pirates.getLogFile();
 
 public static void display(String className, String errorMessage) {
     errorFile.println(
                "-------------------------------------------------"
              + "\n- ERROR - " + errorMessage
              + "\n-------------------------------------------------");
     // log Error
     logFile.println(className + " - " + errorMessage);
 }
}
