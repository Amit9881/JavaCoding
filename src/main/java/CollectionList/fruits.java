package CollectionList;
import java.util.*;

public class fruits {
    public static void main(String[] args){

        List<String> fr = new ArrayList<>();
        fr.add("apple");
        fr.add("orange");
        fr.add("mango");

        for(String fruits : fr){
            System.out.println(fruits);
        }
        fr.set(1,"coconut");
        System.out.println(fr);

        System.out.println(fr.size());
        System.out.println(fr.get(1));
        System.out.println(fr.contains("Mango"));

    }
}
