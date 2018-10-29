/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

import java.sql.Date;
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
public class BorrowedTest {
    
    public BorrowedTest() {
    }
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getDueDate method, of class Borrowed.
     */
    @Test
    public void testGetDueDate() {
        System.out.println("getDueDate");
        Borrowed instance = new Borrowed();
        Date expResult = null;
        Date result = instance.getDueDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBorrowedID method, of class Borrowed.
     */
    @Test
    public void testGetBorrowedID() {
        System.out.println("getBorrowedID");
        Borrowed instance = new Borrowed();
        int expResult = 0;
        int result = instance.getBorrowedID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setBorrowedID method, of class Borrowed.
     */
    @Test
    public void testSetBorrowedID() {
        System.out.println("setBorrowedID");
        int borrowedID = 0;
        Borrowed instance = new Borrowed();
        instance.setBorrowedID(borrowedID);

    }

    /**
     * Test of getUser method, of class Borrowed.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Borrowed instance = new Borrowed();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);

    }

    /**
     * Test of setUser method, of class Borrowed.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Borrowed instance = new Borrowed();
        instance.setUser(user);

    }

    /**
     * Test of getTitle method, of class Borrowed.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Borrowed instance = new Borrowed();
        Title expResult = null;
        Title result = instance.getTitle();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTitle method, of class Borrowed.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        Title title = null;
        Borrowed instance = new Borrowed();
        instance.setTitle(title);

    }

    /**
     * Test of getStatus method, of class Borrowed.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Borrowed instance = new Borrowed();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStatus method, of class Borrowed.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Borrowed instance = new Borrowed();
        instance.setStatus(status);

    }

    /**
     * Test of getDayStarted method, of class Borrowed.
     */
    @Test
    public void testGetDayStarted() {
        System.out.println("getDayStarted");
        Borrowed instance = new Borrowed();
        Date expResult = null;
        Date result = instance.getDayStarted();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDayStarted method, of class Borrowed.
     */
    @Test
    public void testSetDayStarted() {
        System.out.println("setDayStarted");
        Date dayStarted = null;
        Borrowed instance = new Borrowed();
        instance.setDayStarted(dayStarted);

    }

    /**
     * Test of getDayEnded method, of class Borrowed.
     */
    @Test
    public void testGetDayEnded() {
        System.out.println("getDayEnded");
        Borrowed instance = new Borrowed();
        Date expResult = null;
        Date result = instance.getDayEnded();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDayEnded method, of class Borrowed.
     */
    @Test
    public void testSetDayEnded() {
        System.out.println("setDayEnded");
        Date dayEnded = null;
        Borrowed instance = new Borrowed();
        instance.setDayEnded(dayEnded);

    }

    /**
     * Test of hashCode method, of class Borrowed.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Borrowed instance = new Borrowed();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Borrowed.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Borrowed instance = new Borrowed();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Borrowed.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Borrowed instance = new Borrowed();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
