package prototype;

import lombok.Data;
import lombok.Getter;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Getter
@Data
public class Book extends Item {
    private int numberOfPages;
}
