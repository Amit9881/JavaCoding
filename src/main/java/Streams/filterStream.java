package Streams;
import java.util.*;

public class filterStream {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(10, 20, 30, 40);
        arr.stream()
                .filter(n -> n > 20)
                .forEach(n -> System.out.println(n));
    }

}
