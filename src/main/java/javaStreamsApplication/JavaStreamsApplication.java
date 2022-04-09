package javaStreamsApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsApplication {
    public static void main(String[] args){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Crow", 1994));
        movies.add(new Movie("Apocalypse Now", 1979));
        movies.add(new Movie("Night of the Living Dead", 1968));
        movies.add(new Movie("Brotherhood of the Wolf", 2001));

        List<Movie> newerMovies = movies.stream()
                .filter(movie -> movie.year > 1979)
                .collect(Collectors.toList());
        newerMovies.forEach(newer -> System.out.println(newer.title));
    }
}
