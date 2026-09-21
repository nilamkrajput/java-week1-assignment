public class BankAccount {

    private  double balance;
    private static final double MINIMUM_BALANCE = 500.00;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;
        System.out.printf("Deposit successful!%nUpdated Balance: %.2f%n", balance);
    }

    public void withdraw(double amount){
       if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }

        if(balance - amount < MINIMUM_BALANCE){
            throw new IllegalArgumentException("Withdrawal denied. Please maintain minimum balance 500.00");
        }

        balance -= amount;
        System.out.printf("Withdrawal successfull!%nUpdated Balance: %.2f%n", balance);
    }

    public double getBalance(){
        return balance;
    }
    
}
