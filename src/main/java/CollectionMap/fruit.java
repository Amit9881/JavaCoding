package CollectionMap;
import java.util.*;

public class fruit {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1,"apple");
        m.put(2,"Orange");

        for(Map.Entry<Integer,String> e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}
