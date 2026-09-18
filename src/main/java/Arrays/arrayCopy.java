package Arrays;
import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args){
        int[] arr = {10,20,20,30,34,50};
        int[] newArr = Arrays.copyOf(arr,4);

        System.out.println(Arrays.toString(newArr));
    }
}
