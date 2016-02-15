package com.luxoft.java7se.exercise9.domain;


import com.luxoft.java7se.exercise9.event.ClientRegistrationListener;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients = new ArrayList<>();

    private List<ClientRegistrationListener> listeners = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
        for (ClientRegistrationListener listener : listeners) {
            listener.onClientAdded(client);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addListener(ClientRegistrationListener listener) {
        listeners.add(listener);
    }
}
