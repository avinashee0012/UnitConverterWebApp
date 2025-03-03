package com.rebellion.unitconverterwebapp.entity;

public class FormInput {
    // FIELDS
    private long input;
    private String from;
    private String to;

    // CONSTRUCTOR
    public FormInput() {
    }

    public FormInput(long input, String from, String to) {
        this.input = input;
        this.from = from;
        this.to = to;
    }

    // GETTERS AND SETTERS
    public long getInput() {
        return input;
    }

    public void setInput(long input) {
        this.input = input;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "FormInput [input=" + input + ", from=" + from + ", to=" + to + "]";
    }
}
