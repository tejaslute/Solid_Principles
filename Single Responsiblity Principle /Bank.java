import java.util.Scanner;

class Customer {
    public String name;
    public int bal;

    Customer(String name) {
        this.name = name;
        this.bal = 0;
    }

    // Add getters and setters as needed...
}

class Account {
    public void openAccount(Customer c) {
        System.out.println("Account Opened with name " + c.name);
    }
}

class Loan {
    public int amount;

    Loan() {
        this.amount = 0;
    }

    public void getLoan(Customer c) {
        System.out.println("Enter the amount of loan to get: ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        c.bal += amount;
        System.out.println("Loan approved and given ");
        sc.close();
    }
}

class Balance {
    public void showBalance(Customer c) {
        System.out.println("Balance is " + c.bal);
    }

    public void debit(int money, Customer c) {
        c.bal -= money;
        System.out.println("Balance after debit is " + c.bal);
    }

    public void credit(int money, Customer c) {
        c.bal += money;
        System.out.println("Balance after credit is " + c.bal);
    }
}

public class SRP {
    private Loan loan;
    private Account account;
    private Balance balance;

    SRP() {
        this.loan = new Loan();
        this.account = new Account();
        this.balance = new Balance();
    }

    public void openAccount1(Customer c) {
        account.openAccount(c);
    }

    public void showBalance1(Customer c) {
        balance.showBalance(c);
    }

    public void credit1(Customer c) {
        balance.credit(2000, c);
    }

    public static void main(String[] args) {
        Customer c = new Customer("Tejas");
        SRP s = new SRP();

        s.openAccount1(c);
        s.showBalance1(c);
        s.credit1(c);
        s.showBalance1(c);
    }
}
