package com.learn.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/api")
public class HelloController {

    @Get("/hello")
    public String helloWorld(){
        return "Hello World";
    }

}
