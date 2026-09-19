package CollectionSet;
import java.util.*;

public class SetNum {
    public static void main(String[] args){
        Set<Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(null);
        num.add(null);
        //num.add(10);
        System.out.println(num);
        for(Integer no : num){
            System.out.println(no);
        }
        num.remove(null);
        System.out.println(num);
        System.out.println(num.size());

        Set<Integer> s = new HashSet<>();
        s.add(900);
        s.add(800);

        num.addAll(s);
        System.out.println(num);
        num.removeAll(s);
        System.out.println(num);




    }
}
