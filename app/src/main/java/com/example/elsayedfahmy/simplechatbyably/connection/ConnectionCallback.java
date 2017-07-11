package com.example.elsayedfahmy.simplechatbyably.connection;

import io.ably.lib.types.AblyException;

public interface ConnectionCallback {

    void onConnectionCallback(Exception ex) throws AblyException;
}

