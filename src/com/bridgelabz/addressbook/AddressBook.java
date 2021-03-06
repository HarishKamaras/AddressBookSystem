package com.bridgelabz.addressbook;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static Scanner scan = new Scanner(System.in);
    List<Contacts> contactsArrayList = new ArrayList<Contacts>();
    String addressBookName;
    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }
    public void addContact(){
        Contacts contacts = new Contacts();
        System.out.println("FirstName: ");
        String firstName = scan.next();
        contacts.setFirstName(firstName);
        System.out.println("LastName: ");
        String lastName = scan.next();
        contacts.setLastName(lastName);
        System.out.println("Address: ");
        String address = scan.next();
        contacts.setAddress(address);
        System.out.println("City: ");
        String city = scan.next();
        contacts.setCity(city);
        System.out.println("State: ");
        String state = scan.next();
        contacts.setState(state);
        System.out.println("Zip: ");
        String zip = scan.next();
        contacts.setZip(zip);
        System.out.println("phone: ");
        String phone = scan.next();
        contacts.setPhone(phone);
        System.out.println("Email: ");
        String email = scan.next();
        contacts.setEmail(email);
        contactsArrayList.add(contacts);
    }
    public void editContacts(){
        System.out.println("enter the first name to edit: ");
        String firstName = scan.next();
        for (Contacts contact:contactsArrayList) {
            if(firstName.equals(contact.getFirstName())){
                contact.editContacts();
                break;
            }
        }
    }

    public void deleteContacts(){
        System.out.println("Enter the Firstname to delete");
        String firstName = scan.next();
        boolean isContactthere = false;

        for(Contacts contact:contactsArrayList){
            if(firstName.equals(contact.getFirstName())){
                contactsArrayList.remove(contact);
                System.out.println("Contact Deleted");
            }
        }
    }
}
