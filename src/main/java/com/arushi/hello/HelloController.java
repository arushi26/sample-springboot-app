package com.arushi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /* Maps REST endpoints to methods that need to be executed when called */


    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
