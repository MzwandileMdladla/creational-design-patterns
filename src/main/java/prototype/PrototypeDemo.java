package prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class PrototypeDemo {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");

        log.debug(String.valueOf(movie));
        log.debug(movie.getRuntime());
        log.debug(movie.getTitle());
        log.debug(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        log.debug(String.valueOf(anotherMovie));
        log.debug(anotherMovie.getRuntime());
        log.debug(anotherMovie.getTitle());
        log.debug(anotherMovie.getUrl());

    }
}
