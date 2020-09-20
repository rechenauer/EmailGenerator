package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive die firstname and the lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the apartment and return it
        this.department = setDepartment();
    }

    //Ask for the department
    private String setDepartment() {
        String decision;
        System.out.println("Enter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 0:
                return "none";
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "";

        }

    }

    //Generate random password

    //Set the mailbox capacity

    //Set alternate email

    //Set password

}
