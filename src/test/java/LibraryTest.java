import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library();
    }

    @Test
    public void hasCapacity() {
        assertEquals(50, library.getCapacity());
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBook() {
        book = new Book("The Wasp Factory", "Iain Banks", "fiction");
        library.addBook(book);
        assertEquals(1, library.getBooks());
    }

    @Test
    public void addsBookToGenreList() {
        book = new Book("The Wasp Factory", "Iain Banks", "fiction");
        library.addBook(book);
        assertEquals(1, library.getBooksByGenre("fiction"));
    }
}
