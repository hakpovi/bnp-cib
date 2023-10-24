package com.sample.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/")
    @ResponseBody
    public String login(){
        return "hello world";
    }
}
