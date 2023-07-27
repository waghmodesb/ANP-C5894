package operators;

public class Book {
	 // Attributes
    private String title;
    private String author;
    private String isbn;
    private int year;

    // Default constructor
    public Book() {
        // Set default values
        this.title = "Untitled";
        this.author = "Unknown";
        this.isbn = "N/A";
        this.year = Year.now().getValue();
    }

    // Constructor with title, author, and isbn parameters
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = Year.now().getValue();
    }

    // Constructor with all four attributes as parameters
    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    // Getters and setters (optional)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString() method to display book information
    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nISBN: " + isbn +
                "\nYear: " + year;
    }

    // Sample usage
    public static void main(String[] args) {
        // Create a book using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        System.out.println(defaultBook);

        // Create a book with title, author, and isbn parameters
        Book bookWithParams = new Book("Java Programming", "John Doe", "978-0-123456-78-9");
        System.out.println("\nBook with Parameters:");
        System.out.println(bookWithParams);

        // Create a book with all four attributes as parameters
        Book fullBook = new Book("Object-Oriented Design", "Jane Smith", "987-6-543210-98-7", 2022);
        System.out.println("\nFull Book:");
        System.out.println(fullBook);
    }
}

	
