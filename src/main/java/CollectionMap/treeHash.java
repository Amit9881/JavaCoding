package CollectionMap;
import java.util.*;

public class treeHash {

    public static void main(String[] args) {
        Map<Integer, String> b = new TreeMap<>();
        b.put(1, "ICICI");
        b.put(2, "SBI");
        b.put(5,"BOI");
        b.put(3, "HDFC");

        System.out.println(b);

        for(Map.Entry<Integer,String> entry : b.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
