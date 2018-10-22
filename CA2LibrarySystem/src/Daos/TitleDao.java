/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.Title;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omy
 */
public class TitleDao extends DatabaseConnection implements TitleDaoInterface {
    
    public TitleDao(String databaseName) {
        super(databaseName);
    }

    @Override
    public List<Title> getAllTitles() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Title> titles = new ArrayList<>();
        
        try{
            con = getConnection();
            String query = "SELECT * FROM Titles";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
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
            try{
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(con != null){
                    freeConnection(con);
                }
            } catch (SQLException ex){
                System.out.println("Exception occured in the finally section of the getAllTitles() method, " + ex.getMessage());
            }
        }
        return titles;
    }

    @Override
    public boolean addTitle(int titleID, String novelName, String author, int stock, int onLoan, String titleDescription) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Title titles = null;
        boolean check = false;
        
        try{
            con = getConnection();
            String query = "INSERT ";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                titles = new Title(rs.getInt("titleID"), 
                        rs.getString("novelName"), 
                        rs.getString("author"), 
                        rs.getInt("stock"), 
                        rs.getInt("onLoan"), 
                        rs.getString("titleDescription"));
                
            }
        } catch (SQLException ex) {
            System.out.println("Exception occured in the getAllTitles() method, " + ex.getMessage());
        } finally {
            try{
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }
                if(con != null){
                    freeConnection(con);
                }
            } catch (SQLException ex){
                System.out.println("Exception occured in the finally section of the getAllTitles() method, " + ex.getMessage());
            }
        }
        return check;
    }

    @Override
    public String updateTitleDetail(String novelName, String author, int stock, int onLoan, String titleDescription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeTitleByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchTitleByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
