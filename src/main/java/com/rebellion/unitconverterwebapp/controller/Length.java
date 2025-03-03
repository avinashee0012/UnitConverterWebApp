package com.rebellion.unitconverterwebapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rebellion.unitconverterwebapp.entity.FormInput;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Length {
    
    @PostMapping("length")
    public String postLengthForm(@RequestBody FormInput formInput) {
        return formInput.toString();
    }
}
