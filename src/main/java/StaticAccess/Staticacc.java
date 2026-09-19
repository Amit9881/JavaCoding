package StaticAccess;

public class Staticacc {
    String name;
    int roll ;
    static String clgName = "NMCOEP";

    void stu(String n, int num){
        this.name = n;
        this.roll = num;
        System.out.println(n + "is a student with "+ num +" is a roll number in " + clgName);
    }

    public static void main(String[] args){
        Staticacc st = new Staticacc();
        st.stu("Amit",21);
        st.stu("Amar",3);


    }
}
