package org;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     
        Registration userRegistration = new Registration();
        UserEntries entry = new UserEntries();
        Scanner scanner = new Scanner(System.in);
        //UC-1
        System.out.print("Enter first name : ");
        String firstName = scanner.next();

        entry.setFirstName(firstName);
        userRegistration.validateFirstName(entry.getFirstName());
       // scanner.close();
        
       //UC-2
       System.out.print("Enter last name : ");
       String lastName = scanner.next();

       entry.setLastName(lastName);
       userRegistration.validateLastName(entry.getLastName());

       //UC-3
       System.out.print("Enter email : ");
       String email = scanner.next();

        entry.setEmail(email);
        userRegistration.validateEmail(entry.getEmail());
     
       //UC-4
       System.out.print("Enter mobile number : ");
       String mobileNumber = scanner.next();

        entry.setMobileNumber(mobileNumber);;
        userRegistration.validateMobileNumber(mobileNumber);


}
}