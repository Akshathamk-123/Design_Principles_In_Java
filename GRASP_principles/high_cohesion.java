import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }
}


// Library class
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Adds a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book);
    }

    // Removes a book from the library by title
    public boolean removeBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("Removed book: " + book);
                return true;
            }
        }
        System.out.println("Book not found: " + title);
        return false;
    }

    // Finds a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Displays all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

// Main class to test the implementation
public class high_cohesion{
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // Display all books
        library.displayBooks();

        // Find a book by title
        Book book = library.findBookByTitle("1984");
        System.out.println("Found book: " + book);

        // Remove a book by title
        library.removeBookByTitle("The Great Gatsby");

        // Display all books after removal
        library.displayBooks();
    }
}
