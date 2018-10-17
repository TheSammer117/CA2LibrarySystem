/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samiwise
 */
public class UserDao extends mySqlDao implements UserDaoInterface{
    public UserDao(String databaseName) {
        super(databaseName);
    }

    @Override
    public ArrayList<User> Login(String email, String password) {
           Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<User> userList = new ArrayList();
        User A = null;
        try {
            //get connection...
            conn = getConnection();
            // Create query (String)
            String query = "SELECT * FROM user WHERE email = ? AND password = ?";
            // Compile query (PreparedStatement)
            ps = conn.prepareStatement(query);
            // (Fill in blanks of query)
            ps.setInt(1, customerNumber);
            ps.setInt(1, customerNumber);
            // Execute query (ResultSet)
            rs = ps.executeQuery();
            //...................................
             // Process results
            
            while(rs.next()){ 
                
                // Get components
                int customerNum = rs.getInt("customerNumber");
                String customerName = rs.getString("customerName");
                String contactLastName = rs.getString("contactLastName");
                String contactfirstName = rs.getString("contactfirstName");
                String phone = rs.getString("phone");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String city =rs.getString("city");
                String state = rs.getString("state");
                String postalCode = rs.getString("postalCode");
                String country = rs.getString("country");
                String salesRepEmployeeNumber = rs.getString("salesRepEmployeeNumber");
                double creditLimit = rs.getDouble("creditLimit");
                // Build object for this row
                 c = new Customer(customerNum,customerName,contactLastName,contactfirstName,phone,addressLine1,addressLine2,city,state,postalCode,country,salesRepEmployeeNumber,creditLimit);
                // Store object
                customer.add(c);
                
            }
            //.................................
        } catch (SQLException ex) {
            System.out.println("An exception occurred during the "
                    + "selectCustomersByName method\n" + ex.getMessage());
        }
        // Close open resources
        finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
           
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    
                }
            }
            freeConnection(conn);
        }
       
        // Return results
        return c;
    }

    @Override
    public boolean AddUser(User a) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<User> userList = new ArrayList();
    }
   
}
