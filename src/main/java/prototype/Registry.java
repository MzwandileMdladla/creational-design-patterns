package prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class Registry {

    private final Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            log.error(String.valueOf(e.getStackTrace()));
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(29.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(10.99);
        book.setNumberOfPages(250);
        items.put("Book", book);

    }
}
