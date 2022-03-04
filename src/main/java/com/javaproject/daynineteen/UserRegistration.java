package com.javaproject.daynineteen;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
//    Created the Object
    static UserRegistration userRegistration = new UserRegistration();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {;
        int option = 0;
        while(option != 6){
            option = userRegistration.showMenu();
            userRegistration.userSelection(option);
        }
    }

//    Displaying the menu
    public int showMenu(){
        System.out.println("Choose an option : \n 1.  Validate First Name \n 2. Validate Last Name \n " +
                "3. Validate Email \n 4. Validate Mobile Number \n 5. Validate Password \n " +
                "6. Exit");
        Scanner sc = new Scanner(System.in);
        return (sc.nextInt());
    }

//    Performing the Task according to the user selection
    public void userSelection(int option) {
        switch (option){
            case 1:
                System.out.println("Enter the First Name");
                userRegistration.validateFirstName(sc.next());
                break;
            case 2:
                System.out.println("Enter the Last Name");
                userRegistration.validateLastName(sc.next());
                break;
            case 3:
                System.out.println("Enter the Email");
                userRegistration.validateEmail(sc.next());
                break;
            case 4:
                System.out.println("Enter the Mobile Number");
                userRegistration.validateMobileNumber(sc.next());
                break;
            case 5:
                System.out.println("Enter the Password");
                userRegistration.validatePassword(sc.next());
                break;
            case 6:
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

//    Validating the user input and displaying the answer
    public void validateFirstName(String firstName) {
        boolean valid = Pattern.matches("[A-Z]{1}[A-Za-z]+",firstName);
        System.out.println(valid);
    }

    public void validateLastName(String lastName) {
        boolean valid = Pattern.matches("[A-Z]{1}[A-Za-z]+",lastName);
        System.out.println(valid);
    }

    public void validateEmail(String email) {
        boolean valid = Pattern.matches("^[a-zA-Z]+[-\\+\\_\\.a-zA-Z0-9]+[@][a-zA-Z0-9]+([.]?[a-zA-Z\\,]{2,3}){2}",email);
        System.out.println(valid);
    }

    public void validateMobileNumber(String mobile) {
        boolean valid = Pattern.matches("[+91|0|941]?[9876][0-9]{9}", mobile);
        System.out.println(valid);
    }

    public void validatePassword(String password) {
        boolean valid = Pattern.matches("(.{8,}[A-Z0-9]?[+.$#@!&%*]?)", password);
        System.out.println(valid);
    }
}