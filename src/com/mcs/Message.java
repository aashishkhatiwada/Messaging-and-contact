package com.mcs;

public class Message {
    private long phoneNumber;
    private String message;
    public Message(long phoneNumber, String message) {
        this.phoneNumber =phoneNumber;
        this.message = message;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public String getMessage() {
        return this.message;
    }
}
