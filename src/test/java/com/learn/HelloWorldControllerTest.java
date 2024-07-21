package com.learn;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class HelloWorldControllerTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    void helloWoldEndpointRespondWithTextHelloWorld(){
        String response = httpClient.toBlocking().retrieve("/api/hello");
        Assertions.assertEquals("Hello World",response);
    }


    @Test
    void helloWorldEndpointRespondsWithStatusCode200(){
        HttpResponse<String> response = httpClient.toBlocking().exchange("/api/hello", String.class);
        Assertions.assertEquals(HttpStatus.OK, response.getStatus());
        Assertions.assertEquals("Hello World", response.getBody().get());
    }
}
