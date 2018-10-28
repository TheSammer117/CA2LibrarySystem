/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Dtos.Borrowed;
import java.util.ArrayList;

/**
 *
 * @author samiwise
 */
public interface BorrowedDaoInterface {
    public boolean addBorrowed (Borrowed borrowed);
    public ArrayList<Borrowed> getBorrowedByUserID(int userID);
    public boolean updateBorrowedStatus (int BorrowedID, int status);
    public ArrayList<Borrowed> getStatusByUserID(int userID);
    public Borrowed getBorrowedByID(int borrowedID);
    
}
