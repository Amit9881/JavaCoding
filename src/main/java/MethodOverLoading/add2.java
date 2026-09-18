package MethodOverLoading;

public class add2 extends add1{
    void add(double a, double b){
        System.out.println(a + b);
    }

    public static void main(String[] args){
        add2 ad = new add2();
        ad.add( 40,50);
        ad.add(20.90, 30.90);
    }
}
