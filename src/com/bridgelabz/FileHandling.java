package com.bridgelabz;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class FileHandling {
    public void createFile() {
    /**
    *Using The Try and Catch Block for Creating the New File If File already present then print File is already exists
    */
    try {
    File myObject = new File("AddressBook.txt");
    if (myObject.createNewFile()) {
    System.out.println("File created = " + myObject.getName());
    }
    else {
    System.out.println("File already exists.");
    }
    } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
    }
    }

    public void writeContactToFile(Map<String, AddressBook> addressBookSystem) {
    /**
    *Using the StringBuffer Method and Try,Catch Block for write the Details of contacts in file
    */
    StringBuffer contactBuffer = new StringBuffer();
    for (String keyName : addressBookSystem.keySet()) {
    AddressBook addressBookObject = addressBookSystem.get(keyName);
    contactBuffer.append("Contact Details 	:\n");
    contactBuffer.append("Address Book Name :" + keyName + "\n");
    addressBookObject.getContacts().forEach((contact) -> {
    String contactString = ("FirstName :" + contact.getFirsttname().toString().concat(", "));
    contactString += ("LastName	:" + contact.getLastname().toString().concat(", "));
    contactString += ("Address	:" + contact.getAddress().toString().concat(", "));
    contactString += ("City	:" + contact.getCity().toString().concat(", "));
    contactString += ("State :" + contact.getState().toString().concat(", "));
    contactString += ("PhoneNumber :" + String.valueOf(contact.getPhonenumber()).concat(", "));
    contactString += ("Email :" + contact.getEmail().toString().concat(", "));
    contactString += ("Zip	:" + String.valueOf(contact.getZip()).concat("\n"));
    contactBuffer.append(" " + contactString);
    });
    }
    try {
    Files.write(Paths.get("AddressBook.txt"), contactBuffer.toString().getBytes());
    System.out.print("\nDetails written into file");
    }
    catch (IOException e) {
    System.out.print("Unable to write contact into file" + e.getMessage());
    }
    }
    }
