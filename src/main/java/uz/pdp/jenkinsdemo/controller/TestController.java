package uz.pdp.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/login")
    public String login(){
        System.out.println("hello world");
        return "Successfully login";
    }
}
