package com.example.elsayedfahmy.simplechatbyably.connection;

import io.ably.lib.types.PresenceMessage;

public interface PresenceHistoryRetrievedCallback {
    void onPresenceHistoryRetrieved(Iterable<PresenceMessage> presenceMessages);
}