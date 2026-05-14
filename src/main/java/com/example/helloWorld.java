package com.example;

public class HelloWorld {
    // Instance method for testability
    public String getMessage() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.getMessage());
    }
}