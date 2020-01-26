package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.AxonMessage;
import domain.ServiceClass;

import java.io.IOException;

public class CheckmarxTester {

    private ObjectMapper mapper = new ObjectMapper();

    private ServiceClass getMessage(AxonMessage axonMessage) {
//        ServiceClass serviceClass = null;
//        try {
//            serviceClass = mapper.readValue(axonMessage.getPayload(), ServiceClass.class);
//        } catch (IOException e) {
//            return null;
//        }
//        return serviceClass;
    }
}
