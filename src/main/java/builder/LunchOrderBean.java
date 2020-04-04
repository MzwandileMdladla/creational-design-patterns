package builder;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@NoArgsConstructor
@Getter
@Data
public class LunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;
}
