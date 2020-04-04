package prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class PrototypeEverydayDemo {

    public static void main(String[] args) {

        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();
        Statement firstStatement = new Statement(sql, parameters, record);
        log.debug("First statement");
        log.debug(firstStatement.getSql());
        log.debug(String.valueOf(firstStatement.getParameters()));
        log.debug(String.valueOf(firstStatement.getRecord()));

        Statement secondStatement = firstStatement.clone();
        log.debug("Second statement");
        log.debug(secondStatement.getSql());
        log.debug(String.valueOf(secondStatement.getParameters()));
        log.debug(String.valueOf(secondStatement.getRecord()));
    }
}
