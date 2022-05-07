package com.bridgelabz.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.addContact();
        //UC2 add contacts
        for (Contacts contacts : addressBook.contactsArrayList) {
            System.out.println("The" + contacts);
        }
        //UC3 edit contacts
        addressBook.editContacts();
        System.out.println("After editing: ");
        System.out.println("*********************");
        for (Contacts contacts:addressBook.contactsArrayList) {
            System.out.println("the"+contacts);
        }
        System.out.println("*********************");
    }
}
