package com.rebellion.unitconverterwebapp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Index {

    @GetMapping("index")
    public String getHello(ModelAndView modelAndView) {
        return "This is index.html and should not show. This should route automatically to length.html";
    }
}
