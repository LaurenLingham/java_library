import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();
    private int capacity = 10;
    private HashMap<String, Integer> booksByGenre = new HashMap<>();

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
    public void addBook(Book book) {
        if (getNumberOfBooks() < this.capacity) {
            this.books.add(book);
            this.booksByGenre.put(book.getGenre(), 1);
        }
    }

    public int getBooksByGenre(String fiction) {
        int numberOfBooksByGenre = booksByGenre.get(fiction);
        return numberOfBooksByGenre;
    }

    public boolean hasBookWithTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public HashMap<String, Integer> getNumberOfBooksByGenre() {
        return booksByGenre;
    }
}
