package builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class LunchOrderTeleDemo {

    public static void main(String[] args) {
        LunchOrderTele lunchOrder = new LunchOrderTele("Wheat", "Lettuce", "Mayo", "Bacon");
        log.debug(lunchOrder.getBread());
        log.debug(lunchOrder.getCondiments());
        log.debug(lunchOrder.getDressing());
        log.debug(lunchOrder.getMeat());
    }
}
