package methods;

public class methodWithStatic {
    static int add(int a, int b){
        return a +b ;
    }

    public static void main(String[] args){
        int result = add(100,20);
        System.out.println(result);
    }
}
