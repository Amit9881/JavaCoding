package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamCollects {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(10,20,20,30,33);

        List<Integer> result = arr.stream()
                .filter(n -> n%2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
