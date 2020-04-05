package factory;

/**
 * @author mzwandile on 2020/04/05
 * @project design patterns
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG : {
                return new Blog();
            }
            case SHOP : {
                return new Shop();
            }
            default : {
                return null;
            }
        }
    }
}
