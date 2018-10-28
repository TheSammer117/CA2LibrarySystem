/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Daos.TitleDao;
import Daos.UserDao;
import Dtos.Borrowed;
import Dtos.Title;
import Dtos.User;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author samiwise
 */
public class App {
    public static void main(String[] args){
    System.out.println("Library System: ");

        Scanner input = new Scanner(System.in);
        UserDao userDao = new UserDao();
        TitleDao titleDao = new TitleDao();
        User user = null;
        Title title = null;

        int choice = -1;
        int userChoice = -1;
        int adminChoice = -1;
        int titleChoice = -1;
        //=======================================Main Menu==========================================
        //=======================================Main Menu==========================================
        while (choice != 0) {
            choice = homeMenu(input);

            switch (choice) {
                case 0:
                    System.out.println("Do you want to exit?(Y/N)");
                    String confirmation = input.nextLine();
                    if (confirmation.equalsIgnoreCase("y")) {
                        System.out.println("Thank you. Please close the applicaiton.");
                    } else if (confirmation.equalsIgnoreCase("n")) {
                        System.out.println("continuing program...");
                        choice = -1;
                    } else {
                        System.out.println("Error. Return to home menu...");
                        choice = -1;
                    }   break;
                case 1:
                    System.out.println("Display all information of each book stored in the library.");
                    List<Title> tList = titleDao.getAllTitles();
                    tList.forEach((t) -> {
                        System.out.println("Title ID: " + t.getTitleID()
                                + ", Title Name: " + t.getNovelName()
                                + ", Author: " + t.getAuthor()
                                + ", Description: " + t.getTitleDescription());
                    }); 
                    choice = -1;
                    break;
                case 2:
                    {
                        System.out.println("Log in ");
                        System.out.println("Enter your E-mail address:");
                        String email = input.nextLine();
                        System.out.println("Enter your password: ");
                        String password = input.nextLine();
                        boolean check = userDao.Login(email, password);
                        if (check == true) {
                            System.out.println("Log in successfully.");
                            choice = userMenu(input);
                        } else {
                            System.out.println("Sorry your email/password is incorrect.");
                            choice = -1;
                        }       
                        break;
                    }
                case 3:
                    {
                        System.out.println("Log in as Admin ");
                        System.out.println("Enter your E-mail address:");
                        String email = input.nextLine();
                        System.out.println("Enter your password: ");
                        String password = input.nextLine();
                        boolean check = userDao.Login(email, password);
                        if (check == true) {
                            System.out.println("Log in successfully.");
                            choice = adminMenu(input);
                        } else {
                            System.out.println("Sorry your email/password is incorrect.");
                            System.out.println("Return to home menu.");
                            choice = -1;
                        }       
                        break;
                    }
                case 4:
                    {
                        System.out.println("Sign up ");
                        System.out.println("Enter your E-mail address: ");
                        String email = input.nextLine();
                        System.out.println("Enter your password: ");
                        String password = input.nextLine();
                        System.out.println("Enter your First Name: ");
                        String fName = input.nextLine();
                        System.out.println("Enter your Last Name: ");
                        String lName = input.nextLine();

                        System.out.println("Are you admin?(Y/N)");
                        String ad = input.nextLine();
                        if (ad.equalsIgnoreCase("y")) {
                            int yes = 1;
                            //if the new member is an admin...
                            user = new User(email, password, fName, lName, yes, );
                            userDao.AddUser(user);
                            System.out.println("Admin Registered successfully.");
                            
                            adminChoice = adminMenu(input);
                            
                        } else if (ad.equalsIgnoreCase("n")) {
                            int no = 0;
                            //if the new member is not an admin...
                            user = new User(email, password, fName, lName, country, line1, line2, no, dCurrent);
                            userDao.AddUser(user);
                            System.out.println("User Registered successfully.");
                            
                            userChoice = userMenu(input);
                            
                        } else {
                            System.out.println("Error occured.");
                            System.out.println("Return to home menu.");
                            choice = -1;
                        }       
                        break;
                    }
                default:
                    break;
            }

            //=======================================User Menu==========================================
            //=======================================User Menu==========================================
            while (userChoice != 0) {
                switch (userChoice) {
                    case 0:
                        System.out.println("Do you want to exit?(Y/N)");
                        String confirmation = input.nextLine();
                        if (confirmation.equalsIgnoreCase("y")) {
                            System.out.println("Thank you. Please close the applicaiton.");
                        } else if (confirmation.equalsIgnoreCase("n")) {
                            System.out.println("continuing program...");
                            userChoice = -1;
                        } else {
                            System.out.println("Error. Return to home menu...");
                            userChoice = homeMenu(input);
                        }   
                        break;
                    case 1:
                        {
                            System.out.println("Display all Titles:");
                            List<Title> tList = titleDao.getAllTitles();
                            tList.forEach((t) -> {
                                System.out.println("Title ID: " + t.getTitleID()
                                        + ", Title Name: " + t.getNovelName()
                                        + ", Author: " + t.getAuthor()
                                        + ", Description: " + t.getTitleDescription());
                            });     
                            userChoice = -1;
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Search a title: ");
                            System.out.println("Please enter the name of a title: ");
                            String name = input.nextLine();
                            List<Title> tList = titleDao.getAllTitles();
                            if(name != null){
                                for(int i = 0; i <= tList.size(); i++){
                                    if(tList.get(i).getNovelName().equalsIgnoreCase(name)){
                                        System.out.println("Found matched Novel's Name: ");
                                        System.out.println("Title ID: " + tList.get(i).getTitleID()
                                                + ", Title Name: " + tList.get(i).getNovelName()
                                                + ", Author: " + tList.get(i).getAuthor()
                                                + ", Description: " + tList.get(i).getTitleDescription());
                                    }
                                }
                            }else{
                                System.out.println("Error occured.");
                            }       
                            userChoice = -1;
                            break;
                        }
                    case 3:
                        //borrow one title;
                        userChoice = -1;
                        break;
                    case 4:
                        //return a book;
                        userChoice = -1;
                        break;
                    case 5:
                        //view all current books which you've borrowed;
                        userChoice = -1;
                        break;
                    case 6:
                        //view all titles you borrowed
                        userChoice = -1;
                        break;
                    default:
                        System.out.println("Error occured.");
                        System.out.println("Return to user menu.");
                        userChoice = -1;
                        break;
                }
            }
            //=======================================User Menu==========================================
            //=======================================User Menu==========================================
            while(adminChoice != 0){
                switch (adminChoice) {
                    case 0:
                        System.out.println("Do you want to exit?(Y/N)");
                        String confirmation = input.nextLine();
                        if (confirmation.equalsIgnoreCase("y")) {
                            System.out.println("Thank you. Please close the applicaiton.");
                        } else if (confirmation.equalsIgnoreCase("n")) {
                            System.out.println("continuing program...");
                            adminChoice = -1;
                        } else {
                            System.out.println("Error. Return to home menu...");
                            adminChoice = homeMenu(input);
                        }
                        break;
                    case 1:
                        {
                            System.out.println("Display all Titles:");
                            List<Title> tList = titleDao.getAllTitles();
                            tList.forEach((t) -> {
                                System.out.println("Title ID: " + t.getTitleID()
                                        + ", Title Name: " + t.getNovelName()
                                        + ", Author: " + t.getAuthor()
                                        + ", Description: " + t.getTitleDescription());
                            });     
                            adminChoice = -1;
                            break;
                        }
                    case 2:
                        {
                            System.out.println("Search a title: ");
                            System.out.println("Please enter the name of a title: ");
                            String name = input.nextLine();
                            List<Title> tList = titleDao.getAllTitles();
                            if(name != null){
                                for(int i = 0; i <= tList.size(); i++){
                                    if(tList.get(i).getNovelName().equalsIgnoreCase(name)){
                                        System.out.println("Found matched Novel's Name: ");
                                        System.out.println("Title ID: " + tList.get(i).getTitleID()
                                                + ", Title Name: " + tList.get(i).getNovelName()
                                                + ", Author: " + tList.get(i).getAuthor()
                                                + ", Description: " + tList.get(i).getTitleDescription());
                                    }
                                }
                            }else{
                                System.out.println("Error occured.");
                            }       
                            adminChoice = -1;
                            break;
                        }
                    case 3:
                        {
                            System.out.println("Add a new title: ");
                            System.out.println("Enter the title's number:");
                            int id = input.nextInt();
                            System.out.println("Enter the title's name: ");
                            String name = input.nextLine();
                            System.out.println("Enter the title's author: ");
                            String author = input.nextLine();
                            System.out.println("Enter the stock of this title");
                            int stock = input.nextInt();
                            System.out.println("Enter the number of copies which on loan:");
                            int onLoan = input.nextInt();
                            System.out.println("Enter the description of this title: ");
                            String des = input.nextLine();
                            Title t = new Title(id, name, author, stock, onLoan, des);
                            boolean check = titleDao.addTitle(id, name, author, stock, onLoan, des);
                            if(check == true){
                                System.out.println("Title added successfully.");
                                t.toString();
                            }else{
                                System.out.println("Sorry, please try again.");
                            }           adminChoice = -1;
                            break;
                        }
                    case 4:
                        {
                            System.out.println("Update the details of a exited title;");
                            System.out.println("Please enter the ID of an exited title: ");
                            int titleID = input.nextInt();
                            List<Title> tList = titleDao.getAllTitles();
                            for(int i = 0; i<= tList.size(); i++){
                                if(tList.get(i).getTitleID() == titleID){
                                    System.out.println("Found title.");
                                    tList.get(i).toString();
                                    
                                    System.out.println("Please enter the details of this title: ");
                                    System.out.println("Enter the name of title: ");
                                    String name = input.nextLine();
                                    System.out.println("Enter the author of title: ");
                                    String author = input.nextLine();
                                    System.out.println("Enter the Description of title:");
                                    String des = input.nextLine();
                                    
                                    boolean check = titleDao.updateTitleDetail(titleID, name, author, des);
                                    if(check == true){
                                        System.out.println("Title updated successfully.");
                                        tList.get(i).toString();
                                    }else {
                                        System.out.println("Title isn't updated");
                                        tList.get(i).toString();
                                    }
                                }
                            }       adminChoice = -1;
                            break;
                        }
                    case 5:
                        {
                            System.out.println("Remove a exited title: ");
                            System.out.println("Please enter the ID of a title: ");
                            int id = input.nextInt();
                            boolean check = titleDao.removeTitleByID(id);
                            if(check == true){
                                System.out.println("Title is removed successfully.");
                            }else{
                                System.out.println("The title didn't remove.");
                            }       adminChoice = -1;
                            break;
                        }
                    case 6:
                        {
                            System.out.println("Change the stock of a exited title(decrease/increase)");
                            System.out.println("Enter the id of a title: ");
                            int id = input.nextInt();
                            if (id > 0 ){
                                List<Title> tList = titleDao.getAllTitles();
                                for(int i = 0; i<= tList.size(); i++){
                                    if(tList.get(id).getTitleID() == id){
                                        System.out.println("Please enter one of the options to change the stock(increase/decrease): ");
                                        String options = input.nextLine();
                                        System.out.println("Enter the number of copies you need: ");
                                        int number = input.nextInt();
                                        if(number > 0 && options != null){
                                            boolean check = titleDao.changeStock(id, number, options);
                                            if(check == true){
                                                System.out.println("The stock is changed." +
                                                        tList.get(id).toString());
                                            }
                                        }
                                    }
                                }
                                adminChoice =  -1;
                            }           adminChoice = -1;
                            break;
                        }
                    case 7:
                        System.out.println("Disable an user;");
                        //disable an exited user
                        adminChoice = -1;
                        break;
                    default:
                        System.out.println("Error occured.");
                        System.out.println("Return to admin menu.");
                        adminChoice = -1;
                        break;
                }
            }

        }

    }

    public static int homeMenu(Scanner sc) {
        int choice = -1;
        while (choice < 0 || choice > 4) {
            System.out.println("Home Menu");
            System.out.println("Please select one of the following options: ");
            System.out.println("0) Exit the application");
            System.out.println("1) View All Title");
            System.out.println("2) Login");
            System.out.println("3) Login as Admin");
            System.out.println("4) Sign up");
            choice = sc.nextInt();
        }
        sc.nextLine();
        return choice;
    }

    public static int adminMenu(Scanner sc) {
        int choice = -1;
        while (choice < 0 || choice > 6) {
            System.out.println("Admin Menu");
            System.out.println("Please select one of the following options: ");
            System.out.println("0) Log out;");
            System.out.println("1) View all titles;");
            System.out.println("2) Search a title;");
            System.out.println("3) Add a new title;");
            System.out.println("4) Update the details of a exited title;");
            System.out.println("5) remove a exited title;");
            System.out.println("6) Change the stock of a exited title(decrease/increase);");
            System.out.println("7) disable a user;");
            choice = sc.nextInt();
        }

        sc.nextLine();
        return choice;
    }

    public static int userMenu(Scanner sc) {
        int choice = -1;
        while (choice < 0 || choice > 3) {
            System.out.println("User Menu;");
            System.out.println("Please select one of the following options:");
            System.out.println("0) Log out;");
            System.out.println("1) View all titles;");
            System.out.println("2) Search a title;");
            System.out.println("3) Borrow a title;");
            System.out.println("4) Return a title;");
            System.out.println("5) View all titles which you've borrowed;");
            System.out.println("6) View all titles you borrowed;");
            choice = sc.nextInt();

        }
        sc.nextLine();
        return choice;
    }

    
      
}
