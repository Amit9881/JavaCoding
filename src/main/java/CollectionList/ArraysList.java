package CollectionList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraysList {

    public static void main(String[] args){

        List<String> name = new ArrayList<>();
        name.add("Amit");
        name.add("AMar");
        name.add("guddi");

        System.out.println(name);
        System.out.println(name.get(0));
        name.set(0,"Shambu");
        System.out.println(name.get(0));
        System.out.println(name.size());
        System.out.println(name.contains("AMar"));
        name.remove("AMar");
        System.out.println(name.contains("AMar"));

        Iterator<String> it = name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
