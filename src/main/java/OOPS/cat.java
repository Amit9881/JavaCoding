package OOPS;

public class cat extends animal{
    void sleeping(String s){
        System.out.println(s + " is sleepy cat");
    }

    public static void main(String[] args){
        cat c = new cat();
        c.behave();
        c.name = "maggi";
        c.sleeping(c.name);

    }

}
