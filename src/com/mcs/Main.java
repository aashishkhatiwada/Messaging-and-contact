package com.mcs;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner     scanner = new Scanner(System.in);
 System.out.println(    "Welcome to  messaging and contact simulator application! \n");
 System.out.println("this is not a real messaging and contact application, although i have tried my best effert to make it as if it should behave like a realWorld application which could send messages, and manage contacts, however, these changes will be lost if you quit the program! \n");
System.out.println("wanna see it in action? \n press enter if so, or otherwise, hit any character followed by enter key to quit the program:");
String action = scanner.nextLine();
if(action.equals("")) menu();
else System.out.println("thanks for trying our application, good bye. \n");
}
public static void menu() {
    int option = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("select 1 of these options: \n 1: manage contacts. \n 2: send message. \n 3 or any character: quit the application.");
option = scanner.nextInt();
switch(option) {
    case 1: manageContacts();
    break;
    case 2: sendMessage();
    break;
    default: {
        System.out.println("exiting the program. \n");
        System.exit(0);
    }
    break;
}
}
public static void featureNotImplementedMessage() {
    System.out.println("this feature is not  implemented yet, check back next time! \n we are sorry for your inconvinience!");
}
public static void manageContacts() {

    //featureNotImplementedMessage();
Scanner scanner = new Scanner(System.in);
    int option = 0;
    System.out.println("select any option from the list: \n 1: show all contacts. \n 2: add new contact. \n 3: delete a contact. \n 4: search for a specific contact. \n 5: go back to previous menu.");
    option = scanner.nextInt();
    switch(option) {
        case 1: ContactModule.showAllContacts();
        break;
        case 2: ContactModule.addNewContact();
        break;
        case 3: ContactModule.deleteContact();
        break;
        case 4: ContactModule.searchContact();
        break;
        case 5: menu();
        break;
        default: {System.out.println("hey user, are you kidding me? \n what i said doesn't made sence to you? select a valid option!");
        manageContacts();
    }
    break;
    }
}
public static void sendMessage() {
    //featureNotImplementedMessage();
 Scanner scanner = new Scanner(System.in);
 int option = 0;
 System.out.println("select 1 of these options: \n 1: check messages. \n 2: send message \n 3: go back to previous menu");   
 option = scanner.nextInt();
 switch(option ) {
     case 1: MessageModule.checkMessages();
     break;
     case 2: MessageModule.sendMessage();
     break;
     case 3: menu();
     break;
     default: {
         System.out.println("invalid option. Please select a valid 1.");
         Main.sendMessage();
     }
     break;
 }
}
}