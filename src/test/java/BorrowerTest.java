import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower();
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        book = new Book("The Wasp Factory", "Iain Banks", "fiction");
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }
}
