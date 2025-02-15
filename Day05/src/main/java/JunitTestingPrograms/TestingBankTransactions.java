package JunitTestingPrograms;

import java.util.Scanner;

public class TestingBankTransactions {

    private  double balance=1000;
    public  void deposit(double amount) {
        if (amount > 0) {
          System.out.println(balance += amount);
        } else {
            throw new IllegalArgumentException("Deposit must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
           throw new IllegalArgumentException("Insufficient FUNDS");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException(" Withdraw amount should be greater than 0");
        }
        balance -= amount;
        System.out.println(balance);
    }

    public double getBalance(){
       return balance;
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestingBankTransactions obj = new TestingBankTransactions();

        obj.deposit(1000);
        obj.withdraw(10);
    double bal=obj.getBalance();
    System.out.println("Current balance is : " + bal);

    }
}
