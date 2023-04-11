import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library() {
        this.books = new ArrayList<Book>();
        this.capacity = 50;
        this.booksByGenre = new HashMap<>();
    }

    public int getBooks() {
        return this.books.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
    public void addBook(Book book) {
        this.books.add(book);
        this.booksByGenre.put(book.getGenre(), 1);
    }

    public int getBooksByGenre(String fiction) {
        int numberOfBooksByGenre = booksByGenre.get(fiction);
        return numberOfBooksByGenre;
    }
}
