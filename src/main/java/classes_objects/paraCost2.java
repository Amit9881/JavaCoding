package classes_objects;

public class paraCost2 {

    String name;
    int num;
    int phoneNum;

    void student(String s, int i, int j){
        this.name = s;
        this.num = i;
        this.phoneNum = j;
        System.out.println(s +" is a student with roll number is " + i + " & phone number is " + j);
    }

    public static void main(String[] args){
        paraCost2 pc = new paraCost2();
        pc.student("Amit",21,583647);
        pc.student("Amar",34,637294298);
    }

}
