import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Library library = new Library();

    public static void main(String[] args){

        // Sample books
        library.addBook(new Book(101, "Java Programming", "James Gosling"));
        library.addBook(new Book(102, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(103, "Effective Java", "Joshua Bloch"));
        
        boolean option = true;

        while(option){
            displayMenu();
            int choice = readInt("Enter your choice: ");

            switch(choice){
                case 1: 
                    addBook();
                    break;
                case 2:
                    library.displayAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    removeBook();
                    break;
                case 7:
                    library.displayAvailableBooks();
                    break;
                case 8:
                    library.sortBooksByTitle();
                    library.displayAllBooks();
                    break;
                case 9:
                    option = false;
                    System.out.println("Thank you for using the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1-9.");
            }
        }
        scanner.close();

    }

    
    private static void displayMenu() {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. Remove Book");
        System.out.println("7. View Available Books");
        System.out.println("8. Sort Books by Title");
        System.out.println("9. Exit");
        System.out.println("=====================================");
    }

    private static void addBook(){
        System.out.println("\n===== Add New Book =====");
        int id = readInt("Enter Book ID : ");
        if(library.findBookById(id) != null){
            System.out.println("A book with this ID already exists");
            return;
        }
        System.out.print("Enter book title : ");
        String title = scanner.nextLine();

        System.out.print("Enter book author name : ");
        String author = scanner.nextLine();

        Book book = new Book(id, title, author);
        if(library.addBook(book)){
            System.out.println("Book added successfully.");
        }
        else{
            System.out.println("Failed to add the book.");
        }

    }

    
    private static void searchBook(){

        System.out.println("\n===== Search book =====");
        System.out.println("1. Search by ID : ");
        System.out.println("2. Search by Title : ");
        int choice = readInt("Enter your choice : ");

        if(choice == 1){
            int id = readInt("Enter book ID : ");
            Book book = library.findBookById(id);
            if(book != null){
                System.out.println("Book found : ");
                System.out.println(book);
            }
            else{
                
                System.out.println("No book found with ID : " + id);

            }
        }
        else if(choice == 2){
            System.out.print("Enter title or keyword : ");
            String title = scanner.nextLine();
            
            List<Book> result = library.findBookByTitle(title);
            if(result.isEmpty()){
                System.out.println("No books found with title : " + title);
            }
            else{
                System.out.println("===== Search Result =====");
                for(Book book : result){
                    System.out.println(book);
                }
            }  
        }
        else{
            System.out.println("Please select valid search option.");
        }
    }

    private static void issueBook(){
        System.out.println("\n===== Issue Book =====");
        int id = readInt("Enter book ID to issue : ");
        
        Book book = library.findBookById(id);
        
        if(book == null){
            System.out.println("Sorry, this book is not available.");
            return;
        }    
        if(!book.isAvailable()){
            System.out.println("Sorry, this book is already issued.");
            return;
        }
        if(library.issueBook(id)){
            System.out.println("Book issued successfully!");
            System.out.println("Issued Book: " + book.getTitle());
        }
    }

    private static void returnBook(){
        System.out.println("===== Return Book =====");
        int id = readInt("Enter book ID to return : ");

        Book book = library.findBookById(id);
        if(book == null){
            System.out.println("Book not found.");
            return;
        }
        if(book.isAvailable()){
            System.out.println("This book has not been issued.");
        }
        if(library.returnBook(id)){
            System.out.println("Book returned successfully!");
            System.out.println("Returned book: " + book.getTitle());
        }

    }

    public static void removeBook(){
        System.out.println("===== Remove Book =====");

        int id = readInt("Enter book ID to remove ");

        Book book = library.findBookById(id);   
        
        if(book == null){
            System.out.println("Book not found");
            return;
        }
        if(!book.isAvailable()){
            System.out.println("Cannot remove issued book.");
            return;
        }
        if(library.removeBook(id)){
            System.out.println("Book removed successfully!");
        } 
        else{
            System.out.println("Failed to remove the book.");
        }  
    }
    
    private static int readInt(String message){
        while(true){
            System.out.print(message);
            try{
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a valid number.");
            }
        }
    }
    
}
