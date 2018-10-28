/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import interfaces.UserDaoInterface;
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
 * @author Hernel
 */
public class UserDao extends DatabaseConnection implements UserDaoInterface {

 

// *******************************************************************************************************
    // *******************************************************************************************************
    // *******************************************************************************************************

    @Override
    public boolean Login(String UserEmail, String UserPassword) {
        // Required for DB interaction
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;
        List<User> users = new ArrayList();
        try {
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
            if (rs != null) {
                check = true;
            } else {
                check = false;
            }

        } catch (SQLException ex) {
            System.out.println("An exception occurred while querying "
                    + ex.getMessage());

        } // Shut down all open components
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                freeConnection(con);
            }
        }
        return check;
    }
// *******************************************************************************************************
    // *******************************************************************************************************
    // *******************************************************************************************************

    @Override
    public boolean AddUser(User a) {
        // Required for DB interaction
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            con = getConnection();
            // Make query
            String query = "INSERT INTO user VALUES (NULL,?,?,?,?,?,NULL,?)";
            // Compile into SQL
            ps = con.prepareStatement(query);
            // (Fill in blanks of query)
            ps.setString(1, a.getEmail());
            ps.setString(2, a.getPassword());
            ps.setString(3, a.getFirstName());
            ps.setString(4, a.getLastName());
            ps.setInt(5, a.getIsAdmin());
            ps.setInt(6, a.getActive());
            // Execute the SQL
            rs = ps.executeQuery();

            // check if user does exist inside database;......
            if (rs != null) {
                check = true;
            } else {
                check = false;
            }

        } catch (SQLException ex) {
            System.out.println("An exception occurred while querying "
                    + ex.getMessage());

        }

        return check;
    }

    @Override
    public String logOff(int x) {
        String text = null;
        if (x == 0) {
            text = "LOGGIN OFF";
        }

        return text;
    }
// *******************************************************************************************************
    // *******************************************************************************************************
    // *******************************************************************************************************

    @Override
    public boolean disableUser(int userID, User a) {
        // Required for DB interaction
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;
        List<User> users = new ArrayList();
        try {
            con = getConnection();
            // Make query
            String query = "UPDATE users SET active = 0 WHERE userID = ?";
            // Compile into SQL
            ps = con.prepareStatement(query);
            // (Fill in blanks of query)
            ps.setInt(1, userID);
            // Execute the SQL
            rs = ps.executeQuery();

            // check if user does exist inside database;......
            if (a.getIsAdmin() == 1) {
                if (rs != null) {
                    check = true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("An exception occurred while querying "
                    + ex.getMessage());

        } // Shut down all open components
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (con != null) {
                freeConnection(con);
            }
        }
        return check;
    }
   @Override
    public User findUserByID(int userID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;

        try {
            conn = getConnection();

            String query = "SELECT * FROM users WHERE userID = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();

            if (rs.next()) {
                u = new User(rs.getInt("userID"), rs.getString("email"), rs.getString("password"), rs.getString("firstName"), rs.getString("lastName"), rs.getInt("isAdmin"), rs.getInt("active"));
            }
        } catch (SQLException e) {
            System.out.println("Exception occured in the findUserByID() method: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    freeConnection(conn);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in the finally section of the findUserByID() method: " + e.getMessage());
            }
        }
        return u;
    }
// *******************************************************************************************************
    // *******************************************************************************************************
    // *******************************************************************************************************
}
