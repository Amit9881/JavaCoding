package Streams;
import java.util.*;

public class ArrayToArrayList {
    public static void main(String[] args){
//        int[] num = {10,20,30,40};
//
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(num));
        String[] arr = {"Amit", "Rahul", "Raj", "Sneha"};

        ArrayList<String> list =
                new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);


    }
}
