package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

     /**
     * @author Akash Pakhare
     */
     public class AddressBookMain {
     /**
     *Using the  hash map for to store multiple Address Book Here
     */
     HashMap<String, List> books = new HashMap<>();
     OperateAddressBook main = new OperateAddressBook();
     Scanner scanner = new Scanner(System.in);
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
     number = scanner.nextInt();
     if (number == 1) {
     System.out.print("Enter Address Book Name for Create The Address Book = ");
     String name = scanner.next();
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
     System.out.println("3.Getting Contacts in Sorted Order By Person Name");
     System.out.println("4.Getting Contacts in Sorted Order By City ,State or Zip Code");
     System.out.println("5.Exit");
     System.out.println();
     System.out.print("Enter Your Choice = ");
     int option = scanner.nextInt();
     while (option != 5) {
     switch (option) {
     case 1:
     System.out.print("Enter City Name for Searching the Contact Details = ");
     String cityPersons =scanner.next();
     List<Contacts> listSizeInCity = new ArrayList<>();
     for (List contact : books.values()) {
     List<Contacts> list = contact;
     /**
     *Here Using Stream Api For Getting the Count of persons present in city By Using City Name
     */
     list.stream().filter(city -> city.getCity().equalsIgnoreCase(cityPersons)).forEach(s ->listSizeInCity.add(s) );
     }
     System.out.println("Number of persons in city : " + listSizeInCity.size());
     break;
     case 2:
     System.out.print("Enter State Name for Searching the Contact Details = ");
     String statePersons =scanner.next();
     List<Contacts> listSizeInState = new ArrayList<>();
     for (List contact : books.values()) {
     List<Contacts> list = contact;
     /**
     *Here Using Stream Api For Getting the Count of persons present in state By Using State Name
     */
     list.stream().filter(state -> state.getState().equalsIgnoreCase(statePersons)).forEach(s -> listSizeInState.add(s));
     }
     System.out.println("Number of persons in state : " + listSizeInState.size());
     break;
     case 3:
     List<Contacts> contactList = new ArrayList<>();
     for (List contact : books.values()) {
     List<Contacts> list = contact;
     /**
     *Here Using Stream Api For Getting the Contact Details of person by sorted Order
     */
     list.stream().forEach(s -> contactList.add(s));
     }
     List<Contacts> sortedList = contactList.stream().sorted(Comparator.comparing(Contacts::getFirsttname)).collect(Collectors.toList());
     System.out.println(sortedList);
     break;
     case 4:
     List<Contacts> contactCityList = new ArrayList<>();
     for (List contact : books.values()) {
     List<Contacts> list = contact;
     /**
     *Here Using Stream Api For Getting the person by sorted Order by State name, city Name or Zip Code
     */
     list.stream().forEach(c -> contactCityList.add(c));
     }
     System.out.println("Sorted order by state Name = ");
     List<Contacts> stateList = contactCityList.stream().sorted(Comparator.comparing(Contacts::getState)).collect(Collectors.toList());
     System.out.println(stateList);
     System.out.println("Sorted order by city Name = ");
     List<Contacts> cityList = contactCityList.stream().sorted(Comparator.comparing(Contacts::getCity)).collect(Collectors.toList());
     System.out.println(cityList);
     System.out.println("Sorted order by zip code = ");
     List<Contacts> zipList = cityList.stream().sorted(Comparator.comparing(Contacts::getZip)).collect(Collectors.toList());
     System.out.println(zipList);
     break;
     default:
     System.out.println("Please Enter Valid Choice ! ");
     }
     System.out.println("1.Search Contact Details Of Person By City Name ");
     System.out.println("2.Search Contact Details Of Person By State Name ");
     System.out.println("4.Exit");
     System.out.print("Enter Your Choice = ");
     option =scanner.nextInt();
     }
     }
     /**
     *This is Main Method is Used for calling the method which is present in AddressBook Class for that creating the object and calling the method
     */
     public static void main(String[] args) {
     AddressBookMain books = new AddressBookMain();
     books.addressBooksAdd();
     }
     }

