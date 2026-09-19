package CollectionMap;
import java.util.*;

public class MapClass {
    public static void main(String[] args){
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"Amit");
        m.put(2,"Amar");
        m.put(3,"guddi");
        m.put(4,"amit");

        System.out.println(m);

        System.out.println(m.get(3));
        System.out.println(m.keySet());
        System.out.println(m.values());

        for(Map.Entry<Integer,String> s : m.entrySet()){
            System.out.println(s.getKey());
            System.out.println(s.getValue());
        }

    }
}
