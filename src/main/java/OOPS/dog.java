package OOPS;

public class dog extends animal{
    void barking(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args){
        dog d = new dog();
        d.name = "john";
        System.out.println(d.name);
        d.barking();
        d.behave();
    }

}
