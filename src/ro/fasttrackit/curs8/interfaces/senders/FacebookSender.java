package ro.fasttrackit.curs8.interfaces.senders;

import ro.fasttrackit.curs8.interfaces.MessageSender;

public class FacebookSender implements MessageSender {
    public void send(String msg) {
        System.out.println("Sending over FaceBook " + msg);
    }

    public int getCost() {
        return 10;
    }
}
