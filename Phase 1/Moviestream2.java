

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Moviestream2 {
    public static void main(String[] ar) {

        List<Movie> movies = Arrays.asList(
                new Movie("Basha", 1995, "Rajini", "Suresh Krishna")
        );

        Stream<Movie> movieStream = movies.stream();

        Stream<Movie> filteredMovies =
                movieStream.filter(m -> m.getRelease_year() == 1995);

        Stream<String> mapString =
                filteredMovies.map(m -> m.getName());

        mapString.forEach(System.out::println);

        movies.stream()
              .forEach(System.out::println);
    }
}
