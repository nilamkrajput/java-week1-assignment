import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApp {

    private BankAccount account;
    private Scanner scanner;

    public BankingApp(){
        account = new BankAccount(500.00);
        scanner = new Scanner(System.in);
    }

    public void start(){
        boolean option = true;

        System.out.println("================================");
        System.out.println("       WELCOME TO BANK");
        System.out.println("================================");

        while(option){
            System.out.println("\n----- Banking Menu -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Show Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();

                switch(choice){

                    case 1: 
                        depositMoney();
                        break;

                    case 2:
                        withdrawMoney();
                        break;
                    
                    case 3:
                        showBalance();
                        break;

                    case 4:
                        showTransactionHistory();
                        break;

                    case 5: 
                        option = false;
                        System.out.println("Thank you for using our banking application");
                        break;

                    default:
                    System.out.println("Invalid choice. Please select between 1-4.");
                }

            } catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input. Please enter a numeric value.");

                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void depositMoney(){
        System.out.print("Enter deposit amount : ");

        try {
            double amount = scanner.nextDouble();
            account.deposit(amount);
            
        } catch (InputMismatchException e) {
            System.out.println(
                "Invalid input. Please enter a numeric value.");

            scanner.nextLine();
        } catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void withdrawMoney(){
        
        System.out.print("Enter withdrawal amount: ");

        try {
            double amount = scanner.nextDouble();
            account.withdraw(amount);
            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.nextLine();
        } catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showBalance(){
        System.out.printf("Current Balance: %.2f%n", account.getBalance());
    }

    public void showTransactionHistory(){
        account.showTransactionHistory();
    }
    
}
