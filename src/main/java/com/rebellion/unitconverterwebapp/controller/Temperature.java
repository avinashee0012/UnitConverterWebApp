package com.rebellion.unitconverterwebapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rebellion.unitconverterwebapp.entity.FormInput;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Temperature {

    @PostMapping("temperature")
    public String postTemperatureForm(@RequestBody FormInput formInput) {
        double result = 0;

        switch (formInput.getFrom()) {
            case "C":
                // 1 c = 1 c
                switch (formInput.getTo()) {
                    case "C":
                        result = Double.parseDouble(formInput.getInput());
                        break;
                    case "F":
                        result = Double.parseDouble(formInput.getInput()) * 9.0/5 + 32;
                        break;
                    case "K":
                        result = Double.parseDouble(formInput.getInput())  + 273.15;
                        break;
                }
                break;
            case "F":
                // 1 c = 1 c
                switch (formInput.getTo()) {
                    case "C":
                        result = (Double.parseDouble(formInput.getInput()) - 32) * 5.0 / 9;
                        break;
                    case "F":
                        result = Double.parseDouble(formInput.getInput());
                        break;
                    case "K":
                        result = (Double.parseDouble(formInput.getInput()) - 32) * 5.0 / 9 + 273.15;
                        break;
                }
                break;
            case "K":
                // 1 c = 1 c
                switch (formInput.getTo()) {
                    case "C":
                        result = Double.parseDouble(formInput.getInput()) - 273.15;
                        break;
                    case "F":
                        result = (Double.parseDouble(formInput.getInput()) - 273.15) * 9.0/5 + 32;
                        break;
                    case "K":
                        result = Double.parseDouble(formInput.getInput());
                        break;
                }
                break;
        }

        String resultString = (result - Math.floor(result) == 0) ? String.valueOf((int) result)
                : String.format("%.3f", result);

        return formInput.getInput() + " " + formInput.getFrom() + " = " + resultString + " " + formInput.getTo();
    }
}
