package prototype;

import lombok.Data;
import lombok.Getter;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Getter
@Data
public abstract class Item implements Cloneable{
    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
