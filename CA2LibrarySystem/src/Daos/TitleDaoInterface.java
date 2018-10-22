/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daos;

import Dtos.Title;
import java.util.List;

/**
 *
 * @author omy
 */
public interface TitleDaoInterface {
    public List<Title> getAllTitles();
    public boolean addTitle(int titleID, String novelName, String author, int stock, int onLoan, String titleDescription);
    public String updateTitleDetail( String novelName, String author, int stock, int onLoan, String titleDescription);
    public boolean removeTitleByID(int id);
    public String searchTitleByName(String name);
    
    
}
