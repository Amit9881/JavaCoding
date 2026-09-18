package Interface;

public class hdfc implements bank{

    @Override
    public void balance(){
        System.out.println("Balance is 90000");
    }

    @Override
    public void rate(){
        System.out.println("Rate is 9.88%");
    }

    public static void main(String[] args){
        hdfc hd = new hdfc();
        hd.balance();
        hd.rate();
    }

}
