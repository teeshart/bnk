import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
}
class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 50) {
            System.out.println("Deposited" + previousTransaction);
        } else if (previousTransaction < 50) {
            System.out.println("withdraw" + previousTransaction);

        } else {
            System.out.println("transaction cant happen");

        }
    }

    void showmenu() {
        String option = "\n";
        Scanner Scanner = new Scanner(System.in);
        System.out.println("welcome" + customerName);
        System.out.println("your id" + customerId);
        System.out.println("1:balance check");
        System.out.println("2:make deposit");

        do {
            System.out.println("^^^^^^^^^^");
            System.out.println("Enter your option");
            System.out.println("^^^^^^^");

            switch (option) {
                case "1" :
                    ;
                    System.out.println("...............");
                    System.out.println("balance" + balance);
                    System.out.println("...............");

               ; case "2" :
                    ;
                    System.out.println("...............");
                    System.out.println("make deposit" + balance);
                    System.out.println("...............");

                    int amount = Scanner.nextInt();
                    deposit(amount);

            } ;
        }
        while (option !="3");
        System.out.println("Thanks for banking with us");
    }
}
