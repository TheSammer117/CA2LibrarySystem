/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    public boolean Login(String UserEmail, String UserPassword) {
         // Required for DB interaction
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;
        List<User> users = new ArrayList();
         try{
            con = getConnection();
            // Make query
            String query = "SELECT * FROM user WHERE email = ? AND password = ?";
            // Compile into SQL
            ps = con.prepareStatement(query);
            // (Fill in blanks of query)
            ps.setString(1, UserEmail);
            ps.setString(2, UserPassword);
            // Execute the SQL
            rs = ps.executeQuery();
            
            // check if user does exist inside database;......
            if(rs != null){
                check = true;
            }else{
                check = false;
            }
           
        }
        catch(SQLException ex){
            System.out.println("An exception occurred while querying "
                    + ex.getMessage());
            
        }
        // Shut down all open components
        finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(ps != null){
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(con != null){
                freeConnection(con);
            }
        }
        return check;
    }

    @Override
    public boolean AddUser(User a) {
          // Required for DB interaction
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            con = getConnection();
            // Make query
            String query = "INSERT INTO user(email,password,firstName,lastName,country,addressLine1,addressLine2,isAdmin) VALUES (?,?,?,?,?,?,?,?)";
            // Compile into SQL
            ps = con.prepareStatement(query);
            // (Fill in blanks of query)
            ps.setString(1, a.getEmail());
            ps.setString(2, a.getPassword());
            ps.setString(3, a.getFirstName());
            ps.setString(4, a.getLastName());
            ps.setString(5, a.getCountry());
            ps.setString(6, a.getAddressLine1());
            ps.setString(7, a.getAddressLine2());
            ps.setInt(8, a.getIsAdmin());
            // Execute the SQL
            rs = ps.executeQuery();
            
            // check if user does exist inside database;......
            if(rs != null){
                check = true;
            }else{
                check = false;
            }
           
        }
        catch(SQLException ex){
            System.out.println("An exception occurred while querying "
                    + ex.getMessage());
            
        }
        
        
        return check;
    }

    @Override
    public String logOff(int x) {
        String text = null;
        if(x == 0){
            text = "LOGGIN OFF";
        }
        
        return text;
    }
}


//    while(rs.next()){
//                int userID = rs.getInt("userID");
//                String email = rs.getString("email");
//                String password = rs.getString("password");
//                String firstName = rs.getString("firstName");
//                String lastName = rs.getString("lastName");
//                String country = rs.getString("country");
//                String addressLine1 = rs.getString("addressLine1");
//                String addressLine2 =rs.getString("addressLine2");
//                int isAdmin = rs.getInt("idAdmin");
//                Date dateJoined = rs.getDate("dateJoined");
//               
//                User use = new User(userID,email,password,firstName,lastName,country,addressLine1,addressLine2,isAdmin,dateJoined);    
//                users.add(use);
//            } 