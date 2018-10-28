/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.Address;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import interfaces.AddressDaoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author samiwise
 */
public class AddressDao extends DatabaseConnection implements AddressDaoInterface {

    @Override
    public boolean addAddress(Address address) {
        Connection conn = null;
        PreparedStatement ps = null;
        int rs = 0;
        Boolean result = null;

        try {
            conn = getConnection();
            String query = "INSERT INTO address VALUES(NULL,?,?,?)";
            ps = conn.prepareStatement(query);
            int UserID = address.getUser().getUserID();
            String address1 = address.getAddress1();
            String address2 = address.getAddress2();

            ps.setInt(1, UserID);
            ps.setString(2, address1);
            ps.setString(3, address2);

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
                System.out.println("Exception occured in finally section in addAddress() method. " + e.getMessage());
            }
        }

        if (rs > 0) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
