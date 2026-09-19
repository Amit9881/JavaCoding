package Comperator;
import java.util.*;

public class comp {
    String name;
    int age;



    public comp(String n , int i){
        this.name = n;
        this.age = i;

    }
    Comparator<comp> byname =
            (s1,s2) -> s1.name.compareTo(s2.name);

    Comparator<comp> byAge =
            (s1,s2)-> Integer.compare(s1.age,s2.age);

    public static void main(String[] args){}
    comp s1 = new comp("Amit",21);
    comp s2 = new comp("Amar",34);







}
