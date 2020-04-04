package builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class BuilderLunchOrderDemo {

    public static void main(String[] args) {

        BuilderLunchOrder.Builder builder = new BuilderLunchOrder.Builder();
        BuilderLunchOrder builderLunchOrder = builder
                .setBread("Wheat")
                .setCondiments("Lettuce")
                .setDressing("Mayo")
                .setMeat("Turkey")
                .build();
        log.debug(builderLunchOrder.getBread());
        log.debug(builderLunchOrder.getCondiments());
        log.debug(builderLunchOrder.getDressing());
        log.debug(builderLunchOrder.getMeat());
    }
}
