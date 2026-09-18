package Arrays;
import java.util.Arrays;

public class arraysBinarySearch {

    public static void main(String[] args){
        int[] num = {12 ,24,6,90,99,89,3};
        Arrays.sort(num);
        int result = Arrays.binarySearch(num, 99);

        System.out.println(result);
    }
}
