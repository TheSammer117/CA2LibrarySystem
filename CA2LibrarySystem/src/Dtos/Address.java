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
    private int userID;
    private String address1;
    private String address2;

    public Address() {
    }

    public Address(int addressID, int userID, String address1, String address2) {
        this.addressID = addressID;
        this.userID = userID;
        this.address1 = address1;
        this.address2 = address2;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
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
    public String toString() {
        return "Address{" + "addressID=" + addressID + ", userID=" + userID + ", address1=" + address1 + ", address2=" + address2 + '}';
    }

    
    @Override
    public int hashCode() {
        return ((Integer)this.getUserID()).hashCode()
                + ((Integer)this.getUserID()).hashCode()
                + this.getAddress1().hashCode()
                + this.getAddress2().hashCode();
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
        return this.getAddressID() == other.getAddressID()
                && this.getUserID() == other.getUserID()
                && this.getAddress1().equalsIgnoreCase(other.getAddress1())
                && this.getAddress2().equalsIgnoreCase(other.getAddress2());
    }
    
    
}
