package org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    
    // Use Case 1: Validate First Name
    void validateFirstName(String firstName) {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid first name");
        } else {
            System.out.println("Invalid first name");
        }
    }
     // Use Case 2 : Validate Last name
    void validateLastName(String lastName) {
        String nameRegex = "[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(lastName);

        if (matcher.matches()) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last name");
        }
    }

     // Use Case 3 : Validate email
    void validateEmail(String email) {
        String emailRegex = "[a-z0-9]+(\\.[a-z0-9]*)*@[a-z0-9]+\\.[a-z]+(\\.[a-z]*)*";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
    }

    // Use Case 4: Validate Mobile Format
    void validateMobileNumber(String mobileNumber) {

        String mobileRegex = "\\+?[1-9][0-9]{7,14}";
        Pattern pattern = Pattern.compile(mobileRegex);
        Matcher matcher = pattern.matcher(mobileNumber);

        if (matcher.matches()) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
    }

    // Use Case 5.-8: Validate password format
    void validatePassword(String password) {

        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

}
