/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.exception;

/**
 *
 * @author thawley
 */
public class ControlSuppliesException extends Exception{

    public ControlSuppliesException() {
    }

    public ControlSuppliesException(String message) {
        super(message);
    }

    public ControlSuppliesException(String message, Throwable cause) {
        super(message, cause);
    }

    public ControlSuppliesException(Throwable cause) {
        super(cause);
    }

    public ControlSuppliesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
