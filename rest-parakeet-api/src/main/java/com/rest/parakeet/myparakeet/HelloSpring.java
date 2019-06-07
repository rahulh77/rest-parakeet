package com.rest.parakeet.myparakeet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {

    @RequestMapping("/")
    public String Index() {
        return "Hello Spring - Rahul!!!!";
    }
}
