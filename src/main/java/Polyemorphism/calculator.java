package Polyemorphism;


class Calculator {

    // 2 integers
    void addition(int a, int b) {
        System.out.println("Addition of 2 numbers: " + (a + b));
    }

    // 3 integers
    void addition(int a, int b, int c) {
        System.out.println("Addition of 3 numbers: " + (a + b + c));
    }

    // 2 double numbers
    void addition(double a, double b) {
        System.out.println("Addition of decimal numbers: " + (a + b));
    }
}

