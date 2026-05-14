package com.example;

public class helloWorld {
    // Instance method for testability
    public String getMessage() {
        return "Hello, World!"; // Updated to match the expected string in the test
    }

    public static void main(String[] args) {
        helloWorld hw = new helloWorld();
        System.out.println(hw.getMessage());
    }
}
