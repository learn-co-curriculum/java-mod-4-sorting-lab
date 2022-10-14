import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class YearComparatorTest {

    @Test
    void compare() {
        Movie[] movies = { new Movie("Thor, Love and Thunder", 2022, "Walt Disney Pictures" ),
                new Movie("The Lord of the Rings: The Two Towers", 2002, "New Line Cinema"),
                new Movie("Top Gun: Maverick", 2022, "Paramount Pictures" ),
                new Movie ("Cars", 2006, "Walt Disney Pictures" ) };

        Comparator<Movie> comparator = new YearComparator();
        assert(comparator.compare(movies[0], movies[1]) > 0);   //2022 > 2002
        assert(comparator.compare(movies[1], movies[3]) < 0);   //2002 < 2006
        assert(comparator.compare(movies[0], movies[2]) == 0);   //2022 ==  2022

    }
}
