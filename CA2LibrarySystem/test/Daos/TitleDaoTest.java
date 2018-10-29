/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.Title;
import java.util.List;
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
public class TitleDaoTest {
    
    public TitleDaoTest() {
    }
    
    /**
     * Test of getAllTitles method, of class TitleDao.
     */
    @Test
    public void testGetAllTitles() {
        System.out.println("getAllTitles");
        TitleDao instance = new TitleDao();
        List<Title> expResult = null;
        List<Title> result = instance.getAllTitles();
        assertEquals(expResult, result);

    }

    /**
     * Test of addTitle method, of class TitleDao.
     */
    @Test
    public void testAddTitle() {
        System.out.println("addTitle");
        int id =  9;
        String name = "testaddbook";
        String author = "123";
        String des = "123";
        int stock = 0;
        int onLoan = 0;        
        Title title = new Title(id, name, author, stock ,onLoan, des);
        TitleDao instance = new TitleDao();
        boolean expResult = true;
        boolean result = instance.addTitle(title);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateTitleDetail method, of class TitleDao.
     */
    @Test
    public void testUpdateTitleDetail() {
        System.out.println("updateTitleDetail");
        int titleID = 1;
        Title title = new Title();
        TitleDao instance = new TitleDao();
        boolean expResult = false;
        boolean result = instance.updateTitleDetail(titleID, title);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeTitleByID method, of class TitleDao.
     */
    @Test
    public void testRemoveTitleByID() {
        System.out.println("removeTitleByID");
        int titleID = 1;
        TitleDao instance = new TitleDao();
        boolean expResult = true;
        boolean result = instance.removeTitleByID(titleID);
        assertEquals(expResult, result);

    }

    /**
     * Test of searchTitleByName method, of class TitleDao.
     */
    @Test
    public void testSearchTitleByName() {
        System.out.println("searchTitleByName");
        String novelName = "All the King's Men";
        TitleDao instance = new TitleDao();
        Title expResult = instance.getAllTitles().get(0);
        Title result = instance.searchTitleByName(novelName);
        assertEquals(expResult, result);

    }

    /**
     * Test of changeStock method, of class TitleDao.
     */
    @Test
    public void testChangeStock1() {
        System.out.println("changeStockByIncrease");
        int titleID = 1;
        int stock = 1;
        String options = "increase";
        TitleDao instance = new TitleDao();
        boolean expResult = true;
        boolean result = instance.changeStock(titleID, stock, options);
        assertEquals(expResult, result);

    }
        /**
     * Test of changeStock method, of class TitleDao.
     */
    @Test
    public void testChangeStock2() {
        System.out.println("changeStockByDecrease");
        int titleID = 1;
        int stock = 1;
        String options = "decrease";
        TitleDao instance = new TitleDao();
        boolean expResult = true;
        boolean result = instance.changeStock(titleID, stock, options);
        assertEquals(expResult, result);

    }

    /**
     * Test of searchByID method, of class TitleDao.
     */
    @Test
    public void testSearchByID() {
        System.out.println("searchByID");
        int id = 1;
        TitleDao instance = new TitleDao();
        Title expResult = null;            
        Title result = instance.searchByID(id);
        assertEquals(expResult, result);

    }
    
}
