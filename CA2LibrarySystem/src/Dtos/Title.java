/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

import java.util.Objects;

/**
 *Team : Hernel, Sami, Haiyun
 * 
 * @author HaiyunYu D00188956
 * 
 */
public class Title {
    /**
     `titleID` int(10) NOT NULL,
  `novelName` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `stock` int(5) NOT NULL,
  `onLoan` int(5) NOT NULL,
  `titleDescription` varchar(5000) NOT NULL
     **/
     
    private int titleID;
    private String novelName;
    private String author;
    private int stock;
    private int onLoan;
    private String titleDescription;

    public Title() {
    }

    public Title(int titleID, String novelName, String author, int stock, int onLoan, String titleDescription) {
        this.titleID = titleID;
        this.novelName = novelName;
        this.author = author;
        this.stock = stock;
        this.onLoan = onLoan;
        this.titleDescription = titleDescription;
    }

    public int getTitleID() {
        return titleID;
    }

    public void setTitleID(int titleID) {
        this.titleID = titleID;
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getOnLoan() {
        return onLoan;
    }

    public void setOnLoan(int onLoan) {
        this.onLoan = onLoan;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    @Override
    public String toString() {
        return "Titles{" + "titleID=" + titleID + ", novelName=" + novelName + ", author=" + author + ", stock=" + stock + ", onLoan=" + onLoan + ", titleDescription=" + titleDescription + '}';
    }

    @Override
    public int hashCode() {
        return ((Integer)this.getTitleID()).hashCode()
                + this.getNovelName().hashCode()
                + this.getAuthor().hashCode()
                + ((Integer)this.getStock()).hashCode()
                + ((Integer)this.getOnLoan()).hashCode()
                + this.getTitleDescription().hashCode();
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
        final Title other = (Title) obj;
        
        return this.getTitleID() == other.getTitleID()
                && this.getAuthor().equalsIgnoreCase(other.getAuthor())
                && this.getNovelName().equalsIgnoreCase(other.getNovelName())
                && this.getStock() == other.getStock()
                && this.getOnLoan() == other.getOnLoan()
                && this.getTitleDescription().equalsIgnoreCase(other.getTitleDescription());
    }
    
    
    
}
