/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import interfaces.BorrowedDaoInterface;
import Dtos.Borrowed;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author samiwise
 */
public class BorrowedDao extends DatabaseConnection implements BorrowedDaoInterface {

    @Override
    public boolean addBorrowed(Borrowed borrowed) {
        Connection conn = null;
        PreparedStatement ps = null;
        int rs = 0;
        Boolean result = null;

        try {
            conn = getConnection();
            String query = "INSERT INTO borrowed VALUES(NULL,?,?,?,NULL,NULL,NULL)";
            ps = conn.prepareStatement(query);
            int userID = borrowed.getUser().getUserID();
            int titleID = borrowed.getTitle().getTitleID();
            int status = borrowed.getStatus();

            ps.setInt(1, userID);
            ps.setInt(2, titleID);
            ps.setInt(3, status);

            rs = ps.executeUpdate();
        } catch (MySQLIntegrityConstraintViolationException e) {
            System.out.println("Constraint Exception occured: " + e.getMessage());
            rs = -1;
        } catch (SQLException se) {
            System.out.println("SQL Exception occurred: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    freeConnection(conn);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in finally section in addBorrowed() method. " + e.getMessage());
            }
        }

        if (rs > 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    @Override
    public ArrayList<Borrowed> getBorrowedByUserID(int userID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Borrowed borrowed = null;
        UserDao ud = new UserDao();
        TitleDao td = new TitleDao();
        ArrayList<Borrowed> borrowList = new ArrayList();

        try {
            conn = getConnection();
            String query = "SELECT * FROM borrowed WHERE userID = ?";
            ps = conn.prepareStatement(query);

            ps.setInt(1, userID);
            rs = ps.executeQuery();

            while (rs.next()) {
                borrowed = new Borrowed();
                borrowed.setBorrowedID(rs.getInt("BorrowedID"));
                borrowed.setUser(ud.findUserByID(rs.getInt("userID")));
                borrowed.setTitle(td.searchByID(rs.getInt("titleID")));
                borrowed.setStatus(rs.getInt("status"));
                borrowList.add(borrowed);
            }
        } catch (SQLException e) {
            System.out.println("Exception occured in the getBorrowedByUserID() method " + e.getMessage());
            e.printStackTrace();
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
                System.out.println("Exception occured in the finally section in the getBorrowedByUserID() method");
            }
        }
        return borrowList;
    }

    @Override
    public boolean updateBorrowedStatus(int BorrowedID, int status) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Borrowed borrowed = null;

        try {
            conn = getConnection();
            String query = "UPDATE borrowed SET status = ? WHERE borrowedID = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, status);
            ps.setInt(2, BorrowedID);
            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Status has been updated!");
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Exception occured in the updateStatus() method: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    freeConnection(conn);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in finally section of updateBorrowedStatus() " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public ArrayList<Borrowed> getStatusByUserID(int userID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Borrowed borrowed = null;
        UserDao ud = new UserDao();
        TitleDao td = new TitleDao();
        ArrayList<Borrowed> borrowList = new ArrayList();

        try {
            conn = getConnection();
            String query = "SELECT * FROM borrowed WHERE userID = ? AND status = 0";
            ps = conn.prepareStatement(query);

            ps.setInt(1, userID);
            rs = ps.executeQuery();

            while (rs.next()) {
                borrowed = new Borrowed();
                // Get the pieces of a customer from the resultset
                borrowed.setBorrowedID(rs.getInt("BorrowedID"));
                borrowed.setUser(ud.findUserByID(rs.getInt("userID")));
                borrowed.setTitle(td.searchByID(rs.getInt("titleID")));
                borrowed.setStatus(rs.getInt("status"));
                borrowList.add(borrowed);

            }

        } catch (SQLException e) {
            System.out.println("Exception occured in the getStatusByUserID() method");
            e.printStackTrace();
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
                System.out.println("Exception occured in the finally section in the getStatusByUserID() method " + e.getMessage());
            }
        }

        return borrowList;
    }

    @Override
    public Borrowed getBorrowedByID(int borrowedID) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Borrowed borrowed = null;
        UserDao ud = new UserDao();
        TitleDao td = new TitleDao();

        try {
            conn = getConnection();
            String query = "SELECT * FROM borrowed WHERE borrowedID = ?";
            ps = conn.prepareStatement(query);

            ps.setInt(1, borrowedID);
            rs = ps.executeQuery();

            while (rs.next()) {
                borrowed = new Borrowed();
                // Get the pieces of a customer from the resultset
                borrowed.setBorrowedID(rs.getInt("BorrowedID"));
                borrowed.setUser(ud.findUserByID(rs.getInt("userID")));
                borrowed.setTitle(td.searchByID(rs.getInt("titleID")));
                borrowed.setStatus(rs.getInt("status"));
            }

        } catch (SQLException e) {
            System.out.println("Exception occured in the getBorrowedByID() method");
            e.printStackTrace();
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
                System.out.println("Exception occured in the finally section in the getBorrowedByID() method");
            }
        }

        return borrowed;

    }
}
