/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

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
public class BorrowedDaoInterfaceTest {
    
    public BorrowedDaoInterfaceTest() {
    }
    

    /**
     * Test of addBorrowed method, of class BorrowedDaoInterface.
     */
    @Test
    public void testAddBorrowed() {
        System.out.println("addBorrowed");
        int borrowedID = 0;
        User user = null;
        Title title = null;
        int status = 0;
        Borrowed borrowed = new Borrowed(borrowedID, user, title, status);
        BorrowedDaoInterface instance = new BorrowedDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addBorrowed(borrowed);
        assertEquals(expResult, result);
    }

    /**
     * Test of getBorrowedByUserID method, of class BorrowedDaoInterface.
     */
    @Test
    public void testGetBorrowedByUserID() {
        System.out.println("getBorrowedByUserID");
        int userID = 0;
        BorrowedDaoInterface instance = new BorrowedDaoInterfaceImpl();
        ArrayList<Borrowed> expResult = null;
        ArrayList<Borrowed> result = instance.getBorrowedByUserID(userID);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateBorrowedStatus method, of class BorrowedDaoInterface.
     */
    @Test
    public void testUpdateBorrowedStatus() {
        System.out.println("updateBorrowedStatus");
        int BorrowedID = 0;
        int status = 0;
        BorrowedDaoInterface instance = new BorrowedDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.updateBorrowedStatus(BorrowedID, status);
        assertEquals(expResult, result);

    }

    /**
     * Test of getStatusByUserID method, of class BorrowedDaoInterface.
     */
    @Test
    public void testGetStatusByUserID() {
        System.out.println("getStatusByUserID");
        int userID = 0;
        BorrowedDaoInterface instance = new BorrowedDaoInterfaceImpl();
        ArrayList<Borrowed> expResult = null;
        ArrayList<Borrowed> result = instance.getStatusByUserID(userID);
        assertEquals(expResult, result);

    }

    /**
     * Test of getBorrowedByID method, of class BorrowedDaoInterface.
     */
    @Test
    public void testGetBorrowedByID() {
        System.out.println("getBorrowedByID");
        int borrowedID = 0;
        BorrowedDaoInterface instance = new BorrowedDaoInterfaceImpl();
        Borrowed expResult = null;
        Borrowed result = instance.getBorrowedByID(borrowedID);
        assertEquals(expResult, result);

    }

    public class BorrowedDaoInterfaceImpl implements BorrowedDaoInterface {

        public boolean addBorrowed(Borrowed borrowed) {
            return false;
        }

        public ArrayList<Borrowed> getBorrowedByUserID(int userID) {
            return null;
        }

        public boolean updateBorrowedStatus(int BorrowedID, int status) {
            return false;
        }

        public ArrayList<Borrowed> getStatusByUserID(int userID) {
            return null;
        }

        public Borrowed getBorrowedByID(int borrowedID) {
            return null;
        }
    }
    
}
