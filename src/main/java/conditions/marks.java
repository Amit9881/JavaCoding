package conditions;

public class marks {
    public static void main(String[] args){
        int mark = 95;
        if(mark > 90){
            System.out.println("A");
        }else if(mark >= 80){
            System.out.println("B");
        }else if(mark >=70){
            System.out.println("C");
        }else if(mark >= 60){
            System.out.println("D");
        }else if(mark >=50){
            System.out.println("E");
        }else
            System.out.println("Fail");
    }
}
