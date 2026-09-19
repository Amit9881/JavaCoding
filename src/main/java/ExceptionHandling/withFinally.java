package ExceptionHandling;

public class withFinally {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[6]);
        }catch(Exception e){
            System.out.println("Error is  " + e);
        }finally{
            System.out.println("Every time executed");
        }

    }
}
