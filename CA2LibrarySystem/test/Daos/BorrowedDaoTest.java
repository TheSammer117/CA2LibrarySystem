/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.Borrowed;
import Dtos.Title;
import Dtos.User;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Team: Hernel,Sami, Haiyun
 * @author HaiyunYu D00188956
 */
public class BorrowedDaoTest {
    
    public BorrowedDaoTest() {
    }
    

    /**
     * Test of addBorrowed method, of class BorrowedDao.
     */
    @Test
    public void testAddBorrowed() {
        //int borrowedID, User user, Title title, int status
        System.out.println("addBorrowed");
        int id = 0;
        Title title = null;
        User user = null;
        int status = 0;
        Borrowed borrowed = new Borrowed(id, user, title, status);
        BorrowedDao instance = new BorrowedDao();
        boolean expResult = false;
        boolean result = instance.addBorrowed(borrowed);
        assertEquals(expResult, result);

    }

    /**
     * Test of getBorrowedByUserID method, of class BorrowedDao.
     */
    @Test
    public void testGetBorrowedByUserID() {
        System.out.println("getBorrowedByUserID");
        int userID = 0;
        BorrowedDao instance = new BorrowedDao();
        ArrayList<Borrowed> expResult = null;
        ArrayList<Borrowed> result = instance.getBorrowedByUserID(userID);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateBorrowedStatus method, of class BorrowedDao.
     */
    @Test
    public void testUpdateBorrowedStatus() {
        System.out.println("updateBorrowedStatus");
        int BorrowedID = 11;
        int status = 0;
        BorrowedDao instance = new BorrowedDao();
        boolean expResult = true;
        boolean result = instance.updateBorrowedStatus(BorrowedID, status);
        assertEquals(expResult, result);

    }

    /**
     * Test of getStatusByUserID method, of class BorrowedDao.
     */
    @Test
    public void testGetStatusByUserID() {
        System.out.println("getStatusByUserID");
        int userID = 11;
        BorrowedDao instance = new BorrowedDao();
        ArrayList<Borrowed> expResult = null;
        ArrayList<Borrowed> result = instance.getStatusByUserID(userID);
        assertEquals(expResult, result);

    }

    /**
     * Test of getBorrowedByID method, of class BorrowedDao.
     */
    @Test
    public void testGetBorrowedByID() {
        System.out.println("getBorrowedByID");
        int borrowedID = 11;
        BorrowedDao instance = new BorrowedDao();
        Borrowed expResult = null;
        Borrowed result = instance.getBorrowedByID(borrowedID);
        assertEquals(expResult, result);

    }
    
}
