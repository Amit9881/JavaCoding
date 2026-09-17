package operators;

public class logical {

    public static void main(String[] args){
        int a = 20;
        int b = 20;
        int c = 20;

        if( a == b && a == c){
            System.out.println("all has same value");
        } else if(  a == b || a == c){
            System.out.println("any two values are matching");
        }else{
            System.out.println("No values are matching");
        }
    }
}
