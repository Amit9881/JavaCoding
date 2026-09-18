package methods;

public class methodWithPara {

    public void name(String n){
        System.out.println("My self " + n);
    }

    public static void main(String[] args){
        methodWithPara m = new methodWithPara();
        m.name("Amit");
    }
}
