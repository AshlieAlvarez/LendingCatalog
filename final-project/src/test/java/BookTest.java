import com.lendingcatalog.model.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
        @Test
        void matchesName_ShouldReturnTrue_WhenNameMatches() {
            Book book = new Book("123", "Title", "Author", LocalDate.now());
            assertTrue(book.matchesName("Title"));
        }

        @Test
        void matchesName_ShouldReturnFalse_WhenNameDoesNotMatch() {
            Book book = new Book("123", "Title", "Author", LocalDate.now());
            assertFalse(book.matchesName("Different Title"));
        }

        @Test
        void matchesCreator_ShouldReturnTrue_WhenAuthorMatches() {
            Book book = new Book("123", "Title", "Author", LocalDate.now());
            assertTrue(book.matchesCreator("Author"));
        }

        @Test
        void matchesCreator_ShouldReturnFalse_WhenAuthorDoesNotMatch() {
            Book book = new Book("123", "Title", "Author", LocalDate.now());
            assertFalse(book.matchesCreator("Different Author"));
        }

        @Test
        void matchesYear_ShouldReturnTrue_WhenYearMatches() {
            Book book = new Book("123", "Title", "Author", LocalDate.of(2021, 1, 1));
            assertTrue(book.matchesYear(2021));
        }

        @Test
        void matchesYear_ShouldReturnFalse_WhenYearDoesNotMatch() {
            Book book = new Book("123", "Title", "Author", LocalDate.of(2021, 1, 1));
            assertFalse(book.matchesYear(2022));
        }
    }

