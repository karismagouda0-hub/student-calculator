
package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Student Calculator");
        System.out.println("Addition: " + app.add(10, 5));
        System.out.println("Subtraction: " + app.subtract(10, 5));
        System.out.println("Multiplication: " + app.multiply(10, 5));
    }
}
