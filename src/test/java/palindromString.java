public class palindromString {

    public static void main(String[] args){
        String str = "john";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println(str + " is palindrom string");
        }else{
            System.out.println(str + " is not a palindrom string");
        }
    }

}
