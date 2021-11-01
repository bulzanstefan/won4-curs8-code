package ro.fasttrackit.curs8.interfaces.senders;

import ro.fasttrackit.curs8.interfaces.MessageSender;

public class EMailSender implements MessageSender {
    public void send(String msg) {
        System.out.println("Sending over EMAIL " + msg);
    }

    @Override
    public int getCost() {
        return 1;
    }
}
