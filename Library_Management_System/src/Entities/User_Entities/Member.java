package Entities.User_Entities;
public class Member extends User{
    //This class represents a member in the library 

    //Constructor of the Member class
    public Member(String id, String name) {
        super(id, name);
    }
    
    //Overriding the abstract method showProfile from the User class
    @Override
    void showProfile() {
        System.out.println("-------------------------");
        System.out.println("Member ID: " + id);
        System.out.println("Member Name: " + name);
        System.out.println("-------------------------");
    }

    //It is required in the Loan class to return the String as said in the format of the pdf
    public String getId(){
        return id;
    }
}
