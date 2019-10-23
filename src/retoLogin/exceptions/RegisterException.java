/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin.exceptions;

/**
 * Throws when there is a generic error in the register process.
 * @author Jon
 */
public class RegisterException extends Exception {
    public RegisterException (String message) {
        super(message);
    }
}
