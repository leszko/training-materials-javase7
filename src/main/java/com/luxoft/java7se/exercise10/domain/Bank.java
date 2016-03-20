package com.luxoft.java7se.exercise10.domain;


import com.luxoft.java7se.exercise10.event.ClientRegistrationListener;
import com.luxoft.java7se.exercise10.exception.ClientExistsException;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients = new ArrayList<>();

    private List<ClientRegistrationListener> listeners = new ArrayList<>();

    public void addClient(Client client) throws ClientExistsException {
        if (clients.contains(client)) {
            throw new ClientExistsException();
        }
        clients.add(client);
        for (ClientRegistrationListener listener : listeners) {
            listener.onClientAdded(client);
        }
    }

    public void addListener(ClientRegistrationListener listener) {
        listeners.add(listener);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "clients=" + clients +
                ", listeners=" + listeners +
                '}';
    }
}
