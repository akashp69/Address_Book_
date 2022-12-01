package com.bridgelabz;

import java.util.Scanner;

/**
 * This Class is Using For the add the details in contacts
 */

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contacts object = new Contacts();


    /**
     *This Method is Used For Enter Details in Contacts
     */
    public void contactDetail() {
        System.out.println("Enter Details for Creating Contacts");
        System.out.println("Enter First Name");
        object.setFirstname(scanner.next());
        System.out.println("Enter last Name");
        object.setLastname(scanner.next());
        System.out.println("Enter Address");
        object.setAddress(scanner.next());
        System.out.println("Enter State");
        object.setState(scanner.next());
        System.out.println("Enter Zip");
        object.setZip(scanner.nextInt());
        System.out.println("Enter Phone no");
        object.setPhonenumber(scanner.nextLong());
        System.out.println("Enter E-mail");
        object.setEmail(scanner.next());

        System.out.println("Check Added Contact Details");

        System.out.println("\n First Name ="+object.getFirstname());
        System.out.println("\n Last Name ="+object.getLastname());
        System.out.println("\n Address ="+object.getAddress());
        System.out.println("\n State ="+object.getState());
        System.out.println("\n Zip ="+object.getZip());
        System.out.println("\n Phone Number  ="+object.getPhonenumber());
        System.out.println("\n E-mail id ="+object.getEmail());
    }


}
