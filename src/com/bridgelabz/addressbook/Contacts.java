package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    static Scanner scan = new Scanner(System.in);
    List<Contacts> contactsArrayList = new ArrayList<Contacts>();
    public void editContacts(){
        Contacts contacts = new Contacts();
        System.out.println("FirstName: ");
        String firstName = scan.next();
        setFirstName(firstName);
        System.out.println("LastName: ");
        String lastName = scan.next();
        setLastName(lastName);
        System.out.println("Address: ");
        String address = scan.next();
        setAddress(address);
        System.out.println("City: ");
        String city = scan.next();
        setState(city);
        System.out.println("State: ");
        String state = scan.next();
        setState(state);
        System.out.println("Zip: ");
        String zip = scan.next();
        setState(zip);
        System.out.println("phone: ");
        String phone = scan.next();
        setState(phone);
        System.out.println("Email: ");
        String email = scan.next();
        setState(email);
        System.out.println("New edited row"+toString());
        contactsArrayList.add(contacts);
    }
    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
