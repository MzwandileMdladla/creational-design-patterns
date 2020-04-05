package abstractfactory;

import lombok.Data;
import lombok.Getter;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
@Data
@Getter
public abstract class CreditCard {
    protected int cardNumberLength;
    protected int cvvNumber;
}
