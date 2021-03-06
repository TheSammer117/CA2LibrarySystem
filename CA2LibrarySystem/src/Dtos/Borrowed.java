/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

//import java.time.LocalDateTime;
import java.sql.Date;
import java.util.Calendar;

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
    private User user;
    private Title title;
    private int status;
    private Date dayStarted;
    private Date dueDate;
    private Date dayEnded;

    public Borrowed(int borrowedID, User user, Title title, int status) {
        this.borrowedID = borrowedID;
        this.user = user;
        this.title = title;
        this.status = status;
        //this.dayStarted = dayStarted;
        this.dueDate = addHoursToDate(this.dayStarted, 72);
        //this.dayEnded = dayEnded;
    }
    
    public Borrowed(User user, Title title, int status){
        this.user = user;
        this.title = title;
        this.status = status;
       //this.dayStarted = dayStarted;
        this.dueDate = addHoursToDate(this.dayStarted, 72);
        //this.dayEnded = dayEnded;
    }

    public Date getDueDate() {
        return dueDate;
    }
    
    public Borrowed(){
        
    }

    private Date addHoursToDate(Date date, int hours){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return (Date) calendar.getTime();
    }
    public int getBorrowedID() {
        return borrowedID;
    }

    public void setBorrowedID(int borrowedID) {
        this.borrowedID = borrowedID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public Title getTitle(){
        return this.title;
    }
    
    public void setTitle(Title title){
        this.title = title;
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
        return "Borrowed{" + "borrowedID=" + borrowedID + ", user=" + user + ", title=" + title + ", status=" + status + ", dayStarted=" + dayStarted + ", dayEnded=" + dayEnded + '}';
    }

   
    
    
}
