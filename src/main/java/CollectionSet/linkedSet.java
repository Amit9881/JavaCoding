package CollectionSet;
import java.util.*;

public class linkedSet {
    public static void main(String[] args){
        Set<String> bank = new LinkedHashSet<>();
        bank.add("ICICI");
        bank.add("SBI");
        bank.add("HDFC");
        bank.add(null);

        System.out.println(bank);

        System.out.println(bank.contains("SBI"));

        Set<String> s1 = new LinkedHashSet<>();
        s1.add("BOB");
        s1.add("SBI");
        s1.add("BOI");
        bank.retainAll(s1);
        System.out.println(bank);

        bank.addAll(s1);
        System.out.println(bank);

//        bank.retainAll(s1);
//
//        System.out.println(bank);

    }
}
