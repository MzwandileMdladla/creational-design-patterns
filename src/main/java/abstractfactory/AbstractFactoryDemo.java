package abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
@Slf4j
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(700);
        CreditCard creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        log.debug(String.valueOf(creditCard.getClass()));

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard creditCard2 = abstractFactory.getCreditCard(CardType.GOLD);
        log.debug(String.valueOf(creditCard2.getClass()));
    }
}
