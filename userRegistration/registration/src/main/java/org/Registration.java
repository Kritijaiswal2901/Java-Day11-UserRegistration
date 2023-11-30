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
}
