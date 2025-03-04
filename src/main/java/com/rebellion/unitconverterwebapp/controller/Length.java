package com.rebellion.unitconverterwebapp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.rebellion.unitconverterwebapp.entity.FormInput;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Length {

    @PostMapping("length")
    public String postLengthForm(@RequestBody FormInput formInput) {
        double result = 0;

        switch (formInput.getFrom()) {
            case "mm":
                switch (formInput.getTo()) {
                    case "mm":
                        result = Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "cm":
                // 1 cm = 10 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 10 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 10 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "m":
                // 1 m = 1000 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 1000 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 1000 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "km":
                // 1 km = 1000000 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 1000000 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 1000000 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "in":
                // 1 in = 25.4 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 25.4 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 25.4 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "ft":
                // 1 ft = 304.8 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 304.8 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 304.8 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "yd":
                // 1 yd = 914.4 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 914.4 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 914.4 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
            case "mi":
                // 1 mi = 1852001 mm
                switch (formInput.getTo()) {
                    case "mm":
                        result = 1852001 * Double.parseDouble(formInput.getInput());
                        break;
                    case "cm":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 10;
                        break;
                    case "m":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 1000;
                        break;
                    case "km":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 1000000;
                        break;
                    case "in":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 25.4;
                        break;
                    case "ft":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 304.8;
                        break;
                    case "yd":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 914.4;
                        break;
                    case "mi":
                        result = 1852001 * Double.parseDouble(formInput.getInput()) / 1852001;
                        break;
                }
                break;
        }
        String resultString = (result - Math.floor(result) == 0) ? String.valueOf((int) result) : String.format("%.3f", result);
        return formInput.getInput() + " " + formInput.getFrom() + " = " + resultString + " " + formInput.getTo();
    }
}
