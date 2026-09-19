package Streams;
import java.util.*;

public class distinctFilter {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Amit","Shambu","Amar","shambu","raghu");

        str.stream()
                .filter(n -> n.endsWith("u"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(n));
    }
}
