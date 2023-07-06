import com.lendingcatalog.model.Movie;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
    @Test
    void matchesName_ShouldReturnTrue_WhenNameMatches() {
        Movie movie = new Movie("123", "Movie Title", "Director", LocalDate.now());
        assertTrue(movie.matchesName("Movie Title"));
    }

    @Test
    void matchesName_ShouldReturnFalse_WhenNameDoesNotMatch() {
        Movie movie = new Movie("123", "Movie Title", "Director", LocalDate.now());
        assertFalse(movie.matchesName("Different Title"));
    }

    @Test
    void matchesCreator_ShouldReturnTrue_WhenDirectorMatches() {
        Movie movie = new Movie("123", "Movie Title", "Director", LocalDate.now());
        assertTrue(movie.matchesCreator("Director"));
    }

    @Test
    void matchesCreator_ShouldReturnFalse_WhenDirectorDoesNotMatch() {
        Movie movie = new Movie("123", "Movie Title", "Director", LocalDate.now());
        assertFalse(movie.matchesCreator("Different Director"));
    }

    @Test
    void matchesYear_ShouldReturnTrue_WhenYearMatches() {
        Movie movie = new Movie("123", "Movie Title", "Director", LocalDate.of(2021, 1, 1));
        assertTrue(movie.matchesYear(2021));
    }

    @Test
    void matchesYear_ShouldReturnFalse_WhenYearDoesNotMatch() {
        Movie movie = new Movie("123", "Movie Title", "Director", LocalDate.of(2021, 1, 1));
        assertFalse(movie.matchesYear(2022));
    }
}


