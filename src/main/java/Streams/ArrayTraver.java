package Streams;
import java.util.*;


import java.util.List;

public class ArrayTraver {
    public static void main(String[] args){
//        int[] arr = {10,20,40,30,44,33};

        List<Integer> num = Arrays.asList(12,20,30,50,40);

        num.stream()
                .forEach(n -> System.out.println(n));
    }

}
