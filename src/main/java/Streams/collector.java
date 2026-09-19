package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class collector {
    public static void main(String[] args){
        List<String> str = Arrays.asList("Amar","Amit","gudi","Shambu");

        List<String> result = str.stream()
                .filter(n -> n.startsWith("A"))
                .distinct()
                .sorted()
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
