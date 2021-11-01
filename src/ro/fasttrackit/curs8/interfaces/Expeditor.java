package ro.fasttrackit.curs8.interfaces;

import ro.fasttrackit.curs8.interfaces.senders.FacebookSender;

public class Expeditor {
    private MessageSender messageSender;

    public Expeditor(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String msg) {
        messageSender.send("My message is " + msg);
        System.out.println("M-a costat " + messageSender.getCost());
    }
}
