public class reverseString {
    public static void main(String[] args){
        String main = "String";
        String rev = "";

        for(int i = main.length() -1; i >= 0 ; i--){
            rev = rev + main.charAt(i);
        }

        System.out.println(rev);
    }
}
