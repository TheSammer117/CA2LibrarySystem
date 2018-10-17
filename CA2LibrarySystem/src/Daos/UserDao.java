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
    public boolean Login(String email, String password) {
        // Required for DB interaction
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        return false;
    }

    @Override
    public boolean AddUser(User a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
