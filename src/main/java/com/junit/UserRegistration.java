package com.junit;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static ArrayList<String> list = new ArrayList<>();
    public static String validFirstName(String name) {
        boolean result = validName(name);
        System.out.println("First name: " + name + " ==> " + result);
        if (result == true) {

            return name;
        }

        return null;
    }
    public static String validLastName(String name) {
        boolean result = validName(name);
        System.out.println("Last name: " + name + " ==> " + result);
        if (result == true) {

            return name;
        }

        return null;
    }

    private static boolean validName(String name) {
        boolean result = false;
        String regex = "[A-Z]{1}[a-z]{3,}";// {3,} means above 3
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < name.length(); i++) {
            Matcher matcher = pattern.matcher(name);
            result = matcher.matches();
        }

        return result;
    }
    public static String validEmail(String list) {
        boolean result = false;

        UserRegistration.list.add("abc@yahoo.com");
        UserRegistration.list.add("abc-100@yahoo.com");
        UserRegistration.list.add("abc111@abc.com");
        UserRegistration.list.add("abc.100@yahoo.com");
        UserRegistration.list.add("abc-100@abc.net");
        UserRegistration.list.add("abc.100@abc.com.au");
        UserRegistration.list.add("abc@1.com");
        UserRegistration.list.add("abc@gmail.com.com");
        UserRegistration.list.add("abc+100@gmail.com");

        String regex = "^[a-z0-9+_.-]+@+[a-z]+.+[a-z]";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 3; i < UserRegistration.list.size(); i++) {
            Matcher matcher = pattern.matcher(UserRegistration.list.get(i));
            result = matcher.matches();
            System.out.println("The email " + UserRegistration.list.get(i) + " is  ==> " + result);
        }
        for (int i = UserRegistration.list.size() - 1; i > 1; i--) {
            UserRegistration.list.remove(i);
        }
        if (result == true) {

            return list;
        }

        return null;
    }
    public static String validPhoneNumber(String phoneNumber){
        boolean result = false;
//        String phoneNumber = "+91 7995491772";
        String regex = "[+91]+() +[789][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < phoneNumber.length(); i++) {
            Matcher matcher = pattern.matcher(phoneNumber);
            result = matcher.matches();
        }
        System.out.println("\nThe phone number is: " + phoneNumber + " ==> " + result);


    if (result == true) {

        return phoneNumber;
    }

        return null;
    }

}





