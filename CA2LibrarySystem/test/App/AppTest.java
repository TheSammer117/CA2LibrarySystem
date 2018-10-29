/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.Scanner;
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
public class AppTest {
    
    public AppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of homeMenu method, of class App.
     */
    @Test
    public void testHomeMenu() {
        System.out.println("homeMenu");
        Scanner sc = null;
        int expResult = 0;
        int result = App.homeMenu(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adminMenu method, of class App.
     */
    @Test
    public void testAdminMenu() {
        System.out.println("adminMenu");
        Scanner sc = null;
        int expResult = 0;
        int result = App.adminMenu(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userMenu method, of class App.
     */
    @Test
    public void testUserMenu() {
        System.out.println("userMenu");
        Scanner sc = null;
        int expResult = 0;
        int result = App.userMenu(sc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
