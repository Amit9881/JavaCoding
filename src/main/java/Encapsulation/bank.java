package Encapsulation;

public class bank extends balance {
    public static void main(String[] args){
        bank b = new bank();
        b.deposite(3000);
        b.withdraw(1000);
        b.getBalance();
    }
}
