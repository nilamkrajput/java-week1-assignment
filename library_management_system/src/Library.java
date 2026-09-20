import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
    
    public boolean addBook(Book book){
        if(findBookById(book.getId()) != null){
            return false;
        }
        books.add(book);
        return true;

    }
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books available in the library");
            return;
        }
        System.out.println("\n===== All Books =====");
        for(Book book : books){
            System.out.println(book);
        }

    }

    public Book findBookById(int id){
        for(Book book : books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public List<Book> findBookByTitle(String title){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                result.add(book);
            }
        }
        return result;
    }

    public boolean issueBook(int id){
        Book book = findBookById(id);
        if(book == null){
            return false;
        }
        if(!book.isAvailable()){
            return false;
        }
        book.setAvailable(false);
        return true;
    }

    public boolean returnBook(int id){
        Book book = findBookById(id);

        if(book == null){
            return false;
        }
        if(book.isAvailable()){
            return false;
        }
        book.setAvailable(true);
        return true;
    }

    public boolean removeBook(int id){
        Book book = findBookById(id);
        if(book == null){
            return false;
        }
        if(!book.isAvailable()){
            return false;
        }
        books.remove(book);
        return true;
    }

    public void displayAvailableBooks(){
        boolean found = false;

        System.out.println("\n===== Available Books =====");

        for(Book book : books){
            if(book.isAvailable()){
                System.out.println(book);
                found = true;
            }
        }
        if(!found){
            System.out.println("No available books.");
        }
    }

    public void sortBooksByTitle(){
        books.sort(
            Comparator.comparing(Book::getTitle,
            String.CASE_INSENSITIVE_ORDER)
            );
        System.out.println("Books sorted alphabetically by Title.");
    }
}
