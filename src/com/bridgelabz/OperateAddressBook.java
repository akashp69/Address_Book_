package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
        /**
        * Create class to manage the contact details firstname,lastname , phoneNumber,mail,city,state and zip
        */
        public class OperateAddressBook {
        public ArrayList arrangeContactDetails() {
        AddressBook book = new AddressBook();
        int option;
        do {
        System.out.println("*******Welcome to Address Book System*********");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add contact details  \n2.print contact details  \n3.Edit contact details  \n4.Delete contact details");
        System.out.print("Please Select a option = ");
        option = scanner.nextInt();
        switch (option) {
        case 1:
        System.out.print("Enter how many Persons Contacts details add = ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
        System.out.println("Enter " + i + " contact details = ");
        book.addContactDetails();
        }
        break;
        case 2:
        book.showContact();
        break;
        case 3:
        book.editContact();
        break;
        case 4:
        book.deleteContact();
        break;
        default:
        System.out.println("Enter valid details of Persons");
        break;
        }
        System.out.print("Enter the choice = 1.For Not exit  2.For Exit ");
        option =scanner.nextInt();
        }
        while (option == 1);
        return book.listOfContacts;
        }

}
