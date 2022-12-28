package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

    /**
    * @author Akash Pakhare
    */

    /**
    *Creating the Class of  AddressBookRegex in that Class Using Regular Expression for Taking  Valid Enteries of  Contacts Details
    */
    public class AddressBookRegex {
    Scanner scanner = new Scanner(System.in);
    /**
    *Creating the method for Enter Valid First Name of Person
    */
    public String validFirstName() {
    System.out.print("Enter First Name = ");
    String firstName = scanner.next();
    boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(firstName).matches();
    if (status == true) {
    System.out.println(firstName + " is Valid First Name");
    } else {
    System.out.println(firstName + " is Not Valid First Name ! Please Enter Valid First Name ");
    firstName=validFirstName();
    }
    return firstName;
    }
    /**
    *Creating the validLastName method for Enter Valid Last Name of Person
    */
    public String validLastName() {
    System.out.print("Enter Last Name = ");
    String lastName = scanner.next();
    boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(lastName).matches();
    if (status == true) {
    System.out.println(lastName + " is Valid Last Name");
    } else {
    System.out.println(lastName + " is Not Valid Last Name ! Please Enter Valid Last Name");
    validLastName();
    }
    return lastName;
    }
    /**
    *Creating the validAddress method for Enter Valid Address Details of Person
    */
    public String validAddress() {
    System.out.print("Enter Address = ");
    String address = scanner.next();
    boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(address).matches();
    if (status == true) {
    System.out.println(address + " is Valid address");
    } else {
    System.out.println(address + " is Not Valid Address");
    validAddress();
    }
    return address;
    }
    /**
    *Creating the validCity method for Enter Valid City of Person
    */
    public String validCity() {
    System.out.print("Enter city Name = ");
    String city = scanner.next();
    boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(city).matches();
    if (status == true) {
    System.out.println(city + " is Valid City");
    } else {
    System.out.println(city + " is Not Valid City ! Please Enter Valid City Name ");
    validCity();
    }
    return city;
    }
    /**
    *Creating the validState method for Enter Valid State Name of Person
    */
    public String validState() {
    System.out.print("Enter state name= ");
    String state = scanner.next();
    boolean status = Pattern.compile("[A-Z]{1}[a-z]{2,15}").matcher(state).matches();
    if (status == true) {
    System.out.println(state + " is Valid State");
    } else {
    System.out.println(state + " is Not Valid State ! Please Enter The Valid State Name");
    validState();
    }
    return state;
    }
    /**
    *Creating the validZip method for Enter Valid Zip Code of Person
    */
    public String validZip() {
    System.out.print("Enter Zip code  = ");
    String zip = scanner.next();
    boolean status = Pattern.compile("[1-9]{1}[0-9]{5}").matcher(zip).matches();
    if (status == true) {
    System.out.println(zip + " is Valid Zip Code ");
    } else {
    System.out.println(zip + " is Not Valid Zip Code ! Please Enter the Valide 6 Digit Zip Code");
    validZip();
    }
    return zip;
    }
    /**
    *Creating the validMobileNumber method for Enter Valid PhoneNumber of Person
    */
    public String validMobileNumber() {
    System.out.print("Enter mobile number (ten numbers) = ");
    String mobileNumber = scanner.next();
    boolean status = Pattern.compile("[7-9]{1}[0-9]{9}").matcher(mobileNumber).matches();
    if (status == true) {
    System.out.println(mobileNumber + " is Valid Mobile Number");
    } else {
    System.out.println(mobileNumber + " is Not Valid Mobile Number ! Please Enter 10 Digit Valid Phone Number");
    validMobileNumber();
    }
    return mobileNumber;
    }
    /**
    *Creating the validemail method for Enter Valid Email Id of Person
    */
    public String valid_email() {
    System.out.print("Enter email = ");
    String email = scanner.next();
    boolean status = Pattern.compile("[a-z]{2,20}[0-9]{0,5}[@]{1}[gmail]{5}[.]{1}[com]{3}").matcher(email).matches();
    if (status == true) {
    System.out.println(email + " is Valid Email");
    } else {
    System.out.println(email + " is Not Valid Email Id ! Please Enter The Valid Email Id Formate is google@gmail.com");
    valid_email();
    }
    return email;
    }
    }

