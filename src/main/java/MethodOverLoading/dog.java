package MethodOverLoading;

public class dog extends animal{

    void voice(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.voice();
        d.name = "maggi";
        System.out.println(d.name);
    }
}
