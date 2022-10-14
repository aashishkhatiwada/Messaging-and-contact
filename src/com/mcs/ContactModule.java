package com.mcs;

import com.mcs.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactModule {
    public static ArrayList<Contact> contacts = new ArrayList<Contact>();
    private static Contact contact;

    public static void showAllContacts() {
        // Main.featureNotImplementedMessage();
        if (contacts.isEmpty()) {
            System.out.println("no contacts found!");
        } else {
            System.out.println("displaying total of " + " " + Contact.getnumberOfContacts() + " " + "contacts: \n");
            Iterator<Contact> iterator = contacts.iterator();
            while (iterator.hasNext()) {
                Contact cts = (Contact) iterator.next();
                System.out.println(" name: " + cts.getName() + "\n  mobile/phone number: " + cts.getNumber());

            }
        }

        System.out.println();
        Main.manageContacts();
    }

    public static void addNewContact() {
        // Main.featureNotImplementedMessage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter phone/mobile number: \n");
        long phoneNumber = scanner.nextLong();
        System.out.println("enter first name: \n");
        String firstName = scanner.next();
        System.out.println("enter last name: \n");
        String lastName = scanner.next();
        contacts.add(new Contact(phoneNumber, firstName, lastName));
        System.out.println("operation successful!");
        Main.manageContacts();
    }

    public static void deleteContact() {
        // Main.featureNotImplementedMessage();
        boolean match = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the full name of the contact which you want to delete: \n");
        String fullName = scanner.nextLine();
        for (Contact ct : contacts) {
            contact = ct;
            if (ct.getName().equals(fullName)) {

                match = true;
                break;

            } else
                match = false;
        }
        if (match) {
            System.out.println("we found following contact in the data base:");
            System.out.println(contact.getName() + " " + contact.getNumber());
            System.out.println("would you really like to delete this contact? hit y or n:");
            String hitResponce = scanner.next();
            if (hitResponce.equalsIgnoreCase("y")) {
                int i = contacts.indexOf(contact);
                contacts.remove(i);
                System.out.println("successfully deleted!");
                int count = Contact.getnumberOfContacts() - 1;
                Contact.setNumberOfcontacts(count);

                Main.manageContacts();
            } else {
                System.out.println("aborting operation:");

                Main.manageContacts();
            }
        }

        else if (!match) {
            System.out.println("provided details does not match with our database, please try again:");
            Main.manageContacts();

        }
    }

    public static void searchContact() {
        // Main.featureNotImplementedMessage();
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("type any contacts to search: \n");
        String searchTerm = scanner.nextLine();
        for (Contact ct : contacts) {
            contact = ct;
            if ((ct.getFirstName().startsWith(searchTerm)) || (ct.getLastName().endsWith(searchTerm))
                    || (ct.getName().contains(searchTerm))) {
                System.out.println("following contacts were found: \n " + ct.getName() + " " + ct.getNumber());
                found =true;
            } else {
                
            }
        }
        if(!found) {
            System.out.println("no matches found!");
        }
        Main.manageContacts();

    }
}
