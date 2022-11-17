package com.junit;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
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


}




