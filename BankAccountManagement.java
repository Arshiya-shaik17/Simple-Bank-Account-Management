class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        System.out.println("Deposit: " + amount);
        balance += amount;
        display();
    }

    void withdrawal(double amount) {
        if ((balance - amount) >= 0) {
            System.out.println("Withdrawal: " + amount);
            balance -= amount;
        } else {
            System.out.println("FUNDS INSUFFICIENT");
        }
    }

    void display() {
        System.out.println("ACCOUNT NUMBER: " + accountNumber + " BALANCE: " + balance);
    }

    BankAccount() {
        accountNumber = 0;
        balance = 1000;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void addInterest(int interestRate) {
        double interest = balance * interestRate / 100;
        display();
        balance += interest;
        System.out.println("AFTER INTEREST: " + balance);
    }

    SavingsAccount() {
        interestRate = 5;
    }
}

class CheckingAccount extends BankAccount {
    double overdraftLimit;

    @Override
    void withdrawal(double amount) {
        if (amount <= balance + overdraftLimit) {
            System.out.println("Withdrawal Amount: " + amount);
            double overdraftUsed = 0;
            if (amount > balance) {
                overdraftUsed = amount - balance;
            }
            balance -= amount;
            System.out.println("Overdraft used: " + overdraftUsed);
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    CheckingAccount() {
        overdraftLimit = 500;
    }
}

class FDAccount extends BankAccount {
    int termInYears;
    double fdInterestRate;

    void calculateMaturityAccount() {
        display();
        double maturity = balance + (balance * fdInterestRate * termInYears / 100);
        System.out.println("Maturity Amount: " + maturity);
    }

    FDAccount() {
        termInYears = 2;
        fdInterestRate = 6;
        balance = 5000;
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        System.out.println("SAVINGS ACCOUNT");
        SavingsAccount SA = new SavingsAccount();
        SA.addInterest(5);

        System.out.println("\nCHECKING ACCOUNT");
        CheckingAccount CA = new CheckingAccount();
        CA.deposit(2000);
        CA.withdrawal(2500);

        System.out.println("\nFD ACCOUNT");
        FDAccount FDA = new FDAccount();
        FDA.calculateMaturityAccount();
    }
}
