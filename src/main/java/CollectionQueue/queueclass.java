package CollectionQueue;
import java.util.*;

public class queueclass {

    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        q.add("Amit");
        q.add("Aamr");

        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.contains("amit"));
    }

}
