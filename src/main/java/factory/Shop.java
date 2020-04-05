package factory;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
public class Shop extends Website {
    @Override
    protected void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
