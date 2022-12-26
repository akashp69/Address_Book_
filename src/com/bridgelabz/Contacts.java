package com.bridgelabz;

/**
 * Using class For Create Contacts and using Private Keyword And getter&setter for Encapsulation
 */

public class Contacts {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phonenumber;
    private String email;
    public String getFirsttname() {

        return firstname;
    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {

        this.lastname = lastname;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public String getZip() {

        return zip;
    }

    public void setZip(String zip) {

        this.zip = zip;
    }

    public String getPhonenumber() {

        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {

        this.phonenumber = phonenumber;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public Contacts() {
    }
    public Contacts(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phoneNumber;
        this.email = email;
    }


    @Override
    public String toString() {
        return "ContactsDetails [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city="
                + city + ", state=" + state + ", email=" + email + ", zip=" + zip + ", phonenumber=" + phonenumber
                + "]";
    }
}
