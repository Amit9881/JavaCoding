package Abstraction;

public class cat extends animal{
    @Override
    void name(){
        System.out.println("Name is maggi");
    }

    public static void main(String[] args){
        cat c = new cat();
        c.name();
    }

}
