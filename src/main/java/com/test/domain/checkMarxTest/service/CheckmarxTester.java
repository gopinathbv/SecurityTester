package com.test.domain.checkMarxTest.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.domain.checkMarxTest.domain.AxonMessage;
import com.test.domain.checkMarxTest.domain.ServiceClass;

import java.io.IOException;

public class CheckmarxTester {

    private ObjectMapper mapper = new ObjectMapper();

    private ServiceClass getMessage(AxonMessage axonMessage) {
        ServiceClass serviceClass = null;
        try {
            serviceClass = mapper.readValue(axonMessage.getPayload(), ServiceClass.class);
        } catch (IOException e) {
            return null;
        }
        return serviceClass;
    }
}
