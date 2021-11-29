package com.labassignment.driver;

import java.util.Scanner;

import com.labassignment.model.Employee;
import com.labassignment.service.CredentialService;

public class Driver{
    public static void main(String[] args) throws Exception {
        
        // get employee credentails
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = inp.next();
        System.out.println("Enter last name");
        String lastName = inp.next();

        System.out.println("Please select department");
        String[] deparments = {"Technical", "Admin", "Human Resources", "Legal"};
        
        // do department selection till a correct department is selected.
        boolean isSelected = false;
        int choice = -1;

        while(!isSelected){
            
            //print all departments
            for(int i=0; i < deparments.length; i++){
                System.out.println((i+1) + ". " + deparments[i].trim());
            }
            
            choice = inp.nextInt();
            
            //check department
            if (choice > deparments.length || choice < 1) {
                System.out.println("not a valid choice");
                continue;
            }
            isSelected = true;
        }

        //Services
        CredentialService credSer = new CredentialService();
        
        //Creating new employee
        Employee empl = new Employee(firstName, lastName, deparments[choice-1]);
        String email = credSer.generateEmailAddress(empl.getFirstName(), empl.getLastName(), empl.getDepartmentName());
        char[] password = credSer.generatePassword();
        
        //Show credentials
        credSer.showCredentials(empl, email, String.valueOf(password));
        inp.close(); 
    }
}

