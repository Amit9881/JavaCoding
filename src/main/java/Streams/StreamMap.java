package Streams;
import java.util.*;

public class StreamMap {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(12,24,36,48);

        arr.stream()
                .map(n -> n/2)
                .forEach(n -> System.out.println(n));
    }
}
