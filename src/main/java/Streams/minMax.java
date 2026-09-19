package Streams;
import java.util.*;

public class minMax {
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(10,20,40,99,69);

        int max = num.stream()
                .max(Integer :: compareTo)
                .get();

        int min = num.stream()
                .min(Integer :: compareTo)
                .get();

        int sum = num.stream()
                        .mapToInt(Integer::intValue)
                                .sum();

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
