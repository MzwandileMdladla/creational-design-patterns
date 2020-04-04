package builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class LunchOrderBeanDemo {

    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");
        log.debug(lunchOrderBean.getBread());
        log.debug(lunchOrderBean.getCondiments());
        log.debug(lunchOrderBean.getDressing());
        log.debug(lunchOrderBean.getMeat());
    }
}
