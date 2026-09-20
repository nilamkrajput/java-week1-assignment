public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
    
    /**
     * Constructor for the Book class.
     * @param id
     * @param title
     * @param author
     */
    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    /**
     * Getter for the book ID.
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for the book title.
     * @return
     */
    public String getTitle(){
        return title;
    }

    /**
     * Getter for the book author.
     * @return
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Getter for the availability status of the book.
     * @return
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Setter for the availability status of the book.
     * @param available
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Title: %s | Author: %s | Status: %s",
            id,
            title,
            author,
            isAvailable ? "Available" : "Issued"
        );
    }
    
}
