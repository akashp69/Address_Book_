package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

     /**
     * @author Akash Pakhare
     */
     public class AddressBookMain {
         private static Scanner scanner = new Scanner(System.in);
         private static AddressBook addressbookValue = new AddressBook();
         private static AddressBookMain addressbooks = new AddressBookMain();
         private Map<String, AddressBook> addressBookMain = new HashMap<>();
         public static void main(String[] args) {
         System.out.println("Welcome to Address Book Program\n");
         addressbooks.addContacts();
         }

         /**
         *Created This Method for doing Operations in Address Book
         */
         public void addContacts() {
         System.out.println("Enter your choice");
         System.out.println("1 : Add new contact    2 : Edit contact  3 : Delete contact  4: Add Multiple Contacts 5: Display Contacts 6: Search Person 7: Person with City and State" + " 8: Count person by city and state 9: Sorted Person's by alphabetically in Address Book 10: Sorted Person's by alphabetically by City State And Zip Code"
         + " 11: write the addressbook with persons contact into text file ");
         int choice = scanner.nextInt();
         switch (choice) {
         case 1:
         /**
         *Use 1 for Add New Contacts In Address Book
         */
         List<Contacts> contacts = new ArrayList<>();
         System.out.println("Enter Your Address Book name ");
         String addresBookname = scanner.next();
         System.out.println("Enter the First Name");
         String firstName = scanner.next();
         System.out.println("Enter the Last Name");
         String lastName = scanner.next();
         System.out.println("Enter the Address Name");
         String address = scanner.next();
         System.out.println("Enter the City Name");
         String city = scanner.next();
         System.out.println("Enter the State Name");
         String state = scanner.next();
         System.out.println("Enter the Zip Code");
         String zip = scanner.next();
         System.out.println("Enter the PhoneNumber");
         String phoneNumber = scanner.next();
         System.out.println("Enter the email");
         String email = scanner.next();
         Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber,
         email);
         contacts.add(contact);
         addressbookValue.setContacts(contacts);
         addressBookMain.put(addresBookname, addressbookValue);
         addressbooks.addContacts();
         break;
         case 2:
         /**
         *Use 2 for Editing Existing Contacts In Address Book
         */
         System.out.println("Enter Your Address Book name ");
         String findAddressBook = scanner.next();
         System.out.println("Enter the name of user to Edit");
         String nameToEdit = scanner.next();
         System.out.println("Enter the First Name");
         String editFirstName = scanner.next();
         System.out.println("Enter the Last Name");
         String editLastName = scanner.next();
         System.out.println("Enter the Address Name");
         String editAddress = scanner.next();
         System.out.println("Enter the City Name");
         String editCity = scanner.next();
         System.out.println("Enter the State Name");
         String editState = scanner.next();
         System.out.println("Enter the Zip Code");
         String editZip = scanner.next();
         System.out.println("Enter the PhoneNumber");
         String editPhoneNumber = scanner.next();
         System.out.println("Enter the email");
         String editEmail = scanner.next();
         addressbooks.editPersonContacts(findAddressBook, nameToEdit, editFirstName, editLastName, editAddress, editCity,
         editState, editZip, editPhoneNumber, editEmail);
         addressbooks.addContacts();
         case 3:
         /**
         *Use 3 for Delete Contacts In Address Book
         */
         System.out.println("Enter Your Address Book name ");
         String yourBookname = scanner.next();
         System.out.println("Enter the person Name");
         String deletename = scanner.next();
         addressbooks.deleteContactDetails(deletename, yourBookname);
         addressbooks.addContacts();
         break;
         case 4:
         /**
         *Use 4 for Multiples Contacts In Address Book
         */
         addressbooks.addMultipleContacts();
         addressbooks.addContacts();
         break;
         case 5:
         /**
         *Use 5 for Display Contacts In Address Book
         */
         addressbooks.displayContacts(addressBookMain);
         addressbooks.addContacts();
         break;
         case 6:
         /**
         *Use 6 for Search Persons Contacts In Address Book By Person Name
         */
         System.out.println("Search the person in perticular city or state ");
         System.out.println("Please Enter the City Name ");
         String cityname = scanner.next();
         System.out.println("Please Enter the State Name ");
         String statename = scanner.next();
         addressbooks.searchPerson(cityname, statename);
         addressbooks.addContacts();
         break;
         case 7:
         /**
         *Use 7 for get Contacts  In Address Book by City and State Name
         */
         viewCityAndPersonAsWellAsStateAndPerson();
         addressbooks.addContacts();
         break;
         case 8:
         /**
         *Use 8 for get  Contacts In Address Book by city and state Name
         */
         addressbooks.numberOfContactsCountByCityAndState();
         addressbooks.addContacts();
         break;
         case 9:
         /**
         *Use 9 for get Contacts In Address Book by alphabetically Order
         */
         addressbooks.sortEntriesInAddressBookByName();
         addressbooks.addContacts();
         break;
         case 10:
         /**
         *Use 10 for Sorted Person's by alphabetically by City State And Zip Code
         */
         addressbooks.sortEntriesInAddressBookByCitySateAndZip();
         addressbooks.addContacts();
         break;
         case 11:
         /**
         * Using 11 for write the addressbook with persons contact into text file
         */
         FileHandling fileHandling = new FileHandling();
         fileHandling.createFile();
         fileHandling.writeContactToFile(addressBookMain);
         addressbooks.addContacts();
         break;
         default:
         System.out.println("Please Enter correct choice");
         }
         }
         /**
         *This is Method is Used for Edit Exisiting Contacts Details
         */
         public void editPersonContacts(String findAddressBook, String name, String editFirstName, String editLastName,
         String editAddress, String editCity, String editState, String editZip, String editPhoneNumber,
         String editEmail) {
         AddressBook addressbook = new AddressBook();
         AddressBook addressbookdetails = addressBookMain.get(findAddressBook);
         List<Contacts> contactDetails = addressbookdetails.getContacts();
         for (int i = 0; i <= contactDetails.size() - 1; i++) {
         Contacts contact = contactDetails.get(i);
         if (contact.getFirsttname().equals(name)) {
         contact.setFirstname(editFirstName);
         contact.setLastname(editLastName);
         contact.setAddress(editAddress);
         contact.setCity(editCity);
         contact.setPhonenumber(editPhoneNumber);
         contact.setState(editState);
         contact.setZip(editZip);
         contact.setEmail(editEmail);
         contactDetails.set(i, contact);
         addressbook.setContacts(contactDetails);
         addressBookMain.put(findAddressBook, addressbook);
         }
         }
         addressbooks.displayContacts(addressBookMain);
         }
         /**
         *This is Method is Used for Display the Contacts Details
         */
         public void displayContacts(Map<String, AddressBook> addressBookSystem) {
         for (Map.Entry<String, AddressBook> set : addressBookSystem.entrySet()) {
         AddressBook values = set.getValue();
         List<Contacts> contactDetails = values.getContacts();
         for (int i = 0; i <= contactDetails.size() - 1; i++) {
         Contacts contactperson = contactDetails.get(i);
         if (!contactperson.getFirsttname().equals("")) {
         System.out.println("Conatct Details :");
         System.out.println("Book  Name --- " + set.getKey());
         System.out.println("FirstName :" + contactperson.getFirsttname() + "      LastName :"
         + contactperson.getLastname() + "     Address :" + contactperson.getAddress()
         + "      City :" + contactperson.getCity() + "       State :" + contactperson.getState()
         + "     Zip :" + contactperson.getZip() + "     Phone Number :"
         + contactperson.getPhonenumber());
         } else {
         System.out.println("No Conatct Details available :");
         }
         }
         }
         }
         /**
         *This is Method is Used for Delete Contacts Details
         */
         public void deleteContactDetails(String name, String yourBookname) {
         AddressBook addressbook = new AddressBook();
         AddressBook values = addressBookMain.get(yourBookname);
         List<Contacts> contactDetails = values.getContacts();
         for (int i = 0; i <= contactDetails.size() - 1; i++) {
         Contacts contactperson = contactDetails.get(i);
         if (contactperson.getFirsttname().equals(name)) {
         contactDetails.remove(i);
         addressbook.setContacts(contactDetails);
         addressBookMain.put(yourBookname, addressbook);
         }
         }
         System.out.println("Contact deleted Successfully");
         }
         /**
         *This is Method is Used for Add Multiples Contacts Details
         */
         public void addMultipleContacts() {
         List<Contacts> contacts = new ArrayList<>();
         System.out.println("Enter Your Address Book name ");
         String findAddressBook = scanner.next();
         System.out.println("Enter the First Name");
         String firstName = scanner.next();
         System.out.println("Enter the Last Name");
         String lastName = scanner.next();
         System.out.println("Enter the Address Name");
         String address = scanner.next();
         System.out.println("Enter the City Name");
         String city = scanner.next();
         System.out.println("Enter the State Name");
         String state = scanner.next();
         System.out.println("Enter the Zip Name");
         String zip = scanner.next();
         System.out.println("Enter the PhoneNumber");
         String phoneNumber = scanner.next();
         System.out.println("Enter the email");
         String email = scanner.next();
         Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
         contacts.add(contact);
         addtOurAdrressBook(contact, findAddressBook);
         System.out.println("Do you want add one more Contact Details");
         System.out.println("1 :Yes     2 :No");
         int choice = scanner.nextInt();
         switch (choice) {
         case 1:
         addressbooks.addMultipleContacts();
         break;
         case 2:
         addressbooks.displayContacts(addressBookMain);
         addressbooks.addContacts();
         break;
         default:
         System.out.println("Please Enter correct choice");
         }
         addressbooks.displayContacts(addressBookMain);
         addressbooks.addContacts();
         }
         public void addtOurAdrressBook(Contacts contact, String addressBookName) {
         List<Contacts> contactsLis = new ArrayList<>();
         AddressBook Addressvalues = new AddressBook();
         boolean isKeyPresent = addressBookMain.containsKey(addressBookName);
         if (isKeyPresent) {
         AddressBook values = addressBookMain.get(addressBookName);
         List<Contacts> contactDetails = values.getContacts();
         boolean isPresent = contactDetails.stream().anyMatch(con -> con.getFirsttname().equals(contact.getFirsttname()));
         if (isPresent) {
         System.out.println("This Person Name is already Present");
         }
         else {
         contactDetails.add(contact);
         values.setContacts(contactDetails);
         addressBookMain.put(addressBookName, values);
         }
         }
         else {
         contactsLis.add(contact);
         Addressvalues.setContacts(contactsLis);
         addressBookMain.put(addressBookName, Addressvalues);
         }
         }
         /**
         *This Method is Used for Search the Person
         */
         public void searchPerson(String cityname, String statename) {
         List<Contacts> contactsList = new ArrayList<>();
         for (Map.Entry<String, AddressBook> set : addressBookMain.entrySet()) {
         AddressBook addressBook = set.getValue();
         contactsList = addressBook.getContacts();
         boolean isPresent = contactsList.stream().anyMatch(con -> con.getCity().equals(cityname) || con.getState().equals(statename));
         if (isPresent) {
         contactsList.stream().filter(s -> s.getCity().equals(cityname) || s.getState().equals(statename))
         .sorted().forEachOrdered(conts -> System.out.println("User name :" + conts.getFirsttname()));
         }
         else {
         System.out.println("This person not present in this city or state");
         }
         }
         }
         /**
         *This Method is Used for Search the Person by State and City Name
         */
         public void viewCityAndPersonAsWellAsStateAndPerson() {
         List<Contacts> contactsList = new ArrayList<>();
         for (Map.Entry<String, AddressBook> set : addressBookMain.entrySet()) {
         AddressBook addressBook = set.getValue();
         contactsList = addressBook.getContacts();
         System.out.println("Person Name and His/her city");
         contactsList.stream().forEachOrdered(con -> System.out.println(con.getFirsttname() + "     " + con.getCity()));
         System.out.println("Person Name and His/her State");
         contactsList.stream().forEachOrdered(con -> System.out.println(con.getFirsttname() + "     " + con.getState()));
         }
         }
         /**
         *This Method is Used for Search the Person and count by city and state Name
         */
         public void numberOfContactsCountByCityAndState() {
         List<Contacts> contactsList = new ArrayList<>();
         for (Map.Entry<String, AddressBook> set : addressBookMain.entrySet()) {
         AddressBook addressBook = set.getValue();
         contactsList = addressBook.getContacts();
         Map<Object, Integer> list = contactsList.parallelStream().collect(Collectors.toConcurrentMap(w -> w.getCity(), w -> 1, Integer::sum));
         Map<Object, Integer> state = contactsList.parallelStream().collect(Collectors.toConcurrentMap(w -> w.getState(), w -> 1, Integer::sum));
         System.out.println("City Name" + list.keySet() + ":  Number of persons in City " + list.values()
         + "        State Name" + state.keySet() + ":  Number of persons in State " + state.values());
         }
         }
         /**
         *This Method is Used for Sorted Entry in Address Book By Name
         */
         public void sortEntriesInAddressBookByName() {
         List<Contacts> contactsList = new ArrayList<>();
         for (Map.Entry<String, AddressBook> set : addressBookMain.entrySet()) {
         AddressBook addressBook = set.getValue();
         contactsList = addressBook.getContacts();
         System.out.println("Sorted Person's by alphabetically in Address Book");
         List<Contacts> sortedList = contactsList.stream().sorted(Comparator.comparing(Contacts::getFirsttname)).collect(Collectors.toList());
         sortedList.forEach(con -> System.out.println(con.getFirsttname()));
         }
         }
         /**
         *This Method is Used for Sorted Entry in Address Book By City ,State and Zip Code
         */
         public void sortEntriesInAddressBookByCitySateAndZip() {
         List<Contacts> contactsList = new ArrayList<>();
         for (Map.Entry<String, AddressBook> set : addressBookMain.entrySet()) {
         AddressBook addressBook = set.getValue();
         contactsList = addressBook.getContacts();
         System.out.println("Sorted Person's by alphabetically in Address Book");
         System.out.println("Sorted Person's by City Name");
         List<Contacts> sortedListCity = contactsList.stream().sorted(Comparator.comparing(Contacts::getCity)).collect(Collectors.toList());
         sortedListCity.forEach(con -> System.out.println(con.getCity()));
         System.out.println("Sorted Person's by State Name");
         List<Contacts> sortedListState = contactsList.stream().sorted(Comparator.comparing(Contacts::getCity)).collect(Collectors.toList());
         sortedListState.forEach(con -> System.out.println(con.getState()));
         System.out.println("Sorted Person's by Zip Code");
         List<Contacts> sortedListZip = contactsList.stream().sorted(Comparator.comparing(Contacts::getZip)).collect(Collectors.toList());
         sortedListZip.forEach(con -> System.out.println(con.getZip()));
         }
         }
         }