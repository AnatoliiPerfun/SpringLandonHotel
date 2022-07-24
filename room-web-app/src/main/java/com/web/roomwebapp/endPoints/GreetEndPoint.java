package com.web.roomwebapp.endPoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * @author Tolik
 * @project Spring
 * @created 7/24/2022 - 9:10 PM
 */
@Component
@Endpoint(id="greeting")
public class GreetEndPoint {

    @ReadOperation
    public String getGreeting() {
        return "Hello from actuator to you!";
    }
}
