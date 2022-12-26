package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    /**
     *Using the  hash map for to store multiple Address Book Here
     */
    HashMap<String, ArrayList> map = new HashMap<>();
    OperateAddressBook main = new OperateAddressBook();
    Scanner input = new Scanner(System.in);
    public void addressBooksAdd() {
    /**
    *Creating the Method for  store details of first person name
    **/
    int number = 1;
    while (number == 1) {
        System.out.println("1.Add Address Book In System");
        System.out.println("2.Exit From Address book system");
        System.out.println();
        System.out.print("Please Enter choice 1 or 2 = ");
        number = input.nextInt();
        if (number == 1) {
        System.out.print("Enter Address Book Name for Create The Address Book = ");
        String name = input.next();
        if(map.containsKey(name) == false) {
            map.put(name, main.arrangeContactDetails());
        }
        else {
            System.out.println(name + " Book Name is already exits Please Enter Other Book Name");
        }

        } else {
            break;
        }
        }
        System.out.println(map);
        }
        /**
        *This is Main Method is Used for calling the method which is present in AddressBook Class
        */
        public static void main(String[] args) {
            AddressBookMain books = new AddressBookMain();
            books.addressBooksAdd();
        }
     }

