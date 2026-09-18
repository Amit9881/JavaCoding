package exception;

public class finallyClass {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        try{
            System.out.println(arr[5]);
        }catch(Exception e){
            System.out.println(e + "error");
        }finally{
            System.out.println("every time executed");
        }
    }
}
