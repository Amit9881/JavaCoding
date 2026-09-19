public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 121;
        int temp = num;
        int sum = 0;

        int length = String.valueOf(temp).length();

        while(temp >0){
            int rem = temp%10;
            sum += Math.pow(rem, length);
            temp = temp/10;

        }

        System.out.println(sum);
        if(sum == num){
            System.out.println(num + " is a armstrong number");
        }else{
            System.out.print(num + " is not a armstrong number");
        }
    }
}
