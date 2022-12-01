package com.bridgelabz;

public class AddressBookMain {
    /**
     *This is Main Method is Used for calling the method which is present in AddressBook Class
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book ");
        AddressBook addressbook=new AddressBook();
        addressbook.contactDetail();
    }
}
