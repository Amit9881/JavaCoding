package Polyemorphism;

public class Main {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.addition(10, 20);
        obj.addition(10, 20, 30);
        obj.addition(10.5, 20.5);
    }
}
