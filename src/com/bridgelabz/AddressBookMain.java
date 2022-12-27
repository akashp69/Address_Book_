package com.bridgelabz;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
     /**
     * @author Akash Pakhare
     */
     public class AddressBookMain {
     /**
     *Using the  hash map for to store multiple Address Book Here
     */
     HashMap<String, List> books = new HashMap<>();
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
     if (books.containsKey(name) == false) {
     books.put(name, main.arrangeContactDetails());
     }
     else {
     System.out.println(name + " Book Name is already exits Please Enter Other Book Name");
     }
     } else {
     break;
     }
     }
     System.out.println(books);
     System.out.println("1.Search Contact Details Of Person By City Name ");
     System.out.println("2.Search Contact Details Of Person By State Name ");
     System.out.println("3.Exit");
     System.out.println();
     System.out.print("Enter Your Choice = ");
     int option = input.nextInt();
     while (option != 3) {
     switch (option) {
     case 1:
     System.out.print("Enter City Name for Searching the Contact Details = ");
     String cityName = input.next();
     for (List contact : books.values()) {
     List<Contacts> list = contact;
     /**
     *Here Using Stream Api For Getting the Contacts Details Of Person By Using City Name
     */
     list.stream().filter(city -> city.getCity().equalsIgnoreCase(cityName)).forEach(b -> System.out.println(b));
     }
     break;
     case 2:
     System.out.print("Enter State Name for Searching the Contact Details = ");
     String stateName = input.next();
     for (List contact : books.values()) {
     List<Contacts> list = contact;
     /**
     *Here Using Stream Api For Getting the Contacts Details Of Person By Using State Name
     */
     list.stream().filter(city -> city.getState().equalsIgnoreCase(stateName)).forEach(b -> System.out.println(b));
     }
     break;
     default:
     System.out.println("Please Enter Valid Choice ! ");
     }
     System.out.println("1.Search Contact Details Of Person By City Name ");
     System.out.println("2.Search Contact Details Of Person By State Name ");
     System.out.println("3.Exit");
     System.out.print("Enter Your Choice = ");
     option = input.nextInt();
     }
     }
     /**
     *This is Main Method is Used for calling the method which is present in AddressBook Class for that creating the object and calling the method
     *
     */
     public static void main(String[] args) {
     AddressBookMain books = new AddressBookMain();
     books.addressBooksAdd();
     }
     }

