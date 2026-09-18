package methods;

public class methosWIthReturn {

    public int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        methosWIthReturn m = new methosWIthReturn();
        int result = m.add(10,20);
        System.out.println(result);

    }
}
