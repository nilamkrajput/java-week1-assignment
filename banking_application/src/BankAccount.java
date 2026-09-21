import java.util.ArrayList;
public class BankAccount {

    private  double balance;
    private static final double MINIMUM_BALANCE = 500.00;
    private ArrayList<String> transactionHistory;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
        transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }

        balance += amount;

        transactionHistory.add(String.format("Deposited: %.2f | Balance %.2f", amount, balance));
        System.out.printf("Deposit successful!%nUpdated Balance: %.2f%n", balance);
    }

    public void withdraw(double amount){
       if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }

        if(balance - amount < MINIMUM_BALANCE){
            throw new IllegalArgumentException("Withdrawal denied. Please maintain minimum balance 500.00");
        }

        balance = balance - amount;
        transactionHistory.add(String.format("Withdrawn: %.2f | Balance %.2f", amount, balance));
        System.out.printf("Withdrawal successfull!%nUpdated Balance: %.2f%n", balance);
    }

    public double getBalance(){
        return balance;
    }

    public void showTransactionHistory(){
       
        if(transactionHistory.isEmpty()){
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("\n----- Transaction History -----");

        for(String transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
    
}
