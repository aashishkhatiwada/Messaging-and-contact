package com.mcs;

import java.util.ArrayList;
import java.util.Scanner;
import com.mcs.Message;

public class MessageModule {
    private static ArrayList<Message> messages = new ArrayList<Message>();

    public static void sendMessage() {
        // Main.featureNotImplementedMessage();
        Scanner scanner = new Scanner(System.in);
        String message = " ";
        System.out.println("type recipient's number:");
        long recipient = scanner.nextLong();
scanner.nextLine();
        System.out.println("type a message,: \n");
        
        message = scanner.nextLine();
        messages.add(new Message(recipient, message));
        System.out.println("message sent.");
        Main.sendMessage();
    }

    public static void checkMessages() {
        // Main.featureNotImplementedMessage();
        if (messages.isEmpty()) {
            System.out.println("no messages found.");
        } else {
            System.out.println("these are the messages found in our record:");
            for (Message msg : messages) {
                System.out.println("recipient:  " + msg.getPhoneNumber() + " message:" + msg.getMessage());
            }
        }
        Main.sendMessage();
    }
}
