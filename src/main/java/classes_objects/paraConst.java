package classes_objects;

public class paraConst {
    String name;
    int num;

    void study(String s, int i){
        this.name = s;
        this.num = i;
        System.out.println(s + "roll number is " + i);
    }

    public static void main(String[] args){
        paraConst pc = new paraConst();
        pc.study("Amit",21);
    }
}
