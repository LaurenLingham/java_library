import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
        book = new Book("The Wasp Factory", "Iain Banks", "fiction");
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void addsBookToGenreList() {
        library.addBook(book);
        assertEquals(1, library.getBooksByGenre("fiction"));
    }

    @Test
    public void canCheckForTitleInStockTrue() {
        library.addBook(book);
        assertEquals(true, library.hasBookWithTitle("The Wasp Factory"));
    }

    @Test
    public void canCheckForTitleInStockFalse() {
        library.addBook(book);
        assertEquals(false, library.hasBookWithTitle("Batman"));
    }

    @Test
    public void canGetNumberOfBooksByGenre() {
        library.addBook(book);
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("fiction", 1);
        assertEquals(expected, library.getNumberOfBooksByGenre());
    }
}
