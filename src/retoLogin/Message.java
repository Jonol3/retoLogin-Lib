/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin;

/**
 * The class that will be used as the message by the sockets.
 * @author Jon
 */
public class Message {
    //Attributes
    private int type;
    private User user;
    
    //Constructors
    public Message() {
    }

    public Message(int type, User user) {
        this.type = type;
        this.user = user;
    }
    
    //Getters and Setters
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
