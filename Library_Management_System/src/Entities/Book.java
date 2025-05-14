package Entities;

//This is a safety import , not required 
//import Entities.User_Entities.*;

public class Book {
    String title; 
    String author;
    boolean isAvailable;
    public String getTitle() {
        return title;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // By default, a new book is available
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
