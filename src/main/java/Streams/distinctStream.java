package Streams;
import java.util.*;

public class distinctStream {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(10, 20, 11, 20, 30, 30, 33);

        arr.stream()
                .distinct()
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
