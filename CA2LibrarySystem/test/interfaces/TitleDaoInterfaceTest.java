/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Dtos.Title;
import java.util.List;
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
public class TitleDaoInterfaceTest {
    
    public TitleDaoInterfaceTest() {
    }
    
    /**
     * Test of getAllTitles method, of class TitleDaoInterface.
     */
    @Test
    public void testGetAllTitles() {
        System.out.println("getAllTitles");
        
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        List<Title> expResult = null;
        List<Title> result = instance.getAllTitles();
        assertEquals(expResult, result);

    }

    /**
     * Test of addTitle method, of class TitleDaoInterface.
     */
    @Test
    public void testAddTitle() {
        System.out.println("addTitle");
        Title title = null;
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addTitle(title);
        assertEquals(expResult, result);

    }

    /**
     * Test of updateTitleDetail method, of class TitleDaoInterface.
     */
    @Test
    public void testUpdateTitleDetail() {
        System.out.println("updateTitleDetail");
        int titleID = 0;
        Title title = null;
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.updateTitleDetail(titleID, title);
        assertEquals(expResult, result);

    }

    /**
     * Test of removeTitleByID method, of class TitleDaoInterface.
     */
    @Test
    public void testRemoveTitleByID() {
        System.out.println("removeTitleByID");
        int titleID = 0;
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.removeTitleByID(titleID);
        assertEquals(expResult, result);

    }

    /**
     * Test of searchTitleByName method, of class TitleDaoInterface.
     */
    @Test
    public void testSearchTitleByName() {
        System.out.println("searchTitleByName");
        String name = "";
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        Title expResult = null;
        Title result = instance.searchTitleByName(name);
        assertEquals(expResult, result);

    }

    /**
     * Test of changeStock method, of class TitleDaoInterface.
     */
    @Test
    public void testChangeStock() {
        System.out.println("changeStock");
        int titleID = 0;
        int stock = 0;
        String options = "";
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.changeStock(titleID, stock, options);
        assertEquals(expResult, result);

    }

    /**
     * Test of searchByID method, of class TitleDaoInterface.
     */
    @Test
    public void testSearchByID() {
        System.out.println("searchByID");
        int id = 0;
        TitleDaoInterface instance = new TitleDaoInterfaceImpl();
        Title expResult = null;
        Title result = instance.searchByID(id);
        assertEquals(expResult, result);

    }

    public class TitleDaoInterfaceImpl implements TitleDaoInterface {

        public List<Title> getAllTitles() {
            return null;
        }

        public boolean addTitle(Title title) {
            return false;
        }

        public boolean updateTitleDetail(int titleID, Title title) {
            return false;
        }

        public boolean removeTitleByID(int titleID) {
            return false;
        }

        public Title searchTitleByName(String name) {
            return null;
        }

        public boolean changeStock(int titleID, int stock, String options) {
            return false;
        }

        public Title searchByID(int id) {
            return null;
        }
    }
    
}
