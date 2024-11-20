package org.spring.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class HelloWorldService {
    //sets the default language if no default language has been set in the property file
    @Value("${configured_language:FR}")
    private String configuredLanguage;

    //Sets a default message in case the 'native_hello_world' property is not found in the properties file
    @Value("${native_hello_world}")
    private String defaultMessage;

    @Value("${NL_hello_world}")
    private String messageNL;
    @Value("${FR_hello_world}")
    private String messageFR;
    @Value("${GER_hello_world}")
    private String messageGER;


    public String getHelloMessage() {
        String message;
        switch (configuredLanguage.toUpperCase()) {
            case "FR":
                message = messageFR;
                break;
            case "GER":
                message = messageGER;
                break;
            case "NL":
            default:
                message = messageNL;
                break;
        }
        return message;
    }
}
