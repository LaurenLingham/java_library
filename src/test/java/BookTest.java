import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Wasp Factory", "Iain Banks", "fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("The Wasp Factory", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Iain Banks", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("fiction", book.getGenre());
    }
}
