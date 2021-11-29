package com.labassignment.service;

import java.util.Random;

import com.labassignment.model.Employee;

public class CredentialService {

    // Generate Email
    public String generateEmailAddress(String firstName, String lastName, String department) {
        String email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + String.join("",department.toLowerCase().split(" ")) + ".labassignment.com";
        return email;
    }  

    // Generate Password
    public char[] generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_?|+";

        String values = capitalLetters+smallLetters+numbers+specialCharacters;

        Random random = new Random();
        char[] password = new char[8];
        password[0] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
        password[1] = smallLetters.charAt(random.nextInt(smallLetters.length()));
        password[2] = numbers.charAt(random.nextInt(numbers.length()));
        password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        for (int i=4; i<8; i++){
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return password;
    }

    // Show Credentials
    public void showCredentials(Employee empl, String email, String password) {
        System.out.println("Hi " + empl.getFirstName() + " your generated credentials are: ");
        System.out.println("Email ---> " + email);
        System.out.println("Password ---> " + password);
    }
}
