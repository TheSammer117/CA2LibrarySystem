/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Team: Hernel, Sami, Haiyun
 * @author HaiyunYU
 */
public class UserTest {
    
    public UserTest() {
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
     * Test of getUserID method, of class User.
     */
    @Test
    public void testGetUserID() {
        System.out.println("getUserID");
        User instance = new User();
        int expResult = 0;
        int result = instance.getUserID();
        assertEquals(expResult, result);

    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = new User();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);

    }

    /**
     * Test of getFirstName method, of class User.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        User instance = new User();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLastName method, of class User.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        User instance = new User();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getIsAdmin method, of class User.
     */
    @Test
    public void testGetIsAdmin() {
        System.out.println("getIsAdmin");
        User instance = new User();
        int expResult = 0;
        int result = instance.getIsAdmin();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setUserID method, of class User.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        int userID = 0;
        User instance = new User();
        instance.setUserID(userID);
 
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        User instance = new User();
        instance.setEmail(email);

    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
 
    }

    /**
     * Test of setFirstName method, of class User.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        User instance = new User();
        instance.setFirstName(firstName);
    }

    /**
     * Test of setLastName method, of class User.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        User instance = new User();
        instance.setLastName(lastName);

    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        int isAdmin = 0;
        User instance = new User();
        instance.setIsAdmin(isAdmin);

    }

    /**
     * Test of hashCode method, of class User.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        User instance = new User();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class User.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getActive method, of class User.
     */
    @Test
    public void testGetActive() {
        System.out.println("getActive");
        User instance = new User();
        int expResult = 0;
        int result = instance.getActive();
        assertEquals(expResult, result);

    }

    /**
     * Test of setActive method, of class User.
     */
    @Test
    public void testSetActive() {
        System.out.println("setActive");
        int active = 0;
        User instance = new User();
        instance.setActive(active);

    }
    
}
