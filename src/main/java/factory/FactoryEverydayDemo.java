package factory;

import lombok.extern.slf4j.Slf4j;

import java.util.Calendar;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
@Slf4j
public class FactoryEverydayDemo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        log.debug(String.valueOf(calendar));
        log.debug(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
    }
}
