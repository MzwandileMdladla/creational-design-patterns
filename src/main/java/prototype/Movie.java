package prototype;

import lombok.Data;
import lombok.Getter;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Data
@Getter
public class Movie extends Item {
    private String runtime;
}
