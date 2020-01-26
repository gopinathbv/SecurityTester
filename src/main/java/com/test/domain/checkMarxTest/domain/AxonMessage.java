package com.test.domain.checkMarxTest.domain;


public class AxonMessage {

    private String id;

    private String payload;

    public AxonMessage(String id, String payload) {
        this.id = id;
        this.payload = payload;
    }

    public String getId() {
        return id;
    }

    public String getPayload() {
        return payload;
    }
}
