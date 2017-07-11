package com.example.elsayedfahmy.simplechatbyably.connection;

import io.ably.lib.types.Message;

public interface MessageHistoryRetrievedCallback {
    void onMessageHistoryRetrieved(Iterable<Message> messages, Exception ex);
}
