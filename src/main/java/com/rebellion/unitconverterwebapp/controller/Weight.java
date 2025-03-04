package com.rebellion.unitconverterwebapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rebellion.unitconverterwebapp.entity.FormInput;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Weight {

    @PostMapping("weight")
    public String postWeightForm(@RequestBody FormInput formInput) {
        double result = 0;

        switch (formInput.getFrom()) {
            case "mg":
                // 1 mg = 1 mg
                switch (formInput.getTo()) {
                    case "mg":
                        result = Double.parseDouble(formInput.getInput());
                        break;
                    case "gm":
                        result = Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "kg":
                        result = Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "oz":
                        result = Double.parseDouble(formInput.getInput()) / 28350;
                        break;
                    case "lb":
                        result = Double.parseDouble(formInput.getInput()) / 453592;
                        break;
                }
                break;
            case "gm":
                // 1 gm = 1000 mg
                switch (formInput.getTo()) {
                    case "mg":
                        result = 1000 * Double.parseDouble(formInput.getInput());
                        break;
                    case "gm":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "kg":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "oz":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 28350;
                        break;
                    case "lb":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 453592;
                        break;
                }
                break;
            case "kg":
                // 1 kg = 1000000 mg
                switch (formInput.getTo()) {
                    case "mg":
                        result = 1000000 * Double.parseDouble(formInput.getInput());
                        break;
                    case "gm":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "kg":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "oz":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 28350;
                        break;
                    case "lb":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 453592;
                        break;
                }
                break;
            case "oz":
                // 1 oz = 28350 mg
                switch (formInput.getTo()) {
                    case "mg":
                        result = 28349.5 * Double.parseDouble(formInput.getInput());
                        break;
                    case "gm":
                        result = 28349.5 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "kg":
                        result = 28349.5 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "oz":
                        result = 28349.5 * Double.parseDouble(formInput.getInput()) / 28350;
                        break;
                    case "lb":
                        result = 28349.5 * Double.parseDouble(formInput.getInput()) / 453592;
                        break;
                }
                break;
            case "lb":
                // 1 lb = 453592 mg
                switch (formInput.getTo()) {
                    case "mg":
                        result = 453592 * Double.parseDouble(formInput.getInput());
                        break;
                    case "gm":
                        result = 453592 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "kg":
                        result = 453592 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "oz":
                        result = 453592 * Double.parseDouble(formInput.getInput()) / 28350;
                        break;
                    case "lb":
                        result = 453592 * Double.parseDouble(formInput.getInput()) / 453592;
                        break;
                }
                break;
        }

        String resultString = (result - Math.floor(result) == 0) ? String.valueOf((int) result) : String.format("%.3f", result);

        return formInput.getInput() + " " + formInput.getFrom() + " = " + resultString + " " + formInput.getTo();
    }
}
