package com.example;

public class HelloWorld {
    // Instance method for testability
    public String getMessage() {
        return "Hello, World!"; // Updated to match the expected string in the test
    }

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.getMessage());
    }
}
