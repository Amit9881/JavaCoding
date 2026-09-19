public class palindromNumber {
    public static void main(String[] args){
        int num = 1211;
        int temp = num;
        int rev = 0;

        while(temp >0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }

        System.out.println(rev);
        if(num == rev){
            System.out.println(num + " is a palindrom number");
        }else{
            System.out.println(num + " is a not a palindrom number");
        }
    }
}
