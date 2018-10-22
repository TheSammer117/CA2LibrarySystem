/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

//import java.time.LocalDateTime;
import java.sql.Date;

/**
 *
 * @author samiwise
 */
public class Borrowed {

    /**
     * CREATE TABLE `borrowed` ( `borrowedID` int(10) NOT NULL, `userID` int(10)
     * NOT NULL, `titleID` int(10) NOT NULL, `status` int(1) NOT NULL,
     * `dayStarted` datetime NOT NULL, `dayEnded` datetime NOT NULL
     *
     */
    private int borrowedID;
    private int userID;
    private int titleID;
    private int status;
    private Date dayStarted;
    private Date dayEnded;

    public Borrowed(int borrowedID, int userID, int titleID, int status, Date dayStarted, Date dayEnded) {
        this.borrowedID = borrowedID;
        this.userID = userID;
        this.titleID = titleID;
        this.status = status;
        this.dayStarted = dayStarted;
        this.dayEnded = dayEnded;
    }
    
    public Borrowed(int userID, int titleID, int status, Date dayStarted, Date dayEnded){
        this.userID = userID;
        this.titleID = titleID;
        this.status = status;
        this.dayStarted = dayStarted;
        this.dayEnded = dayEnded;
    }
    
    public Borrowed(){
        
    }

    public int getBorrowedID() {
        return borrowedID;
    }

    public void setBorrowedID(int borrowedID) {
        this.borrowedID = borrowedID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTitleID() {
        return titleID;
    }

    public void setTitleID(int titleID) {
        this.titleID = titleID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDayStarted() {
        return dayStarted;
    }

    public void setDayStarted(Date dayStarted) {
        this.dayStarted = dayStarted;
    }

    public Date getDayEnded() {
        return dayEnded;
    }

    public void setDayEnded(Date dayEnded) {
        this.dayEnded = dayEnded;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.borrowedID;
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
        final Borrowed other = (Borrowed) obj;
        if (this.borrowedID != other.borrowedID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Borrowed{" + "borrowedID=" + borrowedID + ", userID=" + userID + ", titleID=" + titleID + ", status=" + status + ", dayStarted=" + dayStarted + ", dayEnded=" + dayEnded + '}';
    }

   
    
    
}
