package builder;

import lombok.Getter;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Getter
public class LunchOrderTele {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTele(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTele(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }
}
