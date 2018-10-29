/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

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
public class AddressDaoInterfaceTest {
    
    public AddressDaoInterfaceTest() {
    }
    
    /**
     * Test of addAddress method, of class AddressDaoInterface.
     */
    @Test
    public void testAddAddress() {
        System.out.println("addAddress");
        int addressID = 0;
        User user = null;
        String address1 = "";
        String address2 = "";
        Address address = new Address(addressID,user,address1,address2);

        AddressDaoInterface instance = new AddressDaoInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addAddress(address);
        assertEquals(expResult, result);
        
    }

    public class AddressDaoInterfaceImpl implements AddressDaoInterface {

        public boolean addAddress(Address address) {
            return false;
        }
    }
    
    
}
