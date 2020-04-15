package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sogumontar Hendra Simangunsong on 19/02/2020.
 */
@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @Autowired
    HelloService helloService;
    @CrossOrigin
    @GetMapping("/test")
    public String  hello(){
        return helloService.hello();
    }

}
