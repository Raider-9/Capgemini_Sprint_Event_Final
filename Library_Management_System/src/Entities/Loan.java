package Entities;

//This import is required to import the Member class from the User_Entities package
import Entities.User_Entities.*;

public class Loan {
    Member member;
    Book book;
    String status;
    
    //Basic constrcutor 
    public Loan(Member member, Book book) {
        this.member = member;
        this.book = book;
        this.status = "active"; // By default, a new loan is active
    }

    //Basic logic for loan function 
    public void completeLoan() {
        if (book.isAvailable()) {
            book.setAvailable(false);
            status = "Returned";
            System.out.println("Loan completed for book: " + book.getTitle());
        } else {
            System.out.println("Book is not available for loan.");
        }
    }

    String getStatus() {
        return status;
    }

    String loanDetails() {
        return "Loan Details: \n" +
               "Member Details : " + member.getId() + "\n" +
               "Book Title: " + book.getTitle() + "\n" +
               "Status: " + status;
    }
    
}
