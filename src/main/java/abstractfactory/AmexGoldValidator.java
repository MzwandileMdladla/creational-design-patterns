package abstractfactory;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
