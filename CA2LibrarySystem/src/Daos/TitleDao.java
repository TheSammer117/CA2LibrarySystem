/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import interfaces.TitleDaoInterface;
import Dtos.Title;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Haiyun Yu D00188956
 *
 */
public class TitleDao extends DatabaseConnection implements TitleDaoInterface {

    /**
     * Initialise a TitleDao to access the specified database name
     *
     * @param databaseName The name of the MySQL database to be accessed (this
     * database should be running on localhost and listening on port 3306).
     */



    /**
     * Returns a list of Title objects based on information in the
     * database. All titles entries in the Title table are selected from the
     * database and stored as title objects in a List.
     *
     * @return The title list of all titles entries in the Title table. This
     * List may be empty where no books are present in the database.
     */
    @Override
    public List<Title> getAllTitles() {
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Title> titles = new ArrayList<>();

        try {
            con = getConnection();
            String query = "SELECT * FROM Titles";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                Title t = new Title(rs.getInt("titleID"),
                        rs.getString("novelName"),
                        rs.getString("author"),
                        rs.getInt("stock"),
                        rs.getInt("onLoan"),
                        rs.getString("titleDescription"));
                titles.add(t);
            }
        } catch (SQLException ex) {
            System.out.println("Exception occured in the getAllTitles() method, " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException ex) {
                System.out.println("Exception occured in the final section of the getAllTitles() method, " + ex.getMessage());
            }
        }
        return titles;
    }

    /**
     * Returns a new {@code Title} object which just adding into the database.
     * The method returns true if the result gets any feedback otherwise.
     *
     * @param titleID, the id of a new title
     * @param novelName the name of a new title
     * @param author the author of the book
     * @param stock the amount of title stored in the library
     * @param onLoan the loaning copies of a title
     * @param titleDescription describe the information of a title
     * @return the title with its all information
     */

    @Override
    public boolean addTitle(int titleID, String novelName, String author, int stock, int onLoan, String titleDescription) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        int rowsAffected = 0;
        try {
            con = getConnection();
            String query = "INSERT INTO Title "
                    + "(titleID, novelName, author, stock, onLoan, titleDescription)"
                    + "values ( ?, ?, ?, ?, ?, ?) ";
            ps = con.prepareStatement(query);
            ps.setInt(1, titleID);
            ps.setString(2, novelName);
            ps.setString(3, author);
            ps.setInt(4, stock);
            ps.setInt(5, onLoan);
            ps.setString(6, titleDescription);
            rowsAffected = ps.executeUpdate();

            if (rowsAffected == 1) {
                result = true;
            }
        } catch (SQLException e) {
            System.out.println("Exception occured in the final section of the addTitle() method, " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException ex) {
                System.out.println("Exception occured in the final section of the addTitle() method, " + ex.getMessage());
            }
        }

        return result;
    }

    /**
     *
     * Updates a exited Title in the database matching the specified titleID,
     * The method should return true if it updates the values to the table.
     *
     * @param titleID The ID of title to find the specified row from database
     * @param novelName The name to which this title should be changed.
     * @param author the author of the matching title should be changed.
     * @param titleDescription the description of the matching title should be
     * changed.
     * @return return true/false if the title entire changed in the Titles
     * table.
     */
    @Override
    public boolean updateTitleDetail(int titleID, String novelName, String author, String titleDescription) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        int rowsAffected = 0;

        con = getConnection();
        String query = "UPDATE Title SET novelName = ?, author = ?,  titleDescription = ? WHERE titleID = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, novelName);
            ps.setString(2, author);
            ps.setString(3, titleDescription);
            ps.setInt(4, titleID);
            rowsAffected = ps.executeUpdate();

            if (rowsAffected == 1) {
                result = true;
            }

        } catch (SQLException e) {
            System.out.println("Exception occured in the updateTitleDetail() method: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in the final section of the updateTitleDetail() method");
                e.getMessage();
            }
        }

        return result;
    }
    /**
     *
     * Remove a exited Title in the database matching the specified titleID,
     * The method should return true if a title deleted.
     *
     * @param titleID The ID of title to find the specified row from database
     * 
     * @return return true/false if the title deletes successfully.
     */
    @Override
    public boolean removeTitleByID(int titleID) {
        Connection con = null;
        PreparedStatement ps = null;
        boolean result = false;
        int rowsAffected = 0;

        con = getConnection();
        String query = "DELETE FROM Title WHERE titleID = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, titleID);
            rowsAffected = ps.executeUpdate();
            if (rowsAffected == 1) {
                result = true;
            }
        } catch (SQLException e) {
            System.out.println("Exception occured in the removeTtileByID() method: " + e.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in the finally section of the removeTtileByID() method");
                e.getMessage();
            }
        }

        return result;
    }
    /**
     *
     * Get the specified title by matching the name of the title.
     * The method should return the entire title which contains the specified novel's name.
     *
     * @param novelName
     * @return return the information of a title by specified novel's name; 
     * table.
     */
    @Override
    public Title searchTitleByName(String novelName) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Title title = null;

        con = getConnection();

        String query = "SELECT * FROM Title WHERE novelName Like '%?%' ";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, novelName);
            rs = ps.executeQuery();
            if (rs.next()) {
                title = new Title(rs.getInt("titleID"), rs.getString("novelName"), rs.getString("author"), rs.getInt("stock"), rs.getInt("onLoan"), rs.getString("titleDescription"));
            }
        } catch (SQLException e) {
            System.out.println("Exception occured in the searchTitleByName() method: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in the finally section of the searchTitleByName() method: " + e.getMessage());
            }
        }

        return title;
    }
    /**
     *increase/decrease the stock by a chosen option.
     * The method should return true if the result 
     *
     * @param titleID The ID of title to find the specified row from database
     * @param stock The current stock of a title via specified id.
     * @param options the string variables to record whether user increase/decrease the stock of a title.
     * @return return true/false if the result contains any values otherwise.
     */
    @Override
    public boolean changeStock(int titleID, int stock, String options) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            con = getConnection();

            if (options.equalsIgnoreCase("increase")) {
                String query1 = "update title set stock = stock + ? where titleID = ? ";
                ps = con.prepareStatement(query1);
                ps.setInt(1, stock);
                ps.setInt(2, titleID);
                rs = ps.executeQuery();
                if (rs != null) 
                {
                    check = true;
                }
                check = true;

            } else if (options.equalsIgnoreCase("decrease")) {
                String query2 = "update title set stock = stock - ? where titleID = ? ";
                ps = con.prepareStatement(query2);
                ps.setInt(1, stock);
                ps.setInt(2, titleID);
                rs = ps.executeQuery();
                if (rs != null) 
                {
                    check = true;
                }
                check = true;

            }

        } catch (SQLException e) {
            System.out.println("Exception occured in the changeStock() method: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    freeConnection(con);
                }
            } catch (SQLException e) {
                System.out.println("Exception occured in the finally section of the changeStock() method: " + e.getMessage());
            }
        }
        return check;
    }

    @Override 
    public Title searchByID(int id){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Title t = null;
        
        try{
            conn = getConnection();
            
            String query = "SELECT * FROM titles WHERE titleID = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                t = new Title(rs.getInt("titleID"), rs.getString("novelName"), rs.getString("author"), rs.getInt("stock"), rs.getInt("onLoan"), rs.getString("titleDescription"));
            }
        } catch(SQLException e){
            System.out.println("Exception occured in the searchByID() method " + e.getMessage());
        } finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(conn != null){
                    freeConnection(conn);
                }
            } catch(SQLException e){
                System.out.println("Exception occured in finally section of searchByID() method " + e.getMessage());
            }
        }
        return t;
    }
}
