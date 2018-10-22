/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

//import java.time.LocalDateTime;

import java.sql.Date;



/**
 *
 * @author samiwise
 */
public class Borrowed {
    /**
     *CREATE TABLE `borrowed` (
  `borrowedID` int(10) NOT NULL,
  `userID` int(10) NOT NULL,
  `titleID` int(10) NOT NULL,
  `status` int(1) NOT NULL,
  `dayStarted` datetime NOT NULL,
  `dayEnded` datetime NOT NULL 
     *
     */
    private int borrowedID;
    private int userID;
    private int titleID;
    private int status;
    private Date dayStarted;
    private Date dayEnded;
}
