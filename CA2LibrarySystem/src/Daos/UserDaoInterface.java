/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.User;
import java.util.ArrayList;

/**
 *
 * @author d00182295
 */
interface UserDaoInterface {
    //check if user email and password exist;....
    public boolean Login(String email, String password);
    //allow user to register; ... 
    public boolean AddUser(User a);
}