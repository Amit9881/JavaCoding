package Abstraction;

public class Icici extends bank{

    @Override
     void rate(double s){
        System.out.println("Rate of Interest is " + s);
    }

    public static void main(String[] args){
        Icici ic = new Icici();
        ic.inti();
        ic.rate(9.88);
    }

}
