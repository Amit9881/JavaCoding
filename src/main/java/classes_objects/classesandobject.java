package classes_objects;

public class classesandobject {

    String name;
    int number;

    void run(){
        System.out.println("running the constructer");
    }

    public static void main(String[] args){
        classesandobject obj = new classesandobject();
        obj.run();
        obj.name = "AMit";
        obj.number = 984757;
        System.out.println(obj.name);
        System.out.println(obj.number);
    }

}
