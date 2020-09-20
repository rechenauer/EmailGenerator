package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 8;
    private String department;
    private String companySuffix = "examplecompany.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    //Constructor to receive die firstname and the lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the apartment and return it
        this.department = setDepartment();
        System.out.println("Department: " + department);

        //Call a method that returns a random password
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine the given elements to generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println("Your email address is: " + email);
    }


    //Ask for the department
    private String setDepartment() {
        String decision;
        System.out.println("DEPARTMENT CODES: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter the department code:");
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

    //Generate random password according to the requested length
    private String generateRandomPassword(int length) {
        //characters the password can contain
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890?+-#!?§$%&/()=:;-€@";
        //Creates a char array with length "length"
        char[] pwd = new char[ length ];
        //Picks a random character from passwordSet and puts it inside the char array which represents the password
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            pwd[ i ] = passwordSet.charAt(random);
        }
        return new String(pwd);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public void changePassword(String pwd) {
        this.password = pwd;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
}
