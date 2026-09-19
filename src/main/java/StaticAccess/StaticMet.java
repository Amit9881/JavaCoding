package StaticAccess;

public class StaticMet {

    static void add(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args){
        StaticMet.add(90,10);
    }
}
