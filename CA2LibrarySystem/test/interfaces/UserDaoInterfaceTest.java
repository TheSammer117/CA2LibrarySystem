/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Dtos.User;
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
public class UserDaoInterfaceTest {
    
    public UserDaoInterfaceTest() {
    }
    

    /**
     * Test of Login method, of class UserDaoInterface.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String email = "";
        String password = "";
        UserDaoInterface instance = new UserDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.Login(email, password);
        assertEquals(expResult, result);

    }

    /**
     * Test of AddUser method, of class UserDaoInterface.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        User a = null;
        UserDaoInterface instance = new UserDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.AddUser(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of logOff method, of class UserDaoInterface.
     */
    @Test
    public void testLogOff() {
        System.out.println("logOff");
        int x = 0;
        UserDaoInterface instance = new UserDaoInterfaceImpl();
        String expResult = "";
        String result = instance.logOff(x);
        assertEquals(expResult, result);

    }

    /**
     * Test of disableUser method, of class UserDaoInterface.
     */
    @Test
    public void testDisableUser() {
        System.out.println("disableUser");
        int userID = 0;
        User a = null;
        UserDaoInterface instance = new UserDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.disableUser(userID, a);
        assertEquals(expResult, result);

    }

    /**
     * Test of findUserByID method, of class UserDaoInterface.
     */
    @Test
    public void testFindUserByID() {
        System.out.println("findUserByID");
        int userID = 0;
        UserDaoInterface instance = new UserDaoInterfaceImpl();
        User expResult = null;
        User result = instance.findUserByID(userID);
        assertEquals(expResult, result);

    }

    public class UserDaoInterfaceImpl implements UserDaoInterface {

        public boolean Login(String email, String password) {
            return false;
        }

        public boolean AddUser(User a) {
            return false;
        }

        public String logOff(int x) {
            return "";
        }

        public boolean disableUser(int userID, User a) {
            return false;
        }

        public User findUserByID(int userID) {
            return null;
        }
    }
    
}
