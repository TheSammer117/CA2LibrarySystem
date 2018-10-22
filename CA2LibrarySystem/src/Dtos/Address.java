/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

import java.util.Objects;

/**
 *
 * @author omy
 */
public class Address {
    /**

  `addressID` int(10) NOT NULL,
  `userID` int(10) NOT NULL,
  `address1` varchar(50) DEFAULT NULL,
  `address2` varchar(50) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phone` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
     **/
    private int addressID;
    private int userID;
    private String address1;
    private String address2;
    private String email;
    private int phone;

    public Address() {
    }

    public Address(int addressID, int userID, String address1, String address2, String email, int phone) {
        this.addressID = addressID;
        this.userID = userID;
        this.address1 = address1;
        this.address2 = address2;
        this.email = email;
        this.phone = phone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Address{" + "addressID=" + addressID + ", userID=" + userID + ", address1=" + address1 + ", address2=" + address2 + ", email=" + email + ", phone=" + phone + '}';
    }

    
    @Override
    public int hashCode() {
        return ((Integer)this.getUserID()).hashCode()
                + ((Integer)this.getUserID()).hashCode()
                + this.getAddress1().hashCode()
                + this.getAddress2().hashCode()
                + this.getEmail().hashCode()
                + ((Integer)this.getPhone()).hashCode();
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
                && this.getAddress2().equalsIgnoreCase(other.getAddress2())
                && this.getEmail().equalsIgnoreCase(other.getEmail())
                && this.getPhone() == other.getPhone();
    }
    
    
}
