package prototype;

import lombok.Getter;

import java.util.List;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Getter
public class Statement implements Cloneable {

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    public Statement clone() {
        try{
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
