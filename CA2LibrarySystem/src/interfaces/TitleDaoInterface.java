/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Dtos.Title;
import java.util.List;

/**
 *Team : Hernel, Sami, Haiyun
 * 
 * @author HaiyunYu D00188956
 */
public interface TitleDaoInterface {
    //viewing the details of all books in the library;
    public List<Title> getAllTitles();
    //adding a new book in the library;
    public boolean addTitle(Title title);
    //update the details of a exited title in the library;
    public boolean updateTitleDetail(int titleID, Title title);
    //removing a title by its id;
    public boolean removeTitleByID(int titleID);
    //search a title by the title's name;
    public Title searchTitleByName(String name);
    //decrease/increase the stock of titles
    public boolean changeStock(int titleID, int stock, String options);
    
    public Title searchByID(int id);
    
}
