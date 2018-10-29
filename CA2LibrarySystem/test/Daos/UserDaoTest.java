/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.User;
import java.util.ArrayList;
import java.util.Date;
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
public class UserDaoTest {
    
    public UserDaoTest() {
    }
    

    /**
     * Test of Login method, of class UserDao.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String UserEmail = "tester@tester.com";
        String UserPassword = "123";
        UserDao instance = new UserDao();
        boolean expResult = true;
        boolean result = instance.Login(UserEmail, UserPassword);
        assertEquals(expResult, result);

    }

    /**
     * Test of AddUser method, of class UserDao.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        //`userID`, `email`, `password`, `firstName`, `lastName`, `isAdmin`, `dateJoined`, `active`
        int userID = 14;
        String email = "adminTester@tester.com";
        String password = "123";
        String firstName = "123";
        String lastName = "123";
        int isAdmin = 1;
        int active = 1;
        User a = new User(userID, email, password, firstName, lastName, isAdmin, active);
        UserDao instance = new UserDao();
        boolean expResult = true;
        boolean result = instance.AddUser(a);
        assertEquals(expResult, result);

    }

    /**
     * Test of logOff method, of class UserDao.
     */
    @Test
    public void testLogOff() {
        System.out.println("logOff");
        int x = 0;
        UserDao instance = new UserDao();
        String expResult = "LOGGIN OFF";
        String result = instance.logOff(x);
        assertEquals(expResult, result);

    }

    /**
     * Test of disableUser method, of class UserDao.
     */
    @Test
    public void testDisableUser() {
        System.out.println("disableUser");
        UserDao userDao = new UserDao();
        int userID = 8;
        User a = userDao.findUserByID(8);
        UserDao instance = new UserDao();
        boolean expResult = true;
        boolean result = instance.disableUser(userID, a);
        assertEquals(expResult, result);

    }

    /**
     * Test of findUserByID method, of class UserDao.
     * 
     */
    @Test
    public void testFindUserByID() {
        System.out.println("findUserByID");
        int userID = 8;
        UserDao instance = new UserDao();
        User expResult = null;
        User result = instance.findUserByID(userID);
        assertEquals(expResult, result);

    }
    
}
