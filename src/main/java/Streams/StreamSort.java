package Streams;
import java.util.*;

public class StreamSort {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(10,20,12,4,40,50);
        arr.stream().
                sorted()
                .forEach(n -> System.out.println(n));
        System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        arr.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));

        List<String> str = Arrays.asList("amit","Amit","Amar","raghu","guddi","amit");
        str.stream()
                .sorted()
                .forEach(n -> System.out.println(n));
        System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        str.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));
    }
}
