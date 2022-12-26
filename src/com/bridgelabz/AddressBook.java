package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

        /**
        * This Class  is Created Using For the add multiple AddressBooks
        */
        public class AddressBook {
        /**
        * ability to manage the contact details
        */
        Scanner scanner = new Scanner(System.in);
        Contacts personDetails = new Contacts();
        ArrayList<Contacts> listOfContacts = new ArrayList<>();
        public void addContactDetails() {
        System.out.print("Enter First Name of Person = ");
        String firstName = scanner.next();
        boolean status = false;
        for (Contacts contactDetails : listOfContacts) {
        if (contactDetails.getFirsttname().equals(firstName) == true) {
        status = true;
        break;
        }
        }
        if (status == true) {
        System.out.println(firstName + "Name is Already Exits Please Enter Unique Name ");
        addContactDetails();
        } else {
        personDetails.setFirstname(firstName);
        System.out.print("Enter the Last Name = ");
        personDetails.setLastname(scanner.next());
        System.out.print("Enter the Address  = ");
        personDetails.setAddress(scanner.next());
        System.out.print("Enter the City Name = ");
        personDetails.setCity(scanner.next());
        System.out.print("Enter the State Name = ");
        personDetails.setState(scanner.next());
        System.out.print("Enter the Zip Code  = ");
        personDetails.setZip(scanner.next());
        System.out.print("Enter the Phone Number =");
        personDetails.setPhonenumber(scanner.next());
        System.out.print("Enter the Email id = ");
        personDetails.setEmail(scanner.next());
        Contacts contact1 = new Contacts(personDetails.getFirsttname(), personDetails.getLastname(), personDetails.getAddress(), personDetails.getCity(), personDetails.getState(), personDetails.getZip(), personDetails.getPhonenumber(),personDetails.getEmail());
        listOfContacts.add(contact1);
        }
        }
        public void showContact() {
        /**
        *This Method is Used for showing the  contact details of persons
        */
        for (Contacts contact : listOfContacts) {
        System.out.println(contact.toString());
        }
        }
        public void editContact() {
        System.out.print("Enter first name : ");
        String firstName = scanner.next();
        int number = 0;
        for (Contacts details : listOfContacts) {
        if (details.getFirsttname().equals(firstName)) {
        listOfContacts.remove(details);
        number = 1;
        break;
        }
        }
        if (number == 0) {
        System.out.println(firstName + " Contact list Not found");
        } else {
        addContactDetails();
        System.out.println("Edit " + firstName + " contact details");
        }
        }
        public void deleteContact() {
        System.out.print("Enter first name : ");
        String firstName =scanner.next();
        int number = 0;
        for (Contacts details : listOfContacts) {
        if (details.getFirsttname().equals(firstName)) {
        listOfContacts.remove(details);
        number = 1;
        break;
        }
        }
        if (number == 0) {
        System.out.println(firstName + " Contact list not found");
        } else {
        System.out.println("Delete " + firstName + " contact details");
        }
        }
        }
