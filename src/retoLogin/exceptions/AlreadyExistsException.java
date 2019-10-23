/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin.exceptions;

/**
 * Throws when the username already exists during the register process.
 * @author Jon
 */
public class AlreadyExistsException extends Exception {
    public AlreadyExistsException (String message) {
        super(message);
    }
}
