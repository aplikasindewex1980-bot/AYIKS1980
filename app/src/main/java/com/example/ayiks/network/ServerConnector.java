package com.example.ayiks.network;

public class ServerConnector {

    // TODO: Set your actual server URL here
    private static final String SERVER_URL = "http://example.com/signaling";

    public ServerConnector() {
        // TODO: Initialize OkHttp client or similar
    }

    public void sendSignalingMessage(String message, String targetId) {
        // TODO: Implement sending signaling messages to the server
        // Example: Use OkHttp to post data to the SERVER_URL

    }

    public String getServerUrl() {
        return SERVER_URL;
    }
}