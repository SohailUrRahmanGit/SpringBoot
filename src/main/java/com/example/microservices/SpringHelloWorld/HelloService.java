package com.example.microservices.SpringHelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @RequestMapping("/")
    public String index() {
        return "Hello world 2024";
    }

    @RequestMapping("/abc")
    public  String method() {
        return "Hello ABC";
    }
}
