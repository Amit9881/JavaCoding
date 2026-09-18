package OOPS;

public class gear extends car {

    void modelName(String s){
        System.out.println(s + " vechical is fast car ");
    }

    public static void main(String[] args){
        gear g = new gear();
        g.model = "F1";
        g.fourWheel();
        g.modelName(g.model);


    }
}
