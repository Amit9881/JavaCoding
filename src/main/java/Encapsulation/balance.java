package Encapsulation;

public class balance {

    private double balance;

    public void deposite(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("Insufficent balance");
        }
    }

    public void getBalance(){
        System.out.println(balance);
    }

}
