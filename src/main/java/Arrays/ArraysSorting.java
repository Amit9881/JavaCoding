package Arrays;
import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args){
        String[] name = {"Amit","John","bob","illa"};

       // System.out.println(name[3]);
        Arrays.sort(name);
        for(String n : name){
            System.out.println(n);
        }

        int[] num = {23,34,12,1,90,25};
        //System.out.println(Arrays.sort(num));
        System.out.println(Arrays.toString(num));

    }
}
