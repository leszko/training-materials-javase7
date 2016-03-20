package com.luxoft.java7se.exercise10.event;

import com.luxoft.java7se.exercise10.domain.Client;

public class EmailNotificationListener implements ClientRegistrationListener {
    @Override
    public void onClientAdded(Client client) {
        System.out.println("Notification email for client " + client + " to be sent");
    }
}
