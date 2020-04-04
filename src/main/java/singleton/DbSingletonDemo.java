package singleton;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = new DbSingleton().getInstance();
        System.out.println(instance);
    }
}
