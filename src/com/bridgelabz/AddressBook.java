package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

        /**
        * This Class is Using For the add multiple AddressBooks
        */
        public class AddressBook {
        ArrayList<Contacts> contactDetails = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);
        static HashMap<String, ArrayList<Contacts>> hashmap = new HashMap<>();
        static AddressBook addContact = new AddressBook();

        /**
        *Create Method to add the new contacts
        **/
        public void addContactDetails() {
        Contacts contactsdetails = new Contacts();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name of person:");
        contactsdetails.setFirstname(scanner.next());
        System.out.println("Enter the Last Name of person:");
        contactsdetails.setLastname(scanner.next());
        System.out.println("Enter the Address Name of person:");
        contactsdetails.setAddress(scanner.next());
        System.out.println("Enter the City Name of person:");
        contactsdetails.setCity(scanner.next());
        System.out.println("Enter the State Name of person:");
        contactsdetails.setState(scanner.next());
        System.out.println("Enter the Email of person:");
        contactsdetails.setEmail(scanner.next());
        System.out.println("Enter the Zip code of person:");
        contactsdetails.setZip(scanner.nextInt());
        System.out.println("Enter the Phone number of person:");
        contactsdetails.setPhonenumber(scanner.nextLong());

        /**
        *To add multiple contact in the array list
        */ contactDetails.add(contactsdetails);
        System.out.println("*******************************");
        System.out.println(contactsdetails.toString());
        }

        /**
         *Created method for edit Contacts Details
         */
        public void editContactDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String name = scanner.next();
        for (int i = 0; i < contactDetails.size(); i++) {
        if (contactDetails.get(i).getFirsttname().equals(name)) {
        System.out.println("Select form below to change: ");
        System.out.println(
        "\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
        int edit = scanner.nextInt();
        switch (edit) {
        case 1:
        System.out.println("Enter first name");
        contactDetails.get(i).setFirstname(scanner.next());
        break;
        case 2:
        System.out.println("Enter Last name");
        contactDetails.get(i).setLastname(scanner.next());
        break;
        case 3:
        System.out.println("Enter address");
        contactDetails.get(i).setAddress(scanner.next());
        break;
        case 4:
        System.out.println("Enter city");
        contactDetails.get(i).setCity(scanner.next());
        break;
        case 5:
        System.out.println("Enter state");
        contactDetails.get(i).setState(scanner.next());
        break;
        case 6:
        System.out.println("Enter email");
        contactDetails.get(i).setEmail(scanner.next());
        break;
        case 7:
        System.out.println("Enter Zip");
        contactDetails.get(i).setZip(scanner.nextInt());
        break;
        case 8:
        System.out.println("Enter phone number");
        contactDetails.get(i).setPhonenumber(scanner.nextInt());
        break;
        }
        System.out.println(contactDetails);
        } else
        System.out.println("Enter valid First name");
        }
        }

        /**
        * Used deleteDetails method to delete the details of the person
        **/
        public void deleteContactDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String name = scanner.next();
        for (int i = 0; i < contactDetails.size(); i++) {
        if (contactDetails.get(i).getFirsttname().equals(name)) {
        System.out.println("Select form below to change: ");
        contactDetails.remove(i);
        }
        }
        System.out.println(contactDetails);
        }

        /**
        *Method is create for  the multiple AddressBook
        **/
        public void createAddressBook() {
        while(true){
        System.out.println("Choose what you want to do: ");
        System.out.println(
        "1.Create new address book.\n2.Edit existing address book.\n3.Display all address books.\n4.exit");
        int choose = scanner.nextInt();
        if (choose == 4){
        System.out.println("Exited");
        break;
        }
        switch (choose) {
        case 1:
        System.out.println("Enter the name of address book: ");
        String address_name = scanner.next();
        if (hashmap.containsKey(address_name)) {
        System.out.println("Adress book name exits, enter different name");
        break;
        }
        ArrayList<Contacts> new_address_book = new ArrayList<>();
        contactDetails = new_address_book;
        while (true) {
        int choose1;
        System.out.println("Choose what you want to do: ");
        System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
        choose1 = scanner.nextInt();
        if (choose1 == 4) {
        System.out.println("Exited");
        break;
        }
        switch (choose1) {
        case 1:
        addContact.addContactDetails();
        break;
        case 2:
        addContact.editContactDetails();
        break;
        case 3:
        addContact.deleteContactDetails();
        break;
        default:
        System.out.println("Choose valid option");
        break;
        }
        hashmap.put(address_name, contactDetails);
        System.out.println(hashmap);
        }
        break;

        case 2:
        System.out.println("Enter the name of address book: ");
        String address_name_old = scanner.next();

        /**
        *condition to check whether address book exists or no.
         */
        if (hashmap.containsKey(address_name_old)) {
        ArrayList<Contacts> old_address_book = new ArrayList<>();
        contactDetails = old_address_book;
        contactDetails = hashmap.get(address_name_old);
        while (true) {
        System.out.println("Choose what you want to do: ");
        System.out.println("1.Add details.\n2.Edit details.\n3.Delete contact.\n4.Exit");
        int choose2 = scanner.nextInt();
        if (choose2 == 4) {
        System.out.println("Exited");
        break;
        }
        switch (choose2) {
        case 1:
        addContact.addContactDetails();
        break;
        case 2:
        addContact.editContactDetails();
        break;
        case 3:
        addContact.deleteContactDetails();
        break;
        default:
        System.out.println("Choose valid option");
        break;
        }
        hashmap.put(address_name_old, contactDetails);
        System.out.println(hashmap);
        }
        } else {
        System.out.println("Enter valid address book name");
        }
        break;

        case 3:
        System.out.println(hashmap);
        break;

        default:
        System.out.println("Enter valid option");

        }
        }
        }

        }