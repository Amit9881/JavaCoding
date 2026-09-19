package CollectionMap;
import java.util.*;

public class banks {
    public static void main(String[] args){
        Map<Integer, String> b = new LinkedHashMap<>();
        b.put(1,"ICICI");
        b.put(2,"SBI");
        b.put(5,"BOI");
        b.put(3,"HDFC");

        for(Map.Entry<Integer,String> m : b.entrySet()){
            System.out.println(m.getValue());
        }
    }
}
