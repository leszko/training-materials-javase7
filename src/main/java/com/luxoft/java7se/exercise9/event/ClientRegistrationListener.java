package com.luxoft.java7se.exercise9.event;

import com.luxoft.java7se.exercise9.domain.Client;

public interface ClientRegistrationListener {
    void onClientAdded(Client client);
}
