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
 *Team: Hernel,Sami, Haiyun
 * @author HaiyunYu D00188956
 */
public class AddressTest {
    
    public AddressTest() {
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
     * Test of getAddressID method, of class Address.
     */
    @Test
    public void testGetAddressID() {
        System.out.println("getAddressID");
        Address instance = new Address();
        int expResult = 0;
        int result = instance.getAddressID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAddressID method, of class Address.
     */
    @Test
    public void testSetAddressID() {
        System.out.println("setAddressID");
        int addressID = 0;
        Address instance = new Address();
        instance.setAddressID(addressID);

    }

    /**
     * Test of getUser method, of class Address.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Address instance = new Address();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);

    }

    /**
     * Test of setUser method, of class Address.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Address instance = new Address();
        instance.setUser(user);

    }

    /**
     * Test of getAddress1 method, of class Address.
     */
    @Test
    public void testGetAddress1() {
        System.out.println("getAddress1");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getAddress1();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAddress1 method, of class Address.
     */
    @Test
    public void testSetAddress1() {
        System.out.println("setAddress1");
        String address1 = "";
        Address instance = new Address();
        instance.setAddress1(address1);

    }

    /**
     * Test of getAddress2 method, of class Address.
     */
    @Test
    public void testGetAddress2() {
        System.out.println("getAddress2");
        Address instance = new Address();
        String expResult = "";
        String result = instance.getAddress2();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAddress2 method, of class Address.
     */
    @Test
    public void testSetAddress2() {
        System.out.println("setAddress2");
        String address2 = "";
        Address instance = new Address();
        instance.setAddress2(address2);

    }

    /**
     * Test of hashCode method, of class Address.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Address instance = new Address();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Address.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Address instance = new Address();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
