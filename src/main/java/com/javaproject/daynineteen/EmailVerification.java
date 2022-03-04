package com.javaproject.daynineteen;

import java.util.regex.Pattern;

public class EmailVerification {

    public static void main(String[] args) {
        EmailVerification emailVerification = new EmailVerification();

        String [] validEmails = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                                "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                                "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};

        String [] inValidEmails = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
                                    ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                                    "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
        emailVerification.verification(validEmails);
        emailVerification.verification(inValidEmails);
    }
//    Verifying the Emails Address
    public void verification(String [] emails) {
        for (int i=0; i < emails.length; i++){
            boolean check = Pattern.matches("^[a-zA-Z]+[-\\+\\_\\.a-zA-Z0-9]+[@][a-zA-Z0-9]+([.]?[a-zA-Z\\,]{2,3}){2}", emails[i]);
            if (check){
                System.out.println("Email is Valid " + emails[i]);
            }
            else{
                System.out.println("Email is InValid " + emails[i]);
            }
        }
    }
}
