package com.luxoft.java7se.exercise9.event;

import com.luxoft.java7se.exercise9.domain.Client;

public class PrintClientListener implements ClientRegistrationListener {
    @Override
    public void onClientAdded(Client client) {
        System.out.println(client);
    }
}
