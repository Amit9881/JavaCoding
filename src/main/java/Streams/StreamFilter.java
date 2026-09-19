package Streams;
import java.util.*;

public class StreamFilter {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(10,21,98,28);
        arr.stream()
                .filter(n -> n %2 !=0)
                .forEach(n -> System.out.println(n));
    }
}
