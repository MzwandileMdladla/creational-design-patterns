package singleton;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
public class DbSingleton {

    private static DbSingleton instance =  new DbSingleton();

    public DbSingleton getInstance() {
        return instance;
    }
}
