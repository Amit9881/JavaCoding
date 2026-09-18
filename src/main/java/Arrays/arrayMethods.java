package Arrays;
import java.util.Arrays;

public class arrayMethods {
    public static void main (String[] args){
        int[] num = {10,20,30,40};
        System.out.println(num.length);

        for(int no : num){
            System.out.println(no);
        }

        System.out.println(Arrays.toString(num));
        num[1] = 50;
        System.out.println(num[1]);
        for(int no : num){
            System.out.println(no);
        }
    }
}
