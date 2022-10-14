import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class TitleComparatorTest {

    @Test
    void compare() {
        Movie[] movies = { new Movie("Thor, Love and Thunder", 2022, "Walt Disney Pictures" ),
                new Movie("The Lord of the Rings: The Two Towers", 2002, "New Line Cinema"),
                new Movie("Top Gun: Maverick", 2022, "Paramount Pictures" ),
                new Movie ("Cars", 2006, "Walt Disney Pictures" ) };

        Comparator<Movie> comparator = new TitleComparator();
        assert(comparator.compare(movies[0], movies[1]) > 0);   //Thor > The
        assert(comparator.compare(movies[1], movies[2]) < 0);   //The < Top
        assert(comparator.compare(movies[3], movies[3]) == 0);   //Cars == Cars

    }
}