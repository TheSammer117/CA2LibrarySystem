/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import java.sql.Connection;
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
public class DatabaseConnectionTest {
    
    public DatabaseConnectionTest() {
    }
    
    /**
     * Test of getConnection method, of class DatabaseConnection.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DatabaseConnection instance = new DatabaseConnection();
        Connection expResult = null;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);

    }

    /**
     * Test of freeConnection method, of class DatabaseConnection.
     */
    @Test
    public void testFreeConnection() {
        System.out.println("freeConnection");
        Connection con = null;
        DatabaseConnection instance = new DatabaseConnection();
        instance.freeConnection(con);

    }
    
}
