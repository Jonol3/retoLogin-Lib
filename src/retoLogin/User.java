/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The java bean of the user, to be used in the Message.
 * @author Jon
 */
public class User implements Serializable {
    //Attributes
    private int id;
    private String login;
    private String email;
    private String fullName;
    private int status;
    private int privilege;
    private String password;
    private Timestamp lastAccess;
    private Timestamp lastPasswordChange;

    //Constructors
    public User() {
    }

    public User(int id, String login, String email, String fullName, int status, int privilege, String password, Timestamp lastAccess, Timestamp lastPasswordChange) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullName = fullName;
        this.status = status;
        this.privilege = privilege;
        this.password = password;
        this.lastAccess = lastAccess;
        this.lastPasswordChange = lastPasswordChange;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getStatusString() {
        if (status == 1) {
            return "ENABLED";
        } else if (status == 2) {
            return "DISABLED";
        }
        return null;
    }

    public void setStatusString(String status) {
        if (status.equals("ENABLED")) {
            this.status = 1;
        } else if (status.equals("DISABLED")) {
            this.status = 2;
        }
    }

    public int getPrivilege() {
        return privilege;
    }

    public void setPrivilege(int privilege) {
        this.privilege = privilege;
    }
    
    public String getPrivilegeString() {
        if (privilege == 1) {
            return "USER";
        } else if (privilege == 2) {
            return "ADMIN";
        }
        return null;
    }

    public void setPrivilegeString(String status) {
        if (status.equals("USER")) {
            this.privilege = 1;
        } else if (status.equals("ADMIN")) {
            this.privilege = 2;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Timestamp lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Timestamp getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(Timestamp lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
    
    
}
