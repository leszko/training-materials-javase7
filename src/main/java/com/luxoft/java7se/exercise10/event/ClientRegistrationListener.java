package com.luxoft.java7se.exercise10.event;

import com.luxoft.java7se.exercise10.domain.Client;

public interface ClientRegistrationListener {
    void onClientAdded(Client client);
}
