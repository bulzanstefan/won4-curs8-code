package ro.fasttrackit.curs8.interfaces;

import ro.fasttrackit.curs8.interfaces.senders.FacebookSender;
import ro.fasttrackit.curs8.interfaces.senders.SMSSender;

public class MainSender {
    public static void main(String[] args) {
        FacebookSender facebookSender = new FacebookSender();
        MessageSender smsSender = new SMSSender();

        Expeditor expeditor = new Expeditor(smsSender);
        expeditor.sendMessage("salutare tuturor");
    }
}

class PidgeonSender implements MessageSender{
    public void send(String msg) {
        System.out.println("With pidgeon " + msg);
    }

    @Override
    public int getCost() {
        return 0;
    }
}