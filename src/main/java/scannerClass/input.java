package scannerClass;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        sc.nextLine();
        System.out.println("Enter your age :");
        sc.nextInt();

        sc.close();
    }
}
