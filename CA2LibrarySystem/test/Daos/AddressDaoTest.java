/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.Address;
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
public class AddressDaoTest {
    
    public AddressDaoTest() {
    }
    

    /**
     * Test of addAddress method, of class AddressDao.
     */
    @Test
    public void testAddAddress() {
        System.out.println("addAddress");
        int id = 0;
        String a1 = "";
        String a2 = "";  
        User user = null;
        Address address = new Address(id,user, a1, a2);
        AddressDao instance = new AddressDao();
        boolean expResult = false;
        boolean result = instance.addAddress(address);
        assertEquals(expResult, result);

    }
    
}
