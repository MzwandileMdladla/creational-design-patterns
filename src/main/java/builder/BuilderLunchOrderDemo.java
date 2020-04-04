package builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class BuilderLunchOrderDemo {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder
                .bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey")
                .build();
        log.debug(lunchOrder.getBread());
        log.debug(lunchOrder.getCondiments());
        log.debug(lunchOrder.getDressing());
        log.debug(lunchOrder.getMeat());
    }
}
