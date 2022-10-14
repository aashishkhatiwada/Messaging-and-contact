package com.mcs;

public class Contact {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private static int numberOfContacts;
public Contact(long phoneNumber, String firstName, String lastName) {
    this.phoneNumber = phoneNumber;
    this.firstName = firstName;
    this.lastName = lastName;
    numberOfContacts++;
}
public String getName() {
    return firstName + " " + lastName;
}
public String getFirstName() {
    return firstName;
}
public String getLastName() {
    return lastName;
}
public long getNumber() {
    return phoneNumber;
}
public static int getnumberOfContacts() {
return numberOfContacts;

}
public static void setNumberOfcontacts(int numberOfContacts) {
    Contact.numberOfContacts = numberOfContacts;
}
}
