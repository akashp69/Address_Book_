package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        /**
        * @author Akash Pakhare
        */
        public class AddressBook {
        /**
        *This class is Created for  Add Contacts Details, Delete Contacts Details, show  Contacts Details and  Search  the contact details
        */
        Scanner scanner = new Scanner(System.in);
        Contacts personDetails = new Contacts();
        AddressBookRegex regex = new AddressBookRegex();
        List<Contacts> listOfContacts = new ArrayList<>();
        public void addContactDetails() {
                String firstName = regex.validFirstName();
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
        personDetails.setLastname(regex.validLastName());
        personDetails.setAddress(regex.validAddress());
        personDetails.setCity(regex.validCity());
        personDetails.setState(regex.validState());
        personDetails.setZip(regex.validZip());
        personDetails.setPhonenumber(regex.validMobileNumber());
        personDetails.setEmail(regex.valid_email());
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
        /**
        *This Method is Used for editing the  contact details of Existing Person Name
        */
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
        /**
        *This Method is Used for Delete the  contact details of persons by firstname
        */
        System.out.print("Enter first name = ");
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
