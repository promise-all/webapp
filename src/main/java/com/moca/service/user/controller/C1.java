package com.moca.service.user.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class C1 {

    private ApplicationContext context;

    @ResponseBody
    @GetMapping("/login")
    public String login() {
        return "1234";
    }
}
