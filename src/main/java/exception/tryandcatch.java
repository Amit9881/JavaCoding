package exception;
import java.lang.*;

public class tryandcatch extends Throwable {
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e){
            System.out.println("not executed" + e);
        }
    }
}
