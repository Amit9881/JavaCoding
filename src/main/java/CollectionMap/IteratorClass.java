package CollectionMap;
import java.util.*;

public class IteratorClass {

    public static void main(String[] args){
        List<String> s = new ArrayList<>();
        s.add("amit");
        s.add("amar");
        s.add("guddi");

        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        while(it.hasNext()){
            String name = it.next();
            if(name.equals("amit")){
                it.remove();
            }

        }
        System.out.println(s);


    }
}
