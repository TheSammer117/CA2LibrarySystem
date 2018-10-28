/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

import java.util.Objects;

/**
 *
 * @author HaiyunYu D00188956
 * 
 */
public class Address {
    /**

  `addressID` int(10) NOT NULL,
  `userID` int(10) NOT NULL,
  `address1` varchar(50) DEFAULT NULL,
  `address2` varchar(50) DEFAULT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
     **/
    private int addressID;
    private User user;
    private String address1;
    private String address2;

    public Address() {
    }

    public Address(int addressID, User user, String address1, String address2) {
        this.addressID = addressID;
        this.user = user;
        this.address1 = address1;
        this.address2 = address2;
    }
    
    public Address(User user, String address1, String address2){
        this.user = user;
        this.address1 = address1;
        this.address2 = address2;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.addressID;
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
        final Address other = (Address) obj;
        if (this.addressID != other.addressID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Address{" + "addressID=" + addressID + ", user=" + user + ", address1=" + address1 + ", address2=" + address2 + '}';
    }


    

    

    
    
}
