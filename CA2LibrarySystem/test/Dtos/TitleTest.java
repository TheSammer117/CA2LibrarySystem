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
public class TitleTest {
    
    public TitleTest() {
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
     * Test of getTitleID method, of class Title.
     */
    @Test
    public void testGetTitleID() {
        System.out.println("getTitleID");
        Title instance = new Title();
        int expResult = 0;
        int result = instance.getTitleID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTitleID method, of class Title.
     */
    @Test
    public void testSetTitleID() {
        System.out.println("setTitleID");
        int titleID = 0;
        Title instance = new Title();
        instance.setTitleID(titleID);

    }

    /**
     * Test of getNovelName method, of class Title.
     */
    @Test
    public void testGetNovelName() {
        System.out.println("getNovelName");
        Title instance = new Title();
        String expResult = "";
        String result = instance.getNovelName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNovelName method, of class Title.
     */
    @Test
    public void testSetNovelName() {
        System.out.println("setNovelName");
        String novelName = "";
        Title instance = new Title();
        instance.setNovelName(novelName);

    }

    /**
     * Test of getAuthor method, of class Title.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Title instance = new Title();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAuthor method, of class Title.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        Title instance = new Title();
        instance.setAuthor(author);

    }

    /**
     * Test of getStock method, of class Title.
     */
    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Title instance = new Title();
        int expResult = 0;
        int result = instance.getStock();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStock method, of class Title.
     */
    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int stock = 0;
        Title instance = new Title();
        instance.setStock(stock);

    }

    /**
     * Test of getOnLoan method, of class Title.
     */
    @Test
    public void testGetOnLoan() {
        System.out.println("getOnLoan");
        Title instance = new Title();
        int expResult = 0;
        int result = instance.getOnLoan();
        assertEquals(expResult, result);

    }

    /**
     * Test of setOnLoan method, of class Title.
     */
    @Test
    public void testSetOnLoan() {
        System.out.println("setOnLoan");
        int onLoan = 0;
        Title instance = new Title();
        instance.setOnLoan(onLoan);

    }

    /**
     * Test of getTitleDescription method, of class Title.
     */
    @Test
    public void testGetTitleDescription() {
        System.out.println("getTitleDescription");
        Title instance = new Title();
        String expResult = "";
        String result = instance.getTitleDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTitleDescription method, of class Title.
     */
    @Test
    public void testSetTitleDescription() {
        System.out.println("setTitleDescription");
        String titleDescription = "";
        Title instance = new Title();
        instance.setTitleDescription(titleDescription);

    }

    /**
     * Test of toString method, of class Title.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Title instance = new Title();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of hashCode method, of class Title.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Title instance = new Title();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Title.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Title instance = new Title();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }
    
}
