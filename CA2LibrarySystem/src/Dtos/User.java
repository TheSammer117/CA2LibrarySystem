/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

import java.util.Date;

/**
 *
 * @author samiwise
 */
public class User {
    
//CREATE TABLE `user` (
  //`userID` int(10) NOT NULL,
  //`email` varchar(50) NOT NULL,
  //`password` varchar(30) NOT NULL,
  //`firstName` varchar(50) NOT NULL,
  //`lastName` varchar(50) NOT NULL,
  //`isAdmin` int(1) NOT NULL,
  //`dateJoined` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
 // `active` int(1) NOT NULL
//) ENGINE=InnoDB DEFAULT CHARSET=latin1;//
    
    private int userID;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
   // private String country;
    //private String addressLine1;
    //private String addressLine2;
    private int isAdmin;
    private int active;

    public User(int userID, String email, String password, String firstName, String lastName, int isAdmin, int active) {
        this.userID = userID;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.active = active;
    }
    
    public User(String email, String password, String firstName, String lastName, int isAdmin, Date dateJoined, int active) {
        
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.active = active;
    }

    public User() {
    }

    public int getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public int getIsAdmin() {
        return isAdmin;
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.userID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.userID != other.userID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", isAdmin=" + isAdmin + '}';
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    
    
}
