package com.rebellion.unitconverterwebapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rebellion.unitconverterwebapp.entity.FormInput;

@RestController
public class Temperature {
    
    @PostMapping("temperature")
    public String postLengthForm(@RequestBody FormInput formInput) {
        return formInput.toString();
    }
}