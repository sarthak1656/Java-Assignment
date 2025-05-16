package Assignment_5;

class BankAccount {
    String accHolderName;
    String accNumber;
    char accType; // S or C
    double balance;

    void initialize(String name, String number, char type, double bal) {
        accHolderName = name;
        accNumber = number;
        accType = type;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance of Rs. 1000 required!");
        }
    }

    void display() {
        System.out.println("Name: " + accHolderName);
        System.out.println("Account No: " + accNumber);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.initialize("Riya Mohanty", "123456789", 'S', 5000);
        b.display();
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}

// Name: Riya Mohanty
// Account No: 123456789
// Account Type: S
// Balance: Rs. 5000.0
// Deposited: 2000.0
// Withdrawn: 3000.0
// Name: Riya Mohanty
// Account No: 123456789
// Account Type: S
// Balance: Rs. 4000.0

